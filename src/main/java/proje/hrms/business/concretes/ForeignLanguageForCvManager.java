package proje.hrms.business.concretes;

import org.springframework.stereotype.Service;
import proje.hrms.business.abstracts.ForeignLanguageForCvService;
import proje.hrms.core.utilities.result.Result;
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
}
