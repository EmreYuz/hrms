package proje.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proje.hrms.business.abstracts.*;
import proje.hrms.business.validators.auth.CandidateValidationService;
import proje.hrms.business.validators.auth.EmployerValidationService;
import proje.hrms.core.utilities.result.*;
import proje.hrms.dataAccess.abstracts.CandidateDao;
import proje.hrms.entities.concretes.*;
import proje.hrms.entities.dtos.CvDto;

import java.util.List;

@Service
public class CandidateManager implements CandidateService {

    private CandidateDao candidateDao;
    private CandidateValidationService candidateValidationService;
    private EmployerValidationService employerValidationService;
    private CoverLetterForCvService coverLetterForCvService;
    private ForeignLanguageForCvService foreignLanguageForCVService;
    private JobExperienceForCvService jobExperienceForCVService;
    private ProgrammingSkillForCvService programmingSkillForCvService;
    private SchoolForCvService schoolForCvService;
    private UrlForCvService urlForCvService;
    private ImageForCvService imageForCvService;

    @Autowired
    public CandidateManager(CandidateDao candidateDao,
                            CandidateValidationService candidateValidationService,
                            EmployerValidationService employerValidationService,
                            CoverLetterForCvService coverLetterForCvService,
                            ForeignLanguageForCvService foreignLanguageForCVService,
                            JobExperienceForCvService jobExperienceForCVService,
                            ProgrammingSkillForCvService programmingSkillForCvService,
                            SchoolForCvService schoolForCvService,
                            UrlForCvService urlForCvService,
                            ImageForCvService imageForCvService) {

        this.candidateDao = candidateDao;
        this.candidateValidationService = candidateValidationService;
        this.employerValidationService = employerValidationService;
        this.coverLetterForCvService = coverLetterForCvService;
        this.foreignLanguageForCVService = foreignLanguageForCVService;
        this.jobExperienceForCVService = jobExperienceForCVService;
        this.programmingSkillForCvService = programmingSkillForCvService;
        this.schoolForCvService = schoolForCvService;
        this.urlForCvService = urlForCvService;
        this.imageForCvService = imageForCvService;
    }

    @Override
    public Result add(Candidate candidate) {

        if(!this.candidateValidationService.isValidated(candidate)){
            return new ErrorResult("Kullanıcı doğrulanamadı");
        }
        this.candidateDao.save(candidate);
        return new SuccessResult("Kullanıcı sisteme kaydedildi.");
    }

    @Override
    public Result update(Candidate candidate) {

        Candidate candidateToUpdate = this.candidateDao.getById(candidate.getId());

        if(!this.candidateValidationService.isValidated(candidateToUpdate)){
            return new ErrorResult("Kullanıcı doğrulanamadı");
        }
        this.candidateDao.save(candidateToUpdate);
        return new SuccessResult("Kayıt güncellendi.");
    }

    @Override
    public DataResult<List<Candidate>> getAll() {
        return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll(), "İş arayanlar listelendi.");
    }

    @Override
    public DataResult<Candidate> getById(int id) {
        return new SuccessDataResult<Candidate>(this.candidateDao.getById(id));
    }

    @Override
    public DataResult<Candidate> deleteById(int id) {
        return new SuccessDataResult<Candidate>(this.candidateDao.deleteById(id));
    }

    @Override
    public DataResult<CvDto> getCvByCandidateId(int id) {
        Candidate candidate = this.candidateDao.getById(id);
        CvDto cv = new CvDto();
        cv.setCoverLetters(candidate.getCoverLetters());
        cv.setForeignLanguages(candidate.getLanguages());
        cv.setJobExperiences(candidate.getExperiences());
        cv.setProgrammingSkills(candidate.getProgramingSkills());
        cv.setSchools(candidate.getSchools());
        cv.setUrls(candidate.getUrls());
//        cv.setImage(candidate.getImageForCv());
        return new SuccessDataResult<CvDto>(cv);
    }


}
