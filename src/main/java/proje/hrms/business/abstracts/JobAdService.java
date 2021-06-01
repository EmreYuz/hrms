package proje.hrms.business.abstracts;

import proje.hrms.core.utilities.result.DataResult;
import proje.hrms.core.utilities.result.Result;
import proje.hrms.entities.concretes.JobAd;

import java.util.List;


public interface JobAdService {

    Result add(JobAd jobAd);

    Result update(JobAd jobAd);

    Result delete(JobAd jobAd);

    DataResult<List<JobAd>> getAll();

    DataResult<List<JobAd>> getByIsActive();

    DataResult<List<JobAd>> getByEmployer_CompanyName(String companyName);
}
