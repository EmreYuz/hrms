package proje.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import proje.hrms.business.abstracts.AuthService;
import proje.hrms.business.abstracts.EmployerService;
import proje.hrms.core.utilities.result.Result;
import proje.hrms.entities.concretes.Employer;
import proje.hrms.entities.concretes.SystemPersonnel;

@RestController
@RequestMapping("/api/employers")
public class EmployersController {

    private EmployerService employerService;

    @Autowired
    public EmployersController(EmployerService employerService) {

        this.employerService = employerService;
    }

    @PostMapping("/add")
    public Result add(Employer employer) {
        return this.employerService.add(employer);
    }

    @PostMapping("/update")
    public Result update(Employer employer) {
        return this.employerService.update(employer);
    }

    @PostMapping("/delete")
    public Result delete(int id) {
        return this.employerService.delete(id);
    }

}
