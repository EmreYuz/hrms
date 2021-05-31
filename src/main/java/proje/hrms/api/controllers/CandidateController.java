package proje.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import proje.hrms.business.abstracts.AuthService;
import proje.hrms.business.abstracts.CandidateService;
import proje.hrms.core.utilities.result.Result;
import proje.hrms.entities.concretes.Candidate;

import java.util.List;

@RestController
@RequestMapping("api/candidates")
public class CandidateController {

    private CandidateService candidateService;
    private AuthService authService;

    @Autowired
    public CandidateController(CandidateService candidateService, AuthService authService) {
        this.candidateService = candidateService;
        this.authService = authService;
    }

    @GetMapping("/getAll")
    public List<Candidate> getAll(){

        return this.candidateService.getAll().getData();
    }

    @PostMapping("/registerCandidate")
    public Result registerCandidate(Candidate candidate){
        return this.authService.registerCandidate(candidate);
    }
}
