package proje.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import proje.hrms.entities.concretes.Candidate;
import proje.hrms.entities.concretes.JobExperienceForCV;

import java.util.List;

public interface JobExperienceForCvDao extends JpaRepository<JobExperienceForCV, Integer> {

    List<JobExperienceForCV> getJobExperienceForCVByCandidate_IdOrderByWorkingQuitDateDesc(int id);

    JobExperienceForCV getJobExperienceForCVByJobExperienceId(int id);
}
