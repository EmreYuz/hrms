package proje.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proje.hrms.business.abstracts.JobService;
import proje.hrms.core.utilities.result.*;
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
    public DataResult<List<Job>> getAll() {

        return new SuccessDataResult<List<Job>>(this.jobDao.findAll(), "İş pozisyonları listelendi");
    }

    @Override
    public Result add(Job job) {
        if(checkIfJobExists(job)){
            return new ErrorResult("Bu pozisyon sistemde kayıtlıdır.");
        } else {
            this.jobDao.save(job);
            return new SuccessResult("İş pozisyonu eklendi.");
        }
    }

    public boolean checkIfJobExists(Job jobToSearch) {

        List<Job> jobs = this.jobDao.findAll();
        for (Job job : jobs) {
            if (job == jobToSearch) {
                return true;
            }
        }
        return false;
    }
}
