package proje.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proje.hrms.business.abstracts.JobService;
import proje.hrms.core.utilities.result.DataResult;
import proje.hrms.core.utilities.result.Result;
import proje.hrms.core.utilities.result.SuccessDataResult;
import proje.hrms.core.utilities.result.SuccessResult;
import proje.hrms.dataAccess.abstracts.JobDao;
import proje.hrms.entities.concretes.Job;

import java.util.List;

@Service
public class JobManager implements JobService {

    private JobDao jobDao;

    @Autowired
    public JobManager(JobDao jobDao) {
        this.jobDao = jobDao;
    }

    @Override
    public Result add(Job job) {
        this.jobDao.save(job);
        return new SuccessResult("Pozisyon eklendi.");
    }

    @Override
    public Result update(Job job) {

        Job jobToUpdate = this.jobDao.getJobById(job.getId());
        this.jobDao.save(jobToUpdate);
        return new SuccessResult("Posizyon güncellendi.");
    }

    @Override
    public Result delete(int id) {

        this.jobDao.deleteById(id);
        return new SuccessResult("Pozisyon silindi.");
    }

    @Override
    public DataResult<List<Job>> getAll() {
        return new SuccessDataResult<List<Job>>(this.jobDao.findAll(), "Pozisyonlar listelendi.");
    }

    @Override
    public DataResult<Job> getJobById(int id) {
        return new SuccessDataResult<Job>(this.jobDao.getJobById(id));
    }

}
