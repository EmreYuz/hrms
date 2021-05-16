package proje.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "job_seekers")
public class JobSeeker {

    @Id
    @GeneratedValue
    @Column(name = "job_seeker_id")
    private int jobSeekerId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "national_id_number")
    private String nationalIdNo;

    @Column(name = "birth_year")
    private int birthYear;

    @Column(name = "email")
    private String email;
}
