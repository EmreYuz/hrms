package proje.hrms.business.abstracts;

import proje.hrms.core.utilities.result.DataResult;
import proje.hrms.core.utilities.result.Result;
import proje.hrms.entities.concretes.Candidate;

import java.util.List;

public interface CandidateService {

    Result add(Candidate candidate);

    Result update(Candidate candidate);

    Result delete(Candidate candidate);

    DataResult<List<Candidate>> getAll();

}
