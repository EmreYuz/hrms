package proje.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proje.hrms.business.abstracts.JobExperienceForCvService;
import proje.hrms.core.utilities.result.DataResult;
import proje.hrms.core.utilities.result.Result;
import proje.hrms.entities.concretes.JobExperienceForCV;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/jobExperiences")
public class JobExperiencesForCvController {

    private JobExperienceForCvService jobExperienceForCvService;

    @Autowired
    public JobExperiencesForCvController(JobExperienceForCvService jobExperienceForCvService) {
        this.jobExperienceForCvService = jobExperienceForCvService;
    }

    @PostMapping("/add")
    public Result add(@Valid @RequestBody JobExperienceForCV jobExperienceForCV){
        return this.jobExperienceForCvService.add(jobExperienceForCV);
    }

    @GetMapping("/getJobExperienceForCVByCandidate_IdOrderByWorkingQuitDateDesc")
    public DataResult<List<JobExperienceForCV>> getJobExperienceForCVByCandidate_IdOrderByWorkingQuitDateDesc(@RequestParam int id){
        return this.jobExperienceForCvService.getJobExperienceForCVByCandidate_IdOrderByWorkingQuitDateDesc(id);
    }
}
