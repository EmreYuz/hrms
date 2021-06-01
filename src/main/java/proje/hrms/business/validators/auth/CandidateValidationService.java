package proje.hrms.business.validators.auth;

import proje.hrms.entities.concretes.Candidate;

public interface CandidateValidationService {
    boolean isValidated(Candidate candidate);
}
