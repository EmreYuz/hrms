package proje.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import proje.hrms.business.abstracts.JobService;
import proje.hrms.entities.concretes.Job;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobsController {

    JobService jobService;

    @Autowired
    public JobsController(JobService jobService) {
        this.jobService = jobService;
    }

    List<Job> getAll() {
        return this.jobService.getAll();
    }
}
