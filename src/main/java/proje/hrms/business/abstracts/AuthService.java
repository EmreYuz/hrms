package proje.hrms.business.abstracts;

import proje.hrms.core.utilities.result.Result;
import proje.hrms.entities.concretes.Candidate;
import proje.hrms.entities.concretes.Employer;
import proje.hrms.entities.concretes.SystemPersonnel;

public interface AuthService {
    Result registerCandidate(Candidate candidate);

    Result registerEmployer(Employer employer, SystemPersonnel systemPersonnel);

}
