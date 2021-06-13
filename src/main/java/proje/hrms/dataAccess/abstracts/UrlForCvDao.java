package proje.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import proje.hrms.entities.concretes.UrlForCv;

import java.util.List;

public interface UrlForCvDao extends JpaRepository<UrlForCv, Integer> {

    List<UrlForCv> getUrlForCvByCandidate_Id(int id);

    UrlForCv getUrlForCvByCandidateUrlId(int id);
}
