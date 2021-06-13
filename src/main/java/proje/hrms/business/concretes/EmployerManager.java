package proje.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proje.hrms.business.abstracts.AuthService;
import proje.hrms.business.abstracts.EmployerService;
import proje.hrms.core.utilities.result.DataResult;
import proje.hrms.core.utilities.result.Result;
import proje.hrms.core.utilities.result.SuccessDataResult;
import proje.hrms.core.utilities.result.SuccessResult;
import proje.hrms.dataAccess.abstracts.EmployerDao;
import proje.hrms.entities.concretes.Employer;
import proje.hrms.entities.concretes.SystemPersonnel;

import java.util.List;

@Service
public class EmployerManager implements EmployerService {

    private EmployerDao employerDao;

    @Autowired
    public EmployerManager(EmployerDao employerDao) {

        this.employerDao = employerDao;
    }

    @Override
    public Result add(Employer employer) {
        this.employerDao.save(employer);
        return new SuccessResult("İş veren sisteme kaydedildi.");
    }

    @Override
    public Result update(Employer employer) {
        Employer employerToUpdate = this.employerDao.getEmployerById(employer.getId());
        this.employerDao.save(employerToUpdate);
        return new SuccessResult("Kayıt güncellendi.");
    }

    @Override
    public Result delete(int id) {

        this.employerDao.deleteById(id);
        return new SuccessResult("İş veren silindi.");
    }

    @Override
    public DataResult<List<Employer>> getAll() {
        return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(), "İş verenler listelendi.");
    }

    @Override
    public DataResult<Employer> getEmployerById(int id) {
        return new SuccessDataResult<Employer>(this.employerDao.getEmployerById(id));
    }

}
