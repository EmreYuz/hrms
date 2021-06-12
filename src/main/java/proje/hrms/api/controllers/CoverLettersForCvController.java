package proje.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proje.hrms.business.abstracts.CoverLetterForCvService;
import proje.hrms.core.utilities.result.Result;
import proje.hrms.entities.concretes.CoverLetterForCv;

import javax.validation.Valid;

@RestController
@RequestMapping("/coverLetters")
public class CoverLettersForCvController {

    private CoverLetterForCvService coverLetterForCvService;

    @Autowired
    public CoverLettersForCvController(CoverLetterForCvService coverLetterForCvService) {
        this.coverLetterForCvService = coverLetterForCvService;
    }

    @PostMapping("/add")
    public Result add(@Valid @RequestBody CoverLetterForCv coverLetterForCv) {
        return this.coverLetterForCvService.add(coverLetterForCv);
    }

    @PostMapping("/update")
    public Result update(@Valid @RequestBody CoverLetterForCv coverLetterForCv) {
        return this.coverLetterForCvService.update(coverLetterForCv);
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam int id) {
        return this.coverLetterForCvService.delete(id);
    }
}
