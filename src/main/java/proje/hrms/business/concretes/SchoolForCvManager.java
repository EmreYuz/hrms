package proje.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
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
        this.schoolForCvDao.findAll();
        return new SuccessResult("Okul eklendi.");
    }

    @Override
    public Result update(SchoolForCv schoolForCv) {
        return null;
    }

    @Override
    public Result delete(SchoolForCv schoolForCv) {
        return null;
    }

    @Override
    public DataResult<List<SchoolForCv>> getSchoolForCvByCandidate_NationalIdNo(String nationalIdNo) {
        return new SuccessDataResult<List<SchoolForCv>>(this.schoolForCvDao.getSchoolForCvByCandidate_NationalIdNo(nationalIdNo));
    }

    @Override
    public DataResult<List<SchoolForCv>> getAllByCandidateIdOrderBySchoolGraduateDateDesc(int id) {
        return new SuccessDataResult<List<SchoolForCv>>(this.schoolForCvDao.getAllByCandidateIdOrderBySchoolGraduateDateDesc(id));
    }
}
