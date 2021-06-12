package proje.hrms.business.abstracts;

import proje.hrms.core.utilities.result.DataResult;
import proje.hrms.core.utilities.result.Result;
import proje.hrms.entities.concretes.Candidate;
import proje.hrms.entities.dtos.CvDto;

import java.util.List;

public interface CandidateService {

    Result add(Candidate candidate);

    Result update(Candidate candidate);

    DataResult<List<Candidate>> getAll();

    DataResult<Candidate> getById(int id);

    DataResult<Candidate> deleteById(int id);

    DataResult <CvDto> getCvByCandidateId(int id);

}
