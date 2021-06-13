package proje.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proje.hrms.business.abstracts.AuthService;
import proje.hrms.business.abstracts.CandidateService;
import proje.hrms.business.abstracts.EmployerService;
import proje.hrms.business.validators.auth.CandidateValidationService;
import proje.hrms.business.validators.auth.EmployerValidationService;
import proje.hrms.core.utilities.result.ErrorResult;
import proje.hrms.core.utilities.result.Result;
import proje.hrms.core.utilities.result.SuccessResult;
import proje.hrms.entities.concretes.Candidate;
import proje.hrms.entities.concretes.Employer;
import proje.hrms.entities.concretes.SystemPersonnel;

@Service
public class AuthManager implements AuthService {

    private CandidateValidationService candidateValidationService;
    private EmployerValidationService employerValidationService;
    private EmployerService employerService;
    private CandidateService candidateService;

    @Autowired
    public AuthManager(CandidateValidationService candidateValidationService,
                       EmployerValidationService employerValidationService,
                       EmployerService employerService,
                       CandidateService candidateService) {
        this.candidateValidationService = candidateValidationService;
        this.employerValidationService = employerValidationService;
        this.employerService = employerService;
        this.candidateService = candidateService;
    }

    @Override
    public Result registerCandidate(Candidate candidate) {

        if(!this.candidateValidationService.isValidated(candidate)){
            return new ErrorResult("Kullanıcı doğrulanamadı");
        }
        this.candidateService.add(candidate);
        return new SuccessResult("Kullanıcı sisteme kaydedildi.");
    }

    @Override
    public Result registerEmployer(Employer employer, SystemPersonnel systemPersonnel) {
        if(!this.employerValidationService.isValidated(employer)){
            return new ErrorResult("Kullanıcı doğrulanamadı.");
        }
        this.employerService.add(employer);
        return new SuccessResult("Kullanıcı sisteme kaydedildi.");


    }

}
