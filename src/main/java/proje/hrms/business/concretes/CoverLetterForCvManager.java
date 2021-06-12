package proje.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proje.hrms.business.abstracts.CoverLetterForCvService;
import proje.hrms.core.utilities.result.Result;
import proje.hrms.core.utilities.result.SuccessResult;
import proje.hrms.dataAccess.abstracts.CoverLetterForCvDao;
import proje.hrms.entities.concretes.CoverLetterForCv;

@Service
public class CoverLetterForCvManager implements CoverLetterForCvService {

    private CoverLetterForCvDao coverLetterForCvDao;

    @Autowired
    public CoverLetterForCvManager(CoverLetterForCvDao coverLetterForCvDao) {
        this.coverLetterForCvDao = coverLetterForCvDao;
    }

    @Override
    public Result add(CoverLetterForCv coverLetterForCv) {
        this.coverLetterForCvDao.save(coverLetterForCv);
        return new SuccessResult("Ön yazı eklendi.");
    }

    @Override
    public Result update(CoverLetterForCv coverLetterForCv) {
        CoverLetterForCv coverLetterToUpdate = this.coverLetterForCvDao.getCoverLetterForCvByCoverLetterId(coverLetterForCv.getCoverLetterId());
        this.coverLetterForCvDao.save(coverLetterToUpdate);
        return new SuccessResult("Ön yazı güncellendi.");
    }

    @Override
    public Result delete(int id) {
        this.coverLetterForCvDao.deleteById(id);
        return new SuccessResult("Ön yazı silindi.");
    }
}
