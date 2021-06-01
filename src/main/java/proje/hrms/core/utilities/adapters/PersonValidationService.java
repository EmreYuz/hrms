package proje.hrms.core.utilities.adapters;

import proje.hrms.entities.concretes.Candidate;

public interface PersonValidationService {
    boolean isValidatedPerson(Candidate candidate);
}
