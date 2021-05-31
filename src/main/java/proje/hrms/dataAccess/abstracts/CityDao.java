package proje.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import proje.hrms.entities.concretes.City;

public interface CityDao extends JpaRepository<City, Integer> {

}
