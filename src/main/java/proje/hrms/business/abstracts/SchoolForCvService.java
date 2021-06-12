package proje.hrms.business.abstracts;

import proje.hrms.core.utilities.result.DataResult;
import proje.hrms.core.utilities.result.Result;
import proje.hrms.entities.concretes.SchoolForCv;

import java.util.List;

public interface SchoolForCvService {

    Result add(SchoolForCv schoolForCv);

    Result update(SchoolForCv schoolForCv);

    Result delete(SchoolForCv schoolForCv);

    DataResult<List<SchoolForCv>> getSchoolsForCvByCandidate_Id(int id);

    DataResult<List<SchoolForCv>> getSchoolForCvsByCandidate_IdOrderBySchoolGraduateDateDesc(int id);

    DataResult<List<SchoolForCv>> getAllSchoolsSortedDesc(SchoolForCv schoolForCv);

}
