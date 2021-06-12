package proje.hrms.business.abstracts;

import proje.hrms.core.utilities.result.Result;
import proje.hrms.entities.concretes.CoverLetterForCv;

public interface CoverLetterForCvService {

    Result add(CoverLetterForCv coverLetterForCv);

    Result update(CoverLetterForCv coverLetterForCv);

    Result delete(int id);
}
