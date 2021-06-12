package proje.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proje.hrms.business.abstracts.JobAdService;
import proje.hrms.core.utilities.result.DataResult;
import proje.hrms.core.utilities.result.Result;
import proje.hrms.entities.concretes.JobAd;
import proje.hrms.entities.dtos.JobAdWithEmployerAndJobDto;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/jobAds")
public class JobAdsController {

    private JobAdService jobAdService;

    @Autowired
    public JobAdsController(JobAdService jobAdService) {
        this.jobAdService = jobAdService;
    }

    @GetMapping("/getAll")
    public DataResult<List<JobAd>> getAll() {

        return this.jobAdService.getAll();
    }

    @GetMapping("/getJobAdsByIsActive")
    public DataResult<List<JobAd>> getJobAdsByIsActive() {

        return this.jobAdService.getJobAdsByIsActive();
    }

    @GetMapping("/getJobAdsByIsActiveOrderedByCreatedDateDesc")
    public DataResult<List<JobAd>> getJobAdsByIsActiveOrderedByCreatedDateDesc() {
        return this.jobAdService.getJobAdsByIsActiveOrderedByCreatedDateDesc();
    }

    @GetMapping("/getJobAdsByEmployerAndIsActive")
    public DataResult<List<JobAd>> getJobAdsByEmployerAndIsActive(int employerId) {
        return this.jobAdService.getJobAdsByEmployerAndIsActive(employerId);
    }

    @PostMapping("/add")
    public Result add(@Valid @RequestBody JobAd jobAd){

        return this.jobAdService.add(jobAd);
    }

}
