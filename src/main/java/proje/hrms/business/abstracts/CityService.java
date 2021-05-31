package proje.hrms.business.abstracts;

import proje.hrms.core.utilities.result.Result;
import proje.hrms.entities.concretes.City;

public interface CityService {

    Result add(City city);

    Result update(City city);

    Result delete(City city);
}
