package proje.hrms.business.abstracts;

import proje.hrms.core.utilities.result.DataResult;
import proje.hrms.core.utilities.result.Result;
import proje.hrms.entities.concretes.JobAd;
import proje.hrms.entities.dtos.JobAdWithEmployerAndJobDto;

import java.util.List;


public interface JobAdService {

    Result add(JobAd jobAd);

    Result update(JobAd jobAd);

    Result delete(JobAd jobAd);

    DataResult<List<JobAd>> getAll();

    DataResult<List<JobAd>> getJobAdsByIsActive();

    DataResult<List<JobAd>> getByEmployer_CompanyName(String companyName);

    DataResult<List<JobAd>> getJobAdsByIsActiveOrderedByCreatedDateDesc();

    DataResult<List<JobAd>> getJobAdsByEmployerAndIsActive(int employerId);
}
