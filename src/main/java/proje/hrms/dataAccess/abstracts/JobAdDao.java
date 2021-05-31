package proje.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import proje.hrms.entities.concretes.JobAd;

import java.util.List;

public interface JobAdDao extends JpaRepository<JobAd, Integer> {

    List<JobAd> getByActive(boolean isActive);

    List<JobAd> getByEmployerAndActive(int employerId, boolean isActive);

}
