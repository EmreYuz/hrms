package proje.hrms.core.utilities.verification;

import proje.hrms.entities.concretes.Employer;
import proje.hrms.entities.concretes.SystemPersonnel;

public interface PersonnelVerificationService {

    boolean isPersonnelApproved(Employer employer, SystemPersonnel systemPersonnel);
}
