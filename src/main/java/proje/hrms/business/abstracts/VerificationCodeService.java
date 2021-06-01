package proje.hrms.business.abstracts;

import proje.hrms.core.utilities.result.Result;
import proje.hrms.entities.concretes.VerificationCode;

public interface VerificationCodeService {

    Result add(VerificationCode verificationCode);

}
