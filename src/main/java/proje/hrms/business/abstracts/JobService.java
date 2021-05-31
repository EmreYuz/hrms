package proje.hrms.business.abstracts;

import proje.hrms.core.utilities.result.DataResult;
import proje.hrms.core.utilities.result.Result;
import proje.hrms.entities.concretes.Job;

public interface JobService {

    Result add(Job job);

    Result update(Job job);

    Result delete(Job job);

    DataResult<Job> getById(int id);

    DataResult<Job> getByJobName(String jobName);
}
