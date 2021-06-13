package proje.hrms.entities.concretes;

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
@Entity
@Table(name = "employers")
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "user_id")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "jobAds"})
@EqualsAndHashCode(callSuper = false)
public class Employer extends User {

    @Column(name = "phone_number")
    @NotBlank
    @NotNull
    private String phoneNumber;

    @Column(name = "company_name")
    @NotBlank
    @NotNull
    private String companyName;

    @Column(name = "website")
    @NotBlank
    @NotNull
    private String website;

    @Column(name = "is_email_verified", columnDefinition = "boolean default false")
    @NotBlank
    @NotNull
    private boolean isEmailVerified = false;

    @Column(name = "is_verified_by_system_personnel", columnDefinition = "boolean default false")
    @NotBlank
    @NotNull
    private Boolean isVerifiedBySystemPersonnel = false;


    @OneToMany(mappedBy = "employer")
    private List<JobAd> jobAds;
}
