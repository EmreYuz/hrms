package proje.hrms.business.abstracts;

import proje.hrms.entities.concretes.Job;

import java.util.List;

public interface JobService {

    List<Job> getAll();
}
