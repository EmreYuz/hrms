package proje.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proje.hrms.business.abstracts.ProgrammingSkillService;
import proje.hrms.core.utilities.result.DataResult;
import proje.hrms.core.utilities.result.Result;
import proje.hrms.entities.concretes.ProgrammingSkillForCv;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/programmingSkills")
public class ProgrammingSkillsForCvController {

    private ProgrammingSkillService programmingSkillService;

    @Autowired
    public ProgrammingSkillsForCvController(ProgrammingSkillService programmingSkillService) {
        this.programmingSkillService = programmingSkillService;
    }

    @PostMapping("/add")
    public Result add(@Valid @RequestBody ProgrammingSkillForCv programmingSkillForCv){
        return this.programmingSkillService.add(programmingSkillForCv);
    }

    @PostMapping("/update")
    public Result update(@Valid @RequestBody ProgrammingSkillForCv programmingSkillForCv){
        return this.programmingSkillService.update(programmingSkillForCv);
    }

    @PostMapping("/delete")
    public DataResult<ProgrammingSkillForCv> deleteByProgrammingSkillId(@RequestParam int id){
        return this.programmingSkillService.deleteByProgrammingSkillId(id);
    }
}
