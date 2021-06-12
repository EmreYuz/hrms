package proje.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "job_ads")
@AllArgsConstructor
@NoArgsConstructor
public class JobAd {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @JsonIgnore
    private int id;

    @Column(name = "description")
    @NotBlank
    @NotNull
    private String description;

    @Column(name = "open_position_number")
    @NotBlank
    @NotNull
    private int openPositionNumber;

    @Column(name = "min_salary")
    private int minSalary;

    @Column(name = "max_salary")
    private int maxSalary;

    @Column(name = "application_deadline")
    @NotBlank
    @NotNull
    private LocalDate applicationDeadline;

    @Column(name = "created_date")
    private LocalDate createdDate = LocalDate.now();

    @Column(name = "is_active", columnDefinition = "boolean default true")
    private boolean isActive = true;

    @Column(name = "is_deleted", columnDefinition = "boolean default false")
    private boolean isDeleted = false;


    @ManyToOne()
    @JoinColumn(name = "employer_id")
    private Employer employer;

    @ManyToOne()
    @NotBlank
    @NotNull
    @JoinColumn(name = "city_id")
    private City city;

    @ManyToOne()
    @NotBlank
    @NotNull
    @JoinColumn(name = "job_id")
    private Job job;

}
