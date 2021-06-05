package proje.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import proje.hrms.business.abstracts.SchoolForCvService;
import proje.hrms.core.utilities.result.Result;
import proje.hrms.entities.concretes.SchoolForCv;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/schools")

public class SchoolsForCvController {

    private SchoolForCvService schoolForCvService;

    @Autowired
    public SchoolsForCvController(SchoolForCvService schoolForCvService) {
        this.schoolForCvService = schoolForCvService;
    }

    @PostMapping("/add")
    public Result add(@Valid SchoolForCv schoolForCv){

        return this.schoolForCvService.add(schoolForCv);
    }
}
