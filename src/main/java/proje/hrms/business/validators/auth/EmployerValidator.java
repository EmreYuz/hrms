package proje.hrms.business.validators.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proje.hrms.business.validators.ValidationBase;
import proje.hrms.core.utilities.verification.EmailVerificationService;
import proje.hrms.core.utilities.verification.PersonnelVerificationService;
import proje.hrms.entities.concretes.Employer;
import proje.hrms.entities.concretes.SystemPersonnel;


@Service
public class EmployerValidator implements EmployerValidationService {

        private EmailVerificationService emailVerificationService;
        private PersonnelVerificationService personnelVerificationService;

        @Autowired
        public EmployerValidator(EmailVerificationService emailVerificationService, PersonnelVerificationService personnelVerificationService) {
                this.emailVerificationService = emailVerificationService;
                this.personnelVerificationService = personnelVerificationService;
        }

        public boolean isValidated(Employer employer){
                if(!this.emailVerificationService.isVerificationCodeClicked(employer.getEmail())
                        && !this.personnelVerificationService.isPersonnelApproved(employer)
                        && !ValidationBase.checkEmailAndDomain(employer.getEmail(), employer.getWebsite())){
                        return false;
                }
                return true;
        }

}
