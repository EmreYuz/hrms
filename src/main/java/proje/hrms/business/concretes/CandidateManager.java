package proje.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proje.hrms.business.abstracts.CandidateService;
import proje.hrms.core.utilities.adapters.services.PersonValidationService;
import proje.hrms.core.utilities.result.DataResult;
import proje.hrms.core.utilities.result.Result;
import proje.hrms.core.utilities.result.SuccessDataResult;
import proje.hrms.core.utilities.result.SuccessResult;
import proje.hrms.dataAccess.abstracts.CandidateDao;
import proje.hrms.entities.concretes.Candidate;

import java.util.List;

@Service
public class CandidateManager implements CandidateService {

    private CandidateDao candidateDao;

    @Autowired
    public CandidateManager(CandidateDao candidateDao) {
        this.candidateDao = candidateDao;
    }

    @Override
    public Result add(Candidate candidate) {
        this.candidateDao.save(candidate);
        return new SuccessResult("İş arayan sisteme eklendi.");
    }

    @Override
    public Result update(Candidate candidate) {

        return null;
    }

    @Override
    public Result delete(Candidate candidate) {

        return null;
    }

    @Override
    public DataResult<List<Candidate>> getAll() {
        return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll());
    }

    @Override
    public DataResult<Candidate> getByNationalIdNo(String nationalIdNo) {
        return new SuccessDataResult<Candidate>(this.candidateDao.getByNationalIdNo(nationalIdNo));
    }

    @Override
    public DataResult<Candidate> getByEmail(String email) {
        return new SuccessDataResult<Candidate>(this.candidateDao.getByEmail(email));
    }

    @Override
    public DataResult<List<Candidate>> getByIsEmailVerifiedAndIsMernisVerified(boolean isEmailVerified, boolean isMernisVerified) {
        return new SuccessDataResult<List<Candidate>>(this.candidateDao.getByIsEmailVerifiedAndIsMernisVerified(isEmailVerified, isMernisVerified));
    }
}