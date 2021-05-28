package proje.hrms.api.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proje.hrms.business.abstracts.EmployerService;
import proje.hrms.core.utilities.result.DataResult;
import proje.hrms.core.utilities.result.Result;
import proje.hrms.entities.concretes.Employer;


import java.util.List;

@RestController
@RequestMapping("/api/employers")
public class EmployersController {

    private EmployerService employerService;

    @Autowired
    public EmployersController(EmployerService employerService) {
        this.employerService = employerService;
    }

    @GetMapping("/getAll")
    public DataResult<List<Employer>> getAll() {
        return this.employerService.getAll();
    }

    @PostMapping("/register")
    public Result register(@RequestBody Employer employer) {
        return this.employerService.register(employer);
    }

    @GetMapping("/getEmployerByEmail")
    public DataResult<Employer> getEmployerByEmail(@RequestParam String email) {
        return this.employerService.getEmployerByEmail(email);
    }
}
