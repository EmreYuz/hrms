package proje.hrms.business.abstracts;

import proje.hrms.core.utilities.result.DataResult;
import proje.hrms.core.utilities.result.Result;
import proje.hrms.entities.concretes.UrlForCv;

import java.util.List;

public interface UrlForCvService {

    Result addUrl(UrlForCv urlForCv);

    Result updateUrl(UrlForCv urlForCv);

    Result deleteUrl(int id);

    DataResult<List<UrlForCv>> getUrlForCvByCandidate_Id(int id);

    DataResult<List<UrlForCv>> getAll();
}
