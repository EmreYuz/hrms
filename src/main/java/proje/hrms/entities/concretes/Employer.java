package proje.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name="employers")
@AllArgsConstructor
@NoArgsConstructor
public class Employer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="employer_id")
    private int employerId;

    @Column(name="company_name")
    private String companyName;

    @Column(name="website")
    private String website;

    @Column(name="email")
    private String email;

    @Column(name="phone_number")
    private String phoneNumber;

    @OneToOne(mappedBy = "employer")
    private EmployerVerification employerVerification;
}
