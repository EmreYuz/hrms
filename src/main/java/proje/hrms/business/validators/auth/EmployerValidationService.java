package proje.hrms.business.validators.auth;

import proje.hrms.entities.concretes.Employer;
import proje.hrms.entities.concretes.SystemPersonnel;

public interface EmployerValidationService {
    boolean isValidated(Employer employer, SystemPersonnel systemPersonnel);
}
