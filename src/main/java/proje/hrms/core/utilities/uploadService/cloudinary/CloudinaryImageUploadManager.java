package proje.hrms.core.utilities.uploadService.cloudinary;

import com.cloudinary.*;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import proje.hrms.core.utilities.result.DataResult;
import proje.hrms.core.utilities.result.ErrorDataResult;
import proje.hrms.core.utilities.result.SuccessDataResult;

import java.io.IOException;
import java.util.Map;

@Service
public class CloudinaryImageUploadManager implements ImageUploadService{

    private Cloudinary cloudinary;

    public CloudinaryImageUploadManager() {

        Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
                "cloud_name", "emre100",
                "api_key", "911119993683994",
                "api_secret", "AF8kOadRi_PrDdjkPJN-GkrMW2I"));
    }

    @Override
    public DataResult<Map> uploadImageFile(MultipartFile imageFile) {
        try {
            @SuppressWarnings("unchecked")
            Map<String, String> resultMap =(Map<String, String>) cloudinary.uploader().upload(imageFile.getBytes(), ObjectUtils.emptyMap());
            return new SuccessDataResult<Map>(resultMap);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        }
        return new ErrorDataResult<Map>();
    }
}
