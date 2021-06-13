package proje.hrms.business.abstracts;

import proje.hrms.core.utilities.result.DataResult;
import proje.hrms.core.utilities.result.Result;
import proje.hrms.entities.concretes.ForeignLanguageForCV;

public interface ForeignLanguageForCvService {

    Result add(ForeignLanguageForCV foreignLanguageForCV);

    Result update(ForeignLanguageForCV foreignLanguageForCV);

    Result delete(int id);

    DataResult<ForeignLanguageForCV> getForeignLanguageForCVByForeignLanguageId(int id);
}
