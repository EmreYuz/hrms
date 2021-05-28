package proje.hrms.business.concretes;

import org.springframework.stereotype.Service;
import proje.hrms.business.abstracts.EmployerService;
import proje.hrms.core.utilities.result.*;
import proje.hrms.dataAccess.abstracts.EmployerDao;
import proje.hrms.entities.concretes.Employer;

import java.util.List;

@Service
public class EmployerManager implements EmployerService {

    private EmployerDao employerDao;

    public EmployerManager(EmployerDao employerDao) {
        this.employerDao = employerDao;
    }

    @Override
    public DataResult<List<Employer>> getAll() {
        return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(), "İş verenler listelendi");
    }

    @Override
    public Result register(Employer employer) {

        if (!employer.getCompanyName().isEmpty()
                && !employer.getWebsite().isEmpty()
                && !employer.getEmail().isEmpty()
                && !employer.getPhoneNumber().isEmpty()) {

            if (checkIfEmailExists(employer.getEmail())) {
                return new ErrorResult("Bu e-posta adresi başka bir kullanıcı tarafından kullanılmaktadır.");
            } else if (!checkIfEmailHasSameDomainWithWebsite(employer.getEmail())) {
                return new ErrorResult("E-posta adresi ile web sitesi aynı domaine sahip olmalıdır.");
            } else {
                this.employerDao.save(employer);
                return new SuccessResult("İş veren kayıt işlemi başarılı.");
            }
        }
        return new ErrorResult("Kayıt için tüm alanların doldurulması gereklidir.");
    }

    @Override
    public DataResult<Employer> getEmployerByEmail(String email) {
        return new SuccessDataResult<Employer>(this.employerDao.getEmployerByEmail(email), "İş veren listelendi.");
    }


    public boolean checkIfEmailHasSameDomainWithWebsite(String emailToSearch) {
        List<Employer> employers = this.employerDao.findAll();
        for (Employer employer : employers) {
            if (employer.getWebsite().substring(employer.getWebsite().lastIndexOf(".") + 1)
                    == emailToSearch.substring(emailToSearch.lastIndexOf("@") + 1)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkIfEmailExists(String emailToSearch) {
        List<Employer> employers = this.employerDao.findAll();

        for (Employer employer : employers) {
            if (employer.getEmail() == emailToSearch) {
                return true;
            }
        }
        return false;
    }
}
