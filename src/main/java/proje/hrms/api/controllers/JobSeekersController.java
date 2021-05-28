package proje.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proje.hrms.business.abstracts.JobSeekerService;
import proje.hrms.core.utilities.result.DataResult;
import proje.hrms.core.utilities.result.Result;
import proje.hrms.entities.concretes.JobSeeker;

import java.util.List;

@RestController
@RequestMapping("/api/jobseekers")
public class JobSeekersController {

    private JobSeekerService jobSeekerService;

    @Autowired
    public JobSeekersController(JobSeekerService jobSeekerService) {
        this.jobSeekerService = jobSeekerService;
    }

    @GetMapping("/getall")
    public DataResult<List<JobSeeker>> getAll() {

        return this.jobSeekerService.getAll();
    }

    @PostMapping("/register")
    public Result register(@RequestBody JobSeeker jobSeeker) throws Exception {

        return this.jobSeekerService.register(jobSeeker);
    }

    @GetMapping("/getJobSeekerByEmailOrNationalIdNo")
    public DataResult<List<JobSeeker>> getJobSeekerByEmailOrNationalIdNo(@RequestParam String email, String nationalIdNo){
        return this.jobSeekerService.getJobSeekerByEmailOrNationalIdNo(email, nationalIdNo);
    }
}
