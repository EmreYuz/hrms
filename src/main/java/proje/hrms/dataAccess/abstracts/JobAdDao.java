package proje.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import proje.hrms.entities.concretes.JobAd;
import proje.hrms.entities.dtos.JobAdWithEmployerAndJobDto;

import java.util.List;

public interface JobAdDao extends JpaRepository<JobAd, Integer> {

    @Query("from JobAd where isActive=true")
    List<JobAd> getJobAdsByIsActive();

    List<JobAd> getByEmployer_CompanyName(String companyName);

    @Query("from JobAd where isActive = true order by createdDate desc ")
    List<JobAd> getJobAdsByIsActiveOrderedByCreatedDateDesc();

    @Query("from JobAd where isActive = true and employer.id=:employerId")
    List<JobAd> getJobAdsByEmployerAndIsActive(int employerId);
}

