package proje.hrms.business.abstracts;

import proje.hrms.core.utilities.result.DataResult;
import proje.hrms.core.utilities.result.Result;
import proje.hrms.entities.concretes.ProgrammingSkillForCv;

public interface ProgrammingSkillForCvService {

    Result add(ProgrammingSkillForCv programmingSkillForCv);

    Result update(ProgrammingSkillForCv programmingSkillForCv);

    DataResult <ProgrammingSkillForCv> deleteByProgrammingSkillId(int id);

    DataResult<ProgrammingSkillForCv> getProgrammingSkillForCvByProgrammingSkillId(int id);

}
