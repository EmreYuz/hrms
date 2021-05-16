package proje.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="employers")
public class Employer {

    @Id
    @GeneratedValue
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
}
