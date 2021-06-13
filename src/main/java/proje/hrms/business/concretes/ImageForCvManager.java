package proje.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import proje.hrms.business.abstracts.ImageForCvService;
import proje.hrms.core.utilities.result.DataResult;
import proje.hrms.core.utilities.result.Result;
import proje.hrms.core.utilities.result.SuccessDataResult;
import proje.hrms.core.utilities.result.SuccessResult;
import proje.hrms.core.utilities.uploadService.cloudinary.ImageUploadService;
import proje.hrms.dataAccess.abstracts.ImageForCvDao;
import proje.hrms.entities.concretes.ImageForCv;

import java.util.List;
import java.util.Map;

@Service
public class ImageForCvManager implements ImageForCvService {

    private ImageForCvDao imageForCvDao;
    private ImageUploadService imageUploadService;

    @Autowired
    public ImageForCvManager(ImageForCvDao imageForCvDao, ImageUploadService imageUploadService) {
        this.imageForCvDao = imageForCvDao;
        this.imageUploadService = imageUploadService;
    }


    // burası kontrol edilecek!!!!!
    @Override
    public Result add(ImageForCv imageForCv, MultipartFile imageFile) {
//        Map<String, String> uploadImage = ((Map<String, String>) this.imageUploadService.uploadImageFile(imageFile));

        Map<String,String> uploadImage = this.imageUploadService.uploadImageFile(imageFile).getData();
        imageForCv.setImageUrl(uploadImage.get("imageUrl"));
        this.imageForCvDao.save(imageForCv);
        return new SuccessResult("Fotoğraf eklendi.");
    }

    @Override
    public Result update(ImageForCv imageForCv) {
        ImageForCv imageForCvToUpdate = this.imageForCvDao.getImageForCvById(imageForCv.getId());
        this.imageForCvDao.save(imageForCvToUpdate);
        return new SuccessResult("Fotoğraf güncellendi.");
    }

    @Override
    public Result delete(int id) {
        this.imageForCvDao.deleteById(id);
        return new SuccessResult("Fotoğraf silindi.");
    }

    @Override
    public DataResult<ImageForCv> findImageForCvByCandidate_Id(int id) {

        return new SuccessDataResult<ImageForCv>(this.imageForCvDao.findImageForCvByCandidate_Id(id));
    }

    @Override
    public DataResult<List<ImageForCv>> getAll() {

        return new SuccessDataResult<List<ImageForCv>>(this.imageForCvDao.findAll());
    }

    @Override
    public DataResult<ImageForCv> getImageForCvById(int id) {
        return new SuccessDataResult<ImageForCv>(this.imageForCvDao.getImageForCvById(id));
    }
}
