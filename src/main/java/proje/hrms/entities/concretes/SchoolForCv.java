package proje.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "schools")
public class SchoolForCv {

    public void setSchoolGraduateDate(LocalDate schoolGraduateDate) {

        if(schoolGraduateDate != null){
            this.schoolGraduateDate = schoolGraduateDate;
        } else {
            String message= "Devam ediyor.";
            this.schoolGraduateDate=LocalDate.now();
            System.out.println(message);
        }
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "school_id")
    private int schoolId;

    @Column(name = "school_name")
    @NotBlank
    @NotNull
    private String schoolName;

    @Column(name = "school_department")
    @NotBlank
    @NotNull
    private String schoolDepartment;

    @Column(name = "school_start_date")
    private LocalDate schoolStartDate;

    @Column(name = "school_graduate_date")
    private LocalDate schoolGraduateDate;


    @ManyToOne()
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;
}
