package proje.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import proje.hrms.entities.concretes.JobAd;

import java.util.List;

public interface JobAdDao extends JpaRepository<JobAd, Integer> {

    @Query("from JobAd where isActive=true")
    List<JobAd> getByIsActive();

    List<JobAd> getByEmployer_CompanyName(String companyName);

}
