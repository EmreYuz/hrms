package proje.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import proje.hrms.business.abstracts.CandidateService;
import proje.hrms.business.abstracts.ImageForCvService;
import proje.hrms.core.utilities.result.DataResult;
import proje.hrms.core.utilities.result.Result;
import proje.hrms.entities.concretes.Candidate;
import proje.hrms.entities.concretes.ImageForCv;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/images")
public class ImagesForCvController {

    private ImageForCvService imageForCvService;
    private CandidateService candidateService;

    @Autowired
    public ImagesForCvController(ImageForCvService imageForCvService, CandidateService candidateService) {
        this.imageForCvService = imageForCvService;
        this.candidateService = candidateService;
    }

    @PostMapping("/add")
    public Result add(@RequestParam(value = "id") int id, @RequestParam(value = "imageFile") MultipartFile imageFile) {
        Candidate candidate = this.candidateService.getById(id).getData();
        ImageForCv imageForCv = new ImageForCv();
        imageForCv.setCandidate(candidate);
        return this.imageForCvService.add(imageForCv, imageFile);
    }

    @PostMapping("/update")
    public Result update(@Valid @RequestBody ImageForCv imageForCv) {
        return this.imageForCvService.update(imageForCv);

    }

    @PostMapping("/delete")
    public Result delete(@RequestParam int id) {
        return this.imageForCvService.delete(id);
    }

    public DataResult<ImageForCv> findImageForCvByCandidate_Id(@RequestParam int id) {
        return this.imageForCvService.findImageForCvByCandidate_Id(id);
    }

    public DataResult<List<ImageForCv>> getAll() {
        return this.imageForCvService.getAll();
    }
}
