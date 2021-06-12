package proje.hrms.entities.concretes;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "candidates")
@EqualsAndHashCode(callSuper = false)
@PrimaryKeyJoinColumn(name = "user_id", referencedColumnName = "id")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "jobAds"})
public class Candidate extends User {

    @Column(name = "first_name")
    @NotBlank
    @NotNull
    private String firstName;

    @Column(name = "last_name")
    @NotBlank
    @NotNull
    private String lastName;

    @Column(name = "national_id_no")
    @NotBlank
    @NotNull
    private String nationalIdNo;

    @Column(name = "birth_year")
    @NotBlank
    @NotNull
    private Integer birthYear;

    @Column(name = "is_verified_by_email", columnDefinition = "boolean default false")
    @NotBlank
    @NotNull
    @JsonIgnore
    private Boolean isEmailVerified = false;

    @Column(name = "is_verified_by_mernis", columnDefinition = "boolean default false")
    @NotBlank
    @NotNull
    @JsonIgnore
    private Boolean isMernisVerified = false;


    @JsonIgnore
    @OneToMany(mappedBy = "candidate")
    private List<SchoolForCv> schools;

    @JsonIgnore
    @OneToMany(mappedBy = "candidate")
    private List<ProgrammingSkillForCv> programingSkills;

    @JsonIgnore
    @OneToMany(mappedBy = "candidate")
    private List<UrlForCv> urls;

    @JsonIgnore
    @OneToMany(mappedBy = "candidate")
    private List<ForeignLanguageForCV> languages;

    @JsonIgnore
    @OneToMany(mappedBy = "candidate")
    private List<JobExperienceForCV> experiences;

    @JsonIgnore
    @OneToMany(mappedBy = "candidate")
    private List<CoverLetterForCv> coverLetters;

    @OneToOne(mappedBy = "candidate", optional=false, fetch=FetchType.LAZY)
    @JsonIgnore
    private ImageForCv imageForCv;
}
