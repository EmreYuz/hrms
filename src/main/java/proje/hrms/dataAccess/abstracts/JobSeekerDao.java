package proje.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import proje.hrms.core.utilities.result.DataResult;
import proje.hrms.entities.concretes.JobSeeker;

import java.util.List;

public interface JobSeekerDao extends JpaRepository<JobSeeker, Integer> {
    List<JobSeeker> getJobSeekerByEmailOrNationalIdNo(String email, String nationalIdNo);
}
