package proje.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proje.hrms.business.abstracts.UrlForCvService;
import proje.hrms.core.utilities.result.DataResult;
import proje.hrms.core.utilities.result.Result;
import proje.hrms.entities.concretes.UrlForCv;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/urls")
public class UrlsForCvController {

    private UrlForCvService urlForCvService;

    @Autowired
    public UrlsForCvController(UrlForCvService urlForCvService) {
        this.urlForCvService = urlForCvService;
    }

    @PostMapping("/addUrl")
    public Result addUrl(@Valid @RequestBody UrlForCv urlForCv) {
        return this.urlForCvService.addUrl(urlForCv);
    }

    @PostMapping("updateUrl")
    public Result updateUrl(@Valid @RequestBody UrlForCv urlForCv) {

        return this.urlForCvService.updateUrl(urlForCv);
    }

    @PostMapping("deleteUrl")
    public Result deleteUrl(@RequestParam int id) {

        return this.urlForCvService.deleteUrl(id);
    }

    @GetMapping("getUrlForCvByCandidate_Id")
    public DataResult<List<UrlForCv>> getUrlForCvByCandidate_Id(@RequestParam int id) {

        return this.urlForCvService.getUrlForCvByCandidate_Id(id);
    }

    @GetMapping("getAll")
    public DataResult<List<UrlForCv>> getAll() {

        return this.urlForCvService.getAll();
    }

}
