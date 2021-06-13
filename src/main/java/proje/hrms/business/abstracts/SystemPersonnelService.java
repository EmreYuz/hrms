package proje.hrms.business.abstracts;

import proje.hrms.core.utilities.result.DataResult;
import proje.hrms.core.utilities.result.Result;
import proje.hrms.entities.concretes.SystemPersonnel;

public interface SystemPersonnelService {

    Result add(SystemPersonnel systemPersonnel);

    Result update(SystemPersonnel systemPersonnel);

    Result delete(int id);

    DataResult<SystemPersonnel> getSystemPersonnelById(int id);
}
