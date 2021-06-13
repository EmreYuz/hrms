package proje.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proje.hrms.business.abstracts.JobExperienceForCvService;
import proje.hrms.core.utilities.result.DataResult;
import proje.hrms.core.utilities.result.Result;
import proje.hrms.core.utilities.result.SuccessDataResult;
import proje.hrms.core.utilities.result.SuccessResult;
import proje.hrms.dataAccess.abstracts.JobExperienceForCvDao;
import proje.hrms.entities.concretes.JobExperienceForCV;

import java.util.List;

@Service
public class JobExperienceForCvManager implements JobExperienceForCvService {

    private JobExperienceForCvDao jobExperienceForCvDao;

    @Autowired
    public JobExperienceForCvManager(JobExperienceForCvDao jobExperienceForCvDao) {
        this.jobExperienceForCvDao = jobExperienceForCvDao;
    }

    @Override
    public Result add(JobExperienceForCV jobExperienceForCV) {
        this.jobExperienceForCvDao.save(jobExperienceForCV);
        return new SuccessResult("İş tecrübesi eklendi.");
    }

    @Override
    public Result update(JobExperienceForCV jobExperienceForCV) {

        JobExperienceForCV jobExperienceForCVToUpdate = this.jobExperienceForCvDao.getJobExperienceForCVByJobExperienceId(jobExperienceForCV.getJobExperienceId());
        this.jobExperienceForCvDao.save(jobExperienceForCVToUpdate);
        return new SuccessResult("İş tecrübesi güncellendi.");
    }

    @Override
    public Result delete(int id) {

        this.jobExperienceForCvDao.deleteById(id);
        return new SuccessResult("İş ilanı silindi.");
    }

    @Override
    public DataResult<List<JobExperienceForCV>> getJobExperienceForCVByCandidate_IdOrderByWorkingQuitDateDesc(int id) {
        return new SuccessDataResult<List<JobExperienceForCV>>(this.jobExperienceForCvDao.getJobExperienceForCVByCandidate_IdOrderByWorkingQuitDateDesc(id));
    }

    @Override
    public DataResult<JobExperienceForCV> getJobExperienceForCVByJobExperienceId(int id) {
        return new SuccessDataResult<JobExperienceForCV>(this.jobExperienceForCvDao.getJobExperienceForCVByJobExperienceId(id));
    }
}
