package proje.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proje.hrms.business.abstracts.ProgrammingSkillForCvService;
import proje.hrms.core.utilities.result.DataResult;
import proje.hrms.core.utilities.result.Result;
import proje.hrms.entities.concretes.ProgrammingSkillForCv;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/programmingSkills")
public class ProgrammingSkillsForCvController {

    private ProgrammingSkillForCvService programmingSkillForCvService;

    @Autowired
    public ProgrammingSkillsForCvController(ProgrammingSkillForCvService programmingSkillForCvService) {
        this.programmingSkillForCvService = programmingSkillForCvService;
    }

    @PostMapping("/add")
    public Result add(@Valid @RequestBody ProgrammingSkillForCv programmingSkillForCv){
        return this.programmingSkillForCvService.add(programmingSkillForCv);
    }

    @PostMapping("/update")
    public Result update(@Valid @RequestBody ProgrammingSkillForCv programmingSkillForCv){
        return this.programmingSkillForCvService.update(programmingSkillForCv);
    }

    @PostMapping("/delete")
    public DataResult<ProgrammingSkillForCv> deleteByProgrammingSkillId(@RequestParam int id){
        return this.programmingSkillForCvService.deleteByProgrammingSkillId(id);
    }
}
