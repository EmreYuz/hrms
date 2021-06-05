package proje.hrms.business.abstracts;

import proje.hrms.core.utilities.result.DataResult;
import proje.hrms.core.utilities.result.Result;
import proje.hrms.entities.concretes.SchoolForCv;

import java.util.List;

public interface SchoolForCvService {

    Result add(SchoolForCv schoolForCv);

    Result update(SchoolForCv schoolForCv);

    Result delete(SchoolForCv schoolForCv);

    DataResult<List<SchoolForCv>> getSchoolForCvByCandidate_NationalIdNo(String nationalIdNo);

    DataResult<List<SchoolForCv>> getAllByCandidateIdOrderBySchoolGraduateDateDesc(int id);

}
