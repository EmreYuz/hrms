package proje.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proje.hrms.business.abstracts.AuthService;
import proje.hrms.business.abstracts.CandidateService;
import proje.hrms.business.abstracts.EmployerService;
import proje.hrms.business.validators.auth.CandidateValidator;
import proje.hrms.business.validators.auth.EmployerValidator;
import proje.hrms.core.utilities.result.ErrorResult;
import proje.hrms.core.utilities.result.Result;
import proje.hrms.core.utilities.result.SuccessResult;
import proje.hrms.dataAccess.abstracts.CandidateDao;
import proje.hrms.dataAccess.abstracts.EmployerDao;
import proje.hrms.entities.concretes.Candidate;
import proje.hrms.entities.concretes.Employer;
import proje.hrms.entities.concretes.SystemPersonnel;

@Service
public class AuthManager implements AuthService {

    private CandidateValidator candidateValidator;
    private EmployerValidator employerValidator;
    private EmployerService employerService;
    private CandidateService candidateService;

    @Autowired
    public AuthManager(CandidateValidator candidateValidator, EmployerValidator employerValidator, EmployerService employerService, CandidateService candidateService) {
        this.candidateValidator = candidateValidator;
        this.employerValidator = employerValidator;
        this.employerService = employerService;
        this.candidateService = candidateService;
    }

    @Override
    public Result registerCandidate(Candidate candidate) {

        if(!this.candidateValidator.isValidated(candidate)){
            return new ErrorResult("Kullanıcı doğrulanamadı");
        }
        this.candidateService.add(candidate);
        return new SuccessResult("Kullanıcı sisteme kaydedildi.");
    }

    @Override
    public Result registerEmployer(Employer employer, SystemPersonnel systemPersonnel) {
        if(!this.employerValidator.isValidated(employer, systemPersonnel)){
            return new ErrorResult("Kullanıcı doğrulanamadı");
        }
        this.employerService.add(employer);
        return new SuccessResult("Kullanıcı sisteme kaydedildi.");
    }

}
