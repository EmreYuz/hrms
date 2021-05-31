package proje.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import proje.hrms.entities.concretes.Employer;

import java.util.List;

public interface EmployerDao extends JpaRepository<Employer, Integer> {

    Employer getByEmail(String email);

    List<Employer> getByCompanyName(String companyName);

    List<Employer> getByPhoneNumber(String phoneNumber);

    List<Employer> getByIsVerifiedBySystemPersonnelAndEAndEmailVerified(boolean isVerifiedBySystemPersonnel, boolean isEmailVerified);
}
