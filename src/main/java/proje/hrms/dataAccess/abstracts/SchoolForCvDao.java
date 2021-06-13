package proje.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import proje.hrms.entities.concretes.SchoolForCv;

import java.util.List;

public interface SchoolForCvDao extends JpaRepository<SchoolForCv, Integer> {

    List<SchoolForCv> getSchoolsForCvByCandidate_Id(int id);

    List<SchoolForCv> getSchoolForCvsByCandidate_IdOrderBySchoolGraduateDateDesc(int id);

    SchoolForCv getSchoolForCvBySchoolId(int id);

}
