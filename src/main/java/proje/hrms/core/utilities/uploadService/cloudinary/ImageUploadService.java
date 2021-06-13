package proje.hrms.core.utilities.uploadService.cloudinary;

import org.springframework.web.multipart.MultipartFile;
import proje.hrms.core.utilities.result.DataResult;

import java.util.Map;

public interface ImageUploadService {

    DataResult<Map> uploadImageFile(MultipartFile imageFile);
}
