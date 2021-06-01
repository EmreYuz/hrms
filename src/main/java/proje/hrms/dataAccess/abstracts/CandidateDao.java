package proje.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import proje.hrms.entities.concretes.Candidate;

import java.util.List;

public interface CandidateDao extends JpaRepository<Candidate, Integer> {

}
