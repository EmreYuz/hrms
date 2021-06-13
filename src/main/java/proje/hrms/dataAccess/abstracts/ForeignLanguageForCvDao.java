package proje.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import proje.hrms.entities.concretes.ForeignLanguageForCV;

public interface ForeignLanguageForCvDao extends JpaRepository<ForeignLanguageForCV, Integer> {

    ForeignLanguageForCV getForeignLanguageForCVByForeignLanguageId(int id);
}
