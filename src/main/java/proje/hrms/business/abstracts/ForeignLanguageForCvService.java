package proje.hrms.business.abstracts;

import proje.hrms.core.utilities.result.Result;
import proje.hrms.entities.concretes.ForeignLanguageForCV;

public interface ForeignLanguageForCvService {

    Result add(ForeignLanguageForCV foreignLanguageForCV);
}
