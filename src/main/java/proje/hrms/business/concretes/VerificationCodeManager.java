package proje.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proje.hrms.business.abstracts.VerificationCodeService;
import proje.hrms.core.utilities.result.Result;
import proje.hrms.core.utilities.result.SuccessResult;
import proje.hrms.dataAccess.abstracts.VerificationCodeDao;
import proje.hrms.entities.concretes.VerificationCode;

@Service
public class VerificationCodeManager implements VerificationCodeService {

    private VerificationCodeDao verificationCodeDao;

    @Autowired
    public VerificationCodeManager(VerificationCodeDao verificationCodeDao) {
        this.verificationCodeDao = verificationCodeDao;
    }

    @Override
    public Result add(VerificationCode verificationCode) {
        this.verificationCodeDao.save(verificationCode);
        return new SuccessResult("Doğrulama kodu eklendi.");
    }
}
