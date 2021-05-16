package proje.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proje.hrms.business.abstracts.JobService;
import proje.hrms.dataAccess.abstracts.JobDao;
import proje.hrms.entities.concretes.Job;

import java.util.List;

@Service
public class JobManager implements JobService {

    JobDao jobDao;

    @Autowired
    public JobManager(JobDao jobDao) {
        this.jobDao = jobDao;
    }

    @Autowired
    @Override
    public List<Job> getAll() {
        return this.jobDao.findAll();
    }
}
