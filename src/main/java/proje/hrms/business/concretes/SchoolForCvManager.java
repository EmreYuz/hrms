package proje.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import proje.hrms.business.abstracts.SchoolForCvService;
import proje.hrms.core.utilities.result.DataResult;
import proje.hrms.core.utilities.result.Result;
import proje.hrms.core.utilities.result.SuccessDataResult;
import proje.hrms.core.utilities.result.SuccessResult;
import proje.hrms.dataAccess.abstracts.SchoolForCvDao;
import proje.hrms.entities.concretes.SchoolForCv;

import java.util.List;

@Service
public class SchoolForCvManager implements SchoolForCvService {

    private SchoolForCvDao schoolForCvDao;

    @Autowired
    public SchoolForCvManager(SchoolForCvDao schoolForCvDao) {
        this.schoolForCvDao = schoolForCvDao;
    }

    @Override
    public Result add(SchoolForCv schoolForCv) {
        this.schoolForCvDao.save(schoolForCv);
        return new SuccessResult("Okul eklendi.");
    }

    @Override
    public Result update(SchoolForCv schoolForCv) {

        SchoolForCv schoolForCvToUpdate = this.schoolForCvDao.getSchoolForCvBySchoolId(schoolForCv.getSchoolId());
        this.schoolForCvDao.save(schoolForCvToUpdate);
        return new SuccessResult("Okul güncellendi.");
    }

    @Override
    public Result delete(int id) {

        this.schoolForCvDao.deleteById(id);
        return new SuccessResult("Okul silindi.");
    }

    @Override
    public DataResult<List<SchoolForCv>> getSchoolsForCvByCandidate_Id(int id) {
        return new SuccessDataResult<List<SchoolForCv>>(this.schoolForCvDao.getSchoolsForCvByCandidate_Id(id));
    }

    @Override
    public DataResult<List<SchoolForCv>> getSchoolForCvsByCandidate_IdOrderBySchoolGraduateDateDesc(int id) {
        return new SuccessDataResult<List<SchoolForCv>>(this.schoolForCvDao.getSchoolForCvsByCandidate_IdOrderBySchoolGraduateDateDesc(id));
    }

    @Override
    public DataResult<List<SchoolForCv>> getAllSchoolsSortedDesc(SchoolForCv schoolForCv) {

        Sort sort = Sort.by(Sort.Direction.DESC, "schoolGraduateDate");
        return new SuccessDataResult<List<SchoolForCv>>(this.schoolForCvDao.findAll(sort), "Okullar listelendi.");
    }

    @Override
    public DataResult<SchoolForCv> getSchoolForCvBySchoolId(int id) {
        return new SuccessDataResult<SchoolForCv>(this.schoolForCvDao.getSchoolForCvBySchoolId(id));
    }
}
