package proje.hrms.core.utilities.adapters.mernis;

import org.springframework.stereotype.Service;
import proje.hrms.core.utilities.adapters.services.PersonValidationService;
import proje.hrms.entities.concretes.Candidate;
import proje.hrms.mernis.GEGKPSPublicSoap;

@Service
public class MernisAdapter implements PersonValidationService {
    boolean result;

    GEGKPSPublicSoap gegkpsPublicSoap = new GEGKPSPublicSoap();

    @Override
    public boolean isValidatedPerson(Candidate candidate) {
        try {
            result = gegkpsPublicSoap.TCKimlikNoDogrula(Long.parseLong(candidate.getNationalIdNo()),
                    candidate.getFirstName(),
                    candidate.getLastName(),
                    candidate.getBirthYear());

            return result;
        } catch (Exception e) {
            e.printStackTrace();

            return false;
        }
    }
}
