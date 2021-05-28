package proje.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import proje.hrms.core.utilities.result.DataResult;
import proje.hrms.entities.concretes.Employer;

import java.util.List;

public interface EmployerDao extends JpaRepository<Employer, Integer> {
    Employer getEmployerByEmail(String email);


}
