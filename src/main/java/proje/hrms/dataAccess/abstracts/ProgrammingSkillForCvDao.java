package proje.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import proje.hrms.entities.concretes.ProgrammingSkillForCv;

import java.util.List;

public interface ProgrammingSkillForCvDao extends JpaRepository<ProgrammingSkillForCv, Integer> {

    List<ProgrammingSkillForCv> getProgrammingSkillForCvsByCandidate_Id(int id);

    ProgrammingSkillForCv deleteByProgrammingSkillId(int id);

    ProgrammingSkillForCv getProgrammingSkillForCvByProgrammingSkillId(int id);

}
