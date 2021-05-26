package proje.hrms.business.concretes;

import org.springframework.stereotype.Service;
import proje.hrms.business.abstracts.JobSeekerService;
import proje.hrms.business.abstracts.MernisService;
import proje.hrms.core.utilities.result.*;
import proje.hrms.dataAccess.abstracts.JobSeekerDao;
import proje.hrms.entities.concretes.JobSeeker;

import java.util.List;

@Service
public class JobSeekerManager implements JobSeekerService {

    private JobSeekerDao jobSeekerDao;
    private MernisService mernisService;

    public JobSeekerManager(JobSeekerDao jobSeekerDao, MernisService mernisService) {

        this.jobSeekerDao = jobSeekerDao;
        this.mernisService = mernisService;
    }

    @Override
    public DataResult<List<JobSeeker>> getAll() {
        return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll(), "İş arayanlar listelendi.");
    }

    @Override
    public Result register(JobSeeker jobSeeker) throws Exception {

        if (!jobSeeker.getFirstName().isEmpty()
                && !jobSeeker.getLastName().isEmpty()
                && !jobSeeker.getNationalIdNo().isEmpty()
                && !jobSeeker.getEmail().isEmpty()
                && !jobSeeker.getBirthYear().equals(null)) {

            if (this.mernisService.validateWithMernis(jobSeeker)) {
                this.jobSeekerDao.save(jobSeeker);
                return new SuccessResult("İş arayan kayıt işlemi başarılı.");
            } else {
                return new ErrorResult("Mernis sorgusu başarısız.");
            }
        } else {
            return new ErrorResult("Kayıt için tüm alanların doldurulması gereklidir.");
        }
    }
}
