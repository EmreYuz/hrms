package proje.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proje.hrms.business.abstracts.CandidateService;
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
        this.candidateDao.save(candidate); // bunu authService enjekte etmeden yaparsan validationları almamış oluyorsun. revize et.
        return new SuccessResult("İş arayan sisteme eklendi.");
    }

    @Override
    public Result update(Candidate candidate) {

        this.candidateDao.save(candidate);
        return new SuccessResult("Kayıt güncellendi.");
    }

    @Override
    public DataResult<List<Candidate>> getAll() {
        return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll(), "İş arayanlar listelendi.");
    }

    @Override
    public DataResult<Candidate> getById(int id) {
        return new SuccessDataResult<Candidate>(this.candidateDao.getById(id));
    }

    @Override
    public DataResult<Candidate> deleteById(int id) {
        return new SuccessDataResult<Candidate>(this.candidateDao.deleteById(id));
    }


}
