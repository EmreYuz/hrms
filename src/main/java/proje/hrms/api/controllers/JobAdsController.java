package proje.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import proje.hrms.business.abstracts.JobAdService;
import proje.hrms.core.utilities.result.DataResult;
import proje.hrms.entities.concretes.JobAd;
import proje.hrms.entities.dtos.JobAdWithEmployerAndJobDto;

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
    public DataResult<List<JobAd>> getAll(){
        return this.jobAdService.getAll();
    }

    @GetMapping("/getJobAdsByIsActive")
    public DataResult<List<JobAd>> getJobAdsByIsActive(){
        return this.jobAdService.getJobAdsByIsActive();
    }

    @GetMapping("/getJobAdsByIsActiveOrderedByCreatedDateDesc")
    public DataResult<List<JobAd>> getJobAdsByIsActiveOrderedByCreatedDateDesc(){
        return this.jobAdService.getJobAdsByIsActiveOrderedByCreatedDateDesc();
    }
    @GetMapping("/getJobAdsByEmployerAndIsActive")
    public DataResult<List<JobAd>> getJobAdsByEmployerAndIsActive(int employerId){
        return this.jobAdService.getJobAdsByEmployerAndIsActive(employerId);
    }
}
