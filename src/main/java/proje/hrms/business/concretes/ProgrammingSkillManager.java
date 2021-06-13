package proje.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proje.hrms.business.abstracts.ProgrammingSkillForCvService;
import proje.hrms.core.utilities.result.DataResult;
import proje.hrms.core.utilities.result.Result;
import proje.hrms.core.utilities.result.SuccessDataResult;
import proje.hrms.core.utilities.result.SuccessResult;
import proje.hrms.dataAccess.abstracts.ProgrammingSkillForCvDao;
import proje.hrms.entities.concretes.ProgrammingSkillForCv;

@Service
public class ProgrammingSkillManager implements ProgrammingSkillForCvService {

    private ProgrammingSkillForCvDao programmingSkillForCvDao;

    @Autowired
    public ProgrammingSkillManager(ProgrammingSkillForCvDao programmingSkillForCvDao) {
        this.programmingSkillForCvDao = programmingSkillForCvDao;
    }

    @Override
    public Result add(ProgrammingSkillForCv programmingSkillForCv) {
        this.programmingSkillForCvDao.save(programmingSkillForCv);
        return new SuccessResult("Programlama dili/teknolojisi eklendi.");
    }

    @Override
    public Result update(ProgrammingSkillForCv programmingSkillForCv) {
        ProgrammingSkillForCv programmingSkillForCvToUpdate = this.programmingSkillForCvDao.getProgrammingSkillForCvByProgrammingSkillId(programmingSkillForCv.getProgrammingSkillId());
        this.programmingSkillForCvDao.save(programmingSkillForCvToUpdate);
        return new SuccessResult("Programlama dili/teknolojisi güncellendi.");
    }

    @Override
    public DataResult<ProgrammingSkillForCv> deleteByProgrammingSkillId(int id) {
        return new SuccessDataResult<ProgrammingSkillForCv>(this.programmingSkillForCvDao.deleteByProgrammingSkillId(id));
    }

    @Override
    public DataResult<ProgrammingSkillForCv> getProgrammingSkillForCvByProgrammingSkillId(int id) {
        return new SuccessDataResult<ProgrammingSkillForCv>(this.programmingSkillForCvDao.getProgrammingSkillForCvByProgrammingSkillId(id));
    }
}
