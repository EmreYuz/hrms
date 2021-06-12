package proje.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proje.hrms.business.abstracts.UrlForCvService;
import proje.hrms.core.utilities.result.DataResult;
import proje.hrms.core.utilities.result.Result;
import proje.hrms.core.utilities.result.SuccessDataResult;
import proje.hrms.core.utilities.result.SuccessResult;
import proje.hrms.dataAccess.abstracts.UrlForCvDao;
import proje.hrms.entities.concretes.UrlForCv;

import java.util.List;

@Service
public class UrlForCvManager implements UrlForCvService {

    private UrlForCvDao urlForCvDao;

    @Autowired
    public UrlForCvManager(UrlForCvDao urlForCvDao) {
        this.urlForCvDao = urlForCvDao;
    }

    @Override
    public Result addUrl(UrlForCv urlForCv) {
        this.urlForCvDao.save(urlForCv);
        return new SuccessResult("Url eklendi.");
    }

    @Override
    public Result updateUrl(UrlForCv urlForCv) {
        this.urlForCvDao.save(urlForCv);
        return new SuccessResult("Url güncellendi.");
    }

    @Override
    public Result deleteUrl(int id) {
        this.urlForCvDao.deleteById(id);
        return new SuccessResult("Url silindi.");
    }

    @Override
    public DataResult<List<UrlForCv>> getUrlForCvByCandidate_Id(int id) {
        return new SuccessDataResult<List<UrlForCv>>(this.urlForCvDao.getUrlForCvByCandidate_Id(id));
    }

    @Override
    public DataResult<List<UrlForCv>> getAll() {
        return new SuccessDataResult<List<UrlForCv>>(this.urlForCvDao.findAll());
    }
}
