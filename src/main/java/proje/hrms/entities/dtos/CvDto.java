package proje.hrms.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import proje.hrms.entities.concretes.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CvDto {

    private int cvId;
    private Candidate candidate;
    private List<CoverLetterForCv> coverLetters;
    private List<ForeignLanguageForCV> foreignLanguages;
    private List<JobExperienceForCV> jobExperiences;
    private List<ProgrammingSkillForCv> programmingSkills;
    private List<SchoolForCv> schools;
    private List<UrlForCv> urls;
    private ImageForCv image;
}
