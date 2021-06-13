package proje.hrms.core.utilities.adapters;

import org.springframework.stereotype.Service;
import proje.hrms.entities.concretes.Candidate;
import proje.hrms.core.utilities.outsourceServices.mernis.GEGKPSPublicSoap;

@Service
public class MernisAdapter implements PersonValidationService {
    boolean result;

    GEGKPSPublicSoap gegkpsPublicSoap = new GEGKPSPublicSoap();

    @Override
    public boolean isValidatedPerson(Candidate candidate) {
        try {
            result = gegkpsPublicSoap.TCKimlikNoDogrula(Long.parseLong(candidate.getNationalIdNo()),
                    candidate.getFirstName().toUpperCase(),
                    candidate.getLastName().toUpperCase(),
                    candidate.getBirthYear());

            return result;
        } catch (Exception e) {
            e.printStackTrace();

            return false;
        }
    }
}
