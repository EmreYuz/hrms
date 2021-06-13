package proje.hrms.api.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import proje.hrms.business.abstracts.ForeignLanguageForCvService;
import proje.hrms.core.utilities.result.Result;
import proje.hrms.core.utilities.result.SuccessResult;
import proje.hrms.entities.concretes.ForeignLanguageForCV;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/foreignLanguages")
public class ForeignLanguagesForCvController {

    private ForeignLanguageForCvService foreignLanguageForCvService;

    @Autowired
    public ForeignLanguagesForCvController(ForeignLanguageForCvService foreignLanguageForCvService) {
        this.foreignLanguageForCvService = foreignLanguageForCvService;
    }

    @PostMapping("/add")
    public Result add(@Valid @RequestBody ForeignLanguageForCV foreignLanguageForCV) {
        return this.foreignLanguageForCvService.add(foreignLanguageForCV);
    }

    @PostMapping("update")
    public Result update(ForeignLanguageForCV foreignLanguageForCV){
        return this.foreignLanguageForCvService.update(foreignLanguageForCV);
    }

    @PostMapping("/delete")
    public Result delete(int id){
        return this.foreignLanguageForCvService.delete(id);
    }
}
