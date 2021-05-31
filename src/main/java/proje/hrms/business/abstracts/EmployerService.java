package proje.hrms.business.abstracts;

import proje.hrms.core.utilities.result.DataResult;
import proje.hrms.core.utilities.result.Result;
import proje.hrms.entities.concretes.Employer;

import java.util.List;

public interface EmployerService {

    Result add(Employer employer);

    Result update(Employer employer);

    Result delete(Employer employer);

    DataResult<Employer> getByEmail(String email);

    DataResult<List<Employer>> getByCompanyName(String companyName);

    DataResult<List<Employer>> getByPhoneNumber(String phoneNumber);

    DataResult<List<Employer>> getByIsVerifiedBySystemPersonnelAndEAndEmailVerified(boolean isVerifiedBySystemPersonnel, boolean isEmailVerified);
}
