package proje.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import proje.hrms.entities.concretes.UrlForCv;

public interface UrlForCvDao extends JpaRepository<UrlForCv, Integer> {
}
