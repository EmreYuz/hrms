package proje.hrms.business.abstracts;

import proje.hrms.core.utilities.result.DataResult;
import proje.hrms.core.utilities.result.Result;
import proje.hrms.entities.concretes.Employer;
import proje.hrms.entities.concretes.SystemPersonnel;

import java.util.List;

public interface EmployerService {

    Result add(Employer employer);

    Result update(Employer employer);

    Result delete(int id);

    DataResult<List<Employer>> getAll();

    DataResult<Employer> getEmployerById(int id);

}
