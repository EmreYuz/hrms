package proje.hrms.business.abstracts;

import proje.hrms.core.utilities.result.DataResult;
import proje.hrms.core.utilities.result.Result;
import proje.hrms.entities.concretes.JobExperienceForCV;

import java.util.List;

public interface JobExperienceForCvService {

    Result add(JobExperienceForCV jobExperienceForCV);

    Result update(JobExperienceForCV jobExperienceForCV);

    Result delete(int id);

    DataResult<List<JobExperienceForCV>> getJobExperienceForCVByCandidate_IdOrderByWorkingQuitDateDesc(int id);

    DataResult<JobExperienceForCV> getJobExperienceForCVByJobExperienceId(int id);
}
