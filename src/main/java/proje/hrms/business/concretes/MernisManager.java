package proje.hrms.business.concretes;

import org.springframework.stereotype.Service;
import proje.hrms.business.abstracts.MernisService;
import proje.hrms.entities.concretes.JobSeeker;
import proje.hrms.mernis.GEGKPSPublicSoap;

@Service
public class MernisManager implements MernisService {
    @Override
    public boolean validateWithMernis(JobSeeker jobSeeker) throws Exception {
        GEGKPSPublicSoap gegkpsPublicSoap = new GEGKPSPublicSoap();
        if (gegkpsPublicSoap.TCKimlikNoDogrula(Long.parseLong(jobSeeker.getNationalIdNo()),
                jobSeeker.getFirstName(),
                jobSeeker.getLastName(),
                jobSeeker.getBirthYear())) {
            return true;
        } else {
            return false;
        }
    }
}
