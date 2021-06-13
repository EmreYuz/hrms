package proje.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import proje.hrms.entities.concretes.Employer;
import proje.hrms.entities.concretes.SystemPersonnel;

import java.util.List;

public interface EmployerDao extends JpaRepository<Employer, Integer> {

    Employer getEmployerById(int id);


}
