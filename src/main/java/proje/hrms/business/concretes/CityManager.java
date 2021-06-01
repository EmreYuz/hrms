package proje.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proje.hrms.business.abstracts.CityService;
import proje.hrms.core.utilities.result.Result;
import proje.hrms.core.utilities.result.SuccessResult;
import proje.hrms.dataAccess.abstracts.CityDao;
import proje.hrms.entities.concretes.City;

@Service
public class CityManager implements CityService {

    private CityDao cityDao;

    @Autowired
    public CityManager(CityDao cityDao) {
        this.cityDao = cityDao;
    }

    @Override
    public Result add(City city) {
        this.cityDao.save(city);
        return new SuccessResult("Şehir eklendi.");
    }

    @Override
    public Result update(City city) {
        return null;
    }

    @Override
    public Result delete(City city) {
        return null;
    }
}
