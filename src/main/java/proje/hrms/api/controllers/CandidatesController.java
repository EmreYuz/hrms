package proje.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import proje.hrms.business.abstracts.CandidateService;
import proje.hrms.core.utilities.result.DataResult;
import proje.hrms.core.utilities.result.ErrorDataResult;
import proje.hrms.entities.concretes.Candidate;
import proje.hrms.entities.dtos.CvDto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/candidates")
public class CandidatesController {

    private CandidateService candidateService;


    @Autowired
    public CandidatesController(CandidateService candidateService) {
        this.candidateService = candidateService;
    }

    @ExceptionHandler({MethodArgumentNotValidException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorDataResult<Object> handleValidationException(MethodArgumentNotValidException exceptions) {
        Map<String, String> validationErrors = new HashMap<String, String>();
        for (FieldError fieldError : exceptions.getBindingResult().getFieldErrors()) {
            validationErrors.put(fieldError.getField(), fieldError.getDefaultMessage());
        }

        ErrorDataResult<Object> errors = new ErrorDataResult<Object>(validationErrors, "Doğrulama hataları");

        return errors;
    }

    @GetMapping("/getAll")
    public DataResult<List<Candidate>> getAll(){

        return this.candidateService.getAll();
    }

    @GetMapping("getCvByCandidateId")
    public DataResult <CvDto> getCvByCandidateId(@RequestParam int id){
        return this.candidateService.getCvByCandidateId(id);
    }

}
