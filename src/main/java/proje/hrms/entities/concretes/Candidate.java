package proje.hrms.entities.concretes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "candidates")
@EqualsAndHashCode(callSuper = false)
@PrimaryKeyJoinColumn(name = "user_id", referencedColumnName = "id")
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

    @Column(name = "is_verified_by_email")
    @NotBlank
    @NotNull
    private Boolean isEmailVerified;

    @Column(name = "is_verified_by_mernis")
    @NotBlank
    @NotNull
    private Boolean isMernisVerified;
}
