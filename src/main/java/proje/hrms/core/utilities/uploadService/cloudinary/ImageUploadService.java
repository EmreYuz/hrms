package proje.hrms.core.utilities.uploadService.cloudinary;

import org.springframework.web.multipart.MultipartFile;
import proje.hrms.core.utilities.result.DataResult;

public interface ImageUploadService {

    DataResult<?> uploadImageFile(MultipartFile imageFile);
}
