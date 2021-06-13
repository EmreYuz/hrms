package proje.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proje.hrms.business.abstracts.SystemPersonnelService;
import proje.hrms.core.utilities.result.DataResult;
import proje.hrms.core.utilities.result.Result;
import proje.hrms.core.utilities.result.SuccessDataResult;
import proje.hrms.core.utilities.result.SuccessResult;
import proje.hrms.dataAccess.abstracts.SystemPersonnelDao;
import proje.hrms.entities.concretes.SystemPersonnel;

@Service
public class SystemPersonnelManager implements SystemPersonnelService {

private SystemPersonnelDao systemPersonnelDao;

    @Autowired
    public SystemPersonnelManager(SystemPersonnelDao systemPersonnelDao) {
        this.systemPersonnelDao = systemPersonnelDao;
    }

    @Override
    public Result add(SystemPersonnel systemPersonnel) {
        this.systemPersonnelDao.save(systemPersonnel);
        return new SuccessResult("Sistem personeli eklendi.");
    }

    @Override
    public Result update(SystemPersonnel systemPersonnel) {

        SystemPersonnel systemPersonnelToUpdate = this.systemPersonnelDao.getSystemPersonnelById(systemPersonnel.getId());
        this.systemPersonnelDao.save(systemPersonnelToUpdate);
        return new SuccessResult("Sistem personeli güncellendi.");
    }

    @Override
    public Result delete(int id) {

        this.systemPersonnelDao.deleteById(id);
        return new SuccessResult("Sistem personeli silindi.");
    }

    @Override
    public DataResult<SystemPersonnel> getSystemPersonnelById(int id) {
        return new SuccessDataResult<SystemPersonnel>(this.systemPersonnelDao.getSystemPersonnelById(id));
    }
}
