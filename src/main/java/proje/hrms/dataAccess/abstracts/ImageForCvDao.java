package proje.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import proje.hrms.entities.concretes.ImageForCv;

public interface ImageForCvDao extends JpaRepository<ImageForCv, Integer> {

    ImageForCv findImageForCvByCandidate_Id(int id);

    ImageForCv getImageForCvById(int id);
}
