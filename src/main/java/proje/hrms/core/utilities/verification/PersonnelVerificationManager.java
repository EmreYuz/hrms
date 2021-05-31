package proje.hrms.core.utilities.verification;

import proje.hrms.entities.concretes.Employer;
import proje.hrms.entities.concretes.SystemPersonnel;

public class PersonnelVerificationManager implements PersonnelVerificationService {
    @Override
    public boolean isPersonnelApproved(Employer employer, SystemPersonnel systemPersonnel) {

        System.out.println("İş veren başvurusu " + systemPersonnel.getFirstName() + " " + systemPersonnel.getLastName() + " isimli personel tarafından onaylandı: " + employer.getEmail());

        return true;
    }
}
