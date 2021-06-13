package proje.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proje.hrms.business.abstracts.SchoolForCvService;
import proje.hrms.core.utilities.result.DataResult;
import proje.hrms.core.utilities.result.Result;
import proje.hrms.entities.concretes.SchoolForCv;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/schools")

public class SchoolsForCvController {

    private SchoolForCvService schoolForCvService;

    @Autowired
    public SchoolsForCvController(SchoolForCvService schoolForCvService) {
        this.schoolForCvService = schoolForCvService;
    }

    @PostMapping("/add")
    public Result add(@Valid @RequestBody SchoolForCv schoolForCv) {

        return this.schoolForCvService.add(schoolForCv);
    }

    @PostMapping("/update")
    public Result update(@Valid @RequestBody SchoolForCv schoolForCv) {

        return this.schoolForCvService.update(schoolForCv);
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam int id) {

        return this.schoolForCvService.delete(id);
    }

    @GetMapping("getSchoolsForCvByCandidate_Id")
    public DataResult<List<SchoolForCv>> getSchoolsForCvByCandidate_Id(@RequestParam int id) {
        return this.schoolForCvService.getSchoolsForCvByCandidate_Id(id);
    }

    @GetMapping("getSchoolForCvsByCandidate_IdOrderBySchoolGraduateDateDesc")
    public DataResult<List<SchoolForCv>> getSchoolForCvsByCandidate_IdOrderBySchoolGraduateDateDesc(@RequestParam int id) {
        return this.schoolForCvService.getSchoolForCvsByCandidate_IdOrderBySchoolGraduateDateDesc(id);
    }

    @GetMapping("getAllSchoolsSortedDesc")
    public DataResult<List<SchoolForCv>> getAllSchoolsSortedDesc(@Valid @RequestBody SchoolForCv schoolForCv) {
        return this.schoolForCvService.getAllSchoolsSortedDesc(schoolForCv);
    }
}
