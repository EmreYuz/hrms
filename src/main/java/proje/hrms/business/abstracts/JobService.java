package proje.hrms.business.abstracts;

import proje.hrms.core.utilities.result.DataResult;
import proje.hrms.core.utilities.result.Result;
import proje.hrms.entities.concretes.Job;

import java.util.List;

public interface JobService {
    DataResult<List<Job>> getAll();
    Result add(Job job);
}
