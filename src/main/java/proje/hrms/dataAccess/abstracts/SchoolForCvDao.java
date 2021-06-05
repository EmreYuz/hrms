package proje.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import proje.hrms.entities.concretes.SchoolForCv;

import java.util.List;

public interface SchoolForCvDao extends JpaRepository<SchoolForCv, Integer> {

    List<SchoolForCv> getSchoolForCvByCandidate_NationalIdNo(String nationalIdNo);

    @Query("from SchoolForCv where candidate.id=:id order by schoolGraduateDate desc ")
    List<SchoolForCv> getAllByCandidateIdOrderBySchoolGraduateDateDesc(int id);

}
