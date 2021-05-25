package proje.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "employer_verifications")
@AllArgsConstructor
@NoArgsConstructor
public class EmployerVerification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
