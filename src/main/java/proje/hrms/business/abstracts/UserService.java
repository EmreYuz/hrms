package proje.hrms.business.abstracts;

import proje.hrms.core.utilities.result.Result;
import proje.hrms.entities.concretes.User;

public interface UserService {

    Result add(User user);

    Result update(User user);

    Result delete(User user);
}
