package proje.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import proje.hrms.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer> {
}
