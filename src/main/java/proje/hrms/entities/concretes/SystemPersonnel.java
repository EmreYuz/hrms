package proje.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "system_personnel")
public class SystemPersonnel {

    @Id
    @GeneratedValue
    @Column(name = "system_personnel_id")
    private int systemPersonnelId;

    @Column(name = "system_personnel_description")
    private String systemPersonnelDescription;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "national_id_number")
    private String nationalIdNo;
}
