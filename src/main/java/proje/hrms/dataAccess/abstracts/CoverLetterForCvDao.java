package proje.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import proje.hrms.entities.concretes.CoverLetterForCv;

public interface CoverLetterForCvDao extends JpaRepository<CoverLetterForCv, Integer> {

    CoverLetterForCv getCoverLetterForCvByCoverLetterId(int id);
}
