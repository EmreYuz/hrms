package proje.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import proje.hrms.entities.concretes.JobExperienceForCV;

public interface JobExperienceForCvDao extends JpaRepository<JobExperienceForCV, Integer> {
}
