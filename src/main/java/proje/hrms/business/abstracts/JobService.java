package proje.hrms.business.abstracts;

import proje.hrms.core.utilities.result.DataResult;
import proje.hrms.core.utilities.result.Result;
import proje.hrms.entities.concretes.Job;

import java.util.List;

public interface JobService {

    Result add(Job job);

    Result update(Job job);

    Result delete(int id);

    DataResult<List<Job>> getAll();

    DataResult<Job> getJobById(int id);

}
