package proje.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import proje.hrms.entities.concretes.ProgrammingSkillForCv;

public interface ProgrammingSkillForCvDao extends JpaRepository<ProgrammingSkillForCv, Integer> {
}
