package proje.hrms.core.utilities.verification;

import org.springframework.stereotype.Service;
import proje.hrms.entities.concretes.Employer;
import proje.hrms.entities.concretes.SystemPersonnel;

@Service
public class PersonnelVerificationManager implements PersonnelVerificationService {
    @Override
    public boolean isPersonnelApproved(Employer employer) {

        System.out.println("İş veren başvurusu onaylandı: " + employer.getEmail());

        return true;
    }
}
