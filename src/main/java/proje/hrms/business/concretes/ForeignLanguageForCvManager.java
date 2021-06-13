package proje.hrms.business.concretes;

import org.springframework.stereotype.Service;
import proje.hrms.business.abstracts.ForeignLanguageForCvService;
import proje.hrms.core.utilities.result.DataResult;
import proje.hrms.core.utilities.result.Result;
import proje.hrms.core.utilities.result.SuccessDataResult;
import proje.hrms.core.utilities.result.SuccessResult;
import proje.hrms.dataAccess.abstracts.ForeignLanguageForCvDao;
import proje.hrms.entities.concretes.ForeignLanguageForCV;

@Service
public class ForeignLanguageForCvManager implements ForeignLanguageForCvService {

    private ForeignLanguageForCvDao foreignLanguageForCvDao;

    @Override
    public Result add(ForeignLanguageForCV foreignLanguageForCV) {
        this.foreignLanguageForCvDao.save(foreignLanguageForCV);
        return new SuccessResult("Yabancı dil eklendi.");
    }

    @Override
    public Result update(ForeignLanguageForCV foreignLanguageForCV) {
        ForeignLanguageForCV foreignLanguageForCVToUpdate = this.foreignLanguageForCvDao.getForeignLanguageForCVByForeignLanguageId(foreignLanguageForCV.getForeignLanguageId());
        this.foreignLanguageForCvDao.save(foreignLanguageForCVToUpdate);
        return new SuccessResult("Yabancı dil güncellendi.");
    }

    @Override
    public Result delete(int id) {
        this.foreignLanguageForCvDao.deleteById(id);
        return new SuccessResult("Yabancı dil silindi.");
    }

    @Override
    public DataResult<ForeignLanguageForCV> getForeignLanguageForCVByForeignLanguageId(int id) {
        return new SuccessDataResult<ForeignLanguageForCV>(this.foreignLanguageForCvDao.getForeignLanguageForCVByForeignLanguageId(id));
    }
}
