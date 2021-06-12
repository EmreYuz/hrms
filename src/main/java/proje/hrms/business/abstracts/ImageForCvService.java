package proje.hrms.business.abstracts;

import org.springframework.web.multipart.MultipartFile;
import proje.hrms.core.utilities.result.DataResult;
import proje.hrms.core.utilities.result.Result;
import proje.hrms.entities.concretes.ImageForCv;

import java.util.List;

public interface ImageForCvService {

    Result add(ImageForCv imageForCv, MultipartFile imageFile);

    Result update(ImageForCv imageForCv);

    Result delete(int id);

    DataResult<ImageForCv> findImageForCvByCandidate_Id(int id);

    DataResult<List<ImageForCv>> getAll();
}
