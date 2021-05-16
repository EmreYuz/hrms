package proje.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import proje.hrms.entities.concretes.Job;

public interface JobDao extends JpaRepository<Job, Integer> {
}
