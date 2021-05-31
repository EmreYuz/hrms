package proje.hrms.core.utilities.adapters.services;

import proje.hrms.entities.concretes.Candidate;

public interface PersonValidationService {
    boolean isValidatedPerson(Candidate candidate);
}
