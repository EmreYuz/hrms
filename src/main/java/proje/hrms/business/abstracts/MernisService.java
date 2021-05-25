package proje.hrms.business.abstracts;

import proje.hrms.entities.concretes.JobSeeker;

public interface MernisService {
    boolean validateWithMernis(JobSeeker jobSeeker) throws Exception;
}
