package proje.hrms.business.validators.auth;

import org.springframework.beans.factory.annotation.Autowired;
import proje.hrms.business.validators.ValidationBase;
import proje.hrms.core.utilities.adapters.services.PersonValidationService;
import proje.hrms.core.utilities.verification.EmailVerificationService;
import proje.hrms.entities.concretes.Candidate;

public class CandidateValidator extends ValidationBase {

    private PersonValidationService personValidationService;
    private EmailVerificationService emailVerificationService;

    @Autowired
    public CandidateValidator(PersonValidationService personValidationService, EmailVerificationService emailVerificationService) {
        this.personValidationService = personValidationService;
        this.emailVerificationService = emailVerificationService;
    }

    public boolean isValidated(Candidate candidate){

        if(!this.emailVerificationService.isVerificationCodeClicked(candidate.getEmail())
                && !this.personValidationService.isValidatedPerson(candidate)
                && !ValidationBase.confirmPassword(candidate)
        ){

            return false;
        }
        return true;
    }

}
