package proje.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "employer_verification")
public class EmployerVerification {

    @Id
    @GeneratedValue
    @Column(name = "employer_verification_id")
    private int employerVerificationId;

    @Column(name = "employer_id")
    private int employerId;

    @Column(name = "employer_is_verified_by_email")
    private boolean verifiedByEmail;

    @Column(name = "employer_is_verified_by_personnel")
    private boolean verifiedByPersonnel;

    @Column(name = "verificator_personnel_id")
    private int verificatorPersonnelId;
}
