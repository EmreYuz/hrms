package proje.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proje.hrms.business.abstracts.JobAdService;
import proje.hrms.core.utilities.result.DataResult;
import proje.hrms.core.utilities.result.Result;
import proje.hrms.core.utilities.result.SuccessDataResult;
import proje.hrms.core.utilities.result.SuccessResult;
import proje.hrms.dataAccess.abstracts.JobAdDao;
import proje.hrms.entities.concretes.JobAd;

import java.util.List;

@Service
public class JobAdManager implements JobAdService {

    private JobAdDao jobAdDao;

    @Autowired
    public JobAdManager(JobAdDao jobAdDao) {
        this.jobAdDao = jobAdDao;
    }

    @Override
    public Result add(JobAd jobAd) {
        this.jobAdDao.save(jobAd);
        return new SuccessResult("İş ilanı eklendi.");
    }

    @Override
    public Result update(JobAd jobAd) {

        JobAd jobAdToUpdate = this.jobAdDao.getJobAdById(jobAd.getId());
        this.jobAdDao.save(jobAdToUpdate);
        return new SuccessResult("İş ilanı güncellendi.");
    }

    @Override
    public Result delete(int id) {

        this.jobAdDao.deleteById(id);
        return new SuccessResult("İş ilanı silindi.");
    }

    @Override
    public DataResult<List<JobAd>> getAll() {
        return new SuccessDataResult<List<JobAd>>(this.jobAdDao.findAll(), "İş ilanları listelendi.");
    }

    @Override
    public DataResult<List<JobAd>> getJobAdsByIsActive() {
        return new SuccessDataResult<List<JobAd>>(this.jobAdDao.getJobAdsByIsActive());
    }

    @Override
    public DataResult<List<JobAd>> getByEmployer_CompanyName(String companyName) {
        return new SuccessDataResult<List<JobAd>>(this.jobAdDao.getByEmployer_CompanyName(companyName));
    }

    @Override
    public DataResult<List<JobAd>> getJobAdsByIsActiveOrderedByCreatedDateDesc() {
        return new SuccessDataResult<List<JobAd>>(this.jobAdDao.getJobAdsByIsActiveOrderedByCreatedDateDesc());
    }

    @Override
    public DataResult<List<JobAd>> getJobAdsByEmployerAndIsActive(int employerId) {
        return new SuccessDataResult<List<JobAd>>(this.jobAdDao.getJobAdsByEmployerAndIsActive(employerId));
    }

    @Override
    public DataResult<JobAd> getJobAdById(int id) {
        return new SuccessDataResult<JobAd>(this.jobAdDao.getJobAdById(id));
    }
}
