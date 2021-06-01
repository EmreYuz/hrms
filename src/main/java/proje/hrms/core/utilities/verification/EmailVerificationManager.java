package proje.hrms.core.utilities.verification;

import org.springframework.stereotype.Service;
import proje.hrms.core.utilities.result.Result;
import proje.hrms.core.utilities.result.SuccessResult;

import java.util.UUID;

@Service
public class EmailVerificationManager implements EmailVerificationService {

    public String codeGenerator() {

        UUID uuid = UUID.randomUUID();
        String activationCode = uuid.toString();
        return activationCode;
    }

    @Override
    public boolean isVerificationCodeClicked(String email) {

        String code = this.codeGenerator();

        System.out.println(email + " adresine gönderilen " + code + " doğrulama kodu ile oluşturulan linke tıklandı.");

        return true;
    }


}
