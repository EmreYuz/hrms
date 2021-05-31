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
@PrimaryKeyJoinColumn(name = "user_id", referencedColumnName = "id")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "jobAdvertisements"})
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

    @Column(name = "is_email_verified")
    @NotBlank
    @NotNull
    private boolean isEmailVerified;

    @Column(name = "is_verified_by_system_personnel")
    @NotBlank
    @NotNull
    private Boolean isVerifiedBySystemPersonnel;


    @OneToMany(mappedBy = "id")
    private List<JobAd> jobAds;
}
