package proje.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
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
    private String description;

    @Column(name = "open_position_number")
    private int openPositionNumber;

    @Column(name = "min_salary")
    private double minSalary;

    @Column(name = "max_salary")
    private double maxSalary;

    @Column(name = "application_deadline")
    private LocalDate applicationDeadline;

    @Column(name = "created_date")
    @JsonIgnore
    private LocalDate createdDate = LocalDate.now();

    @Column(name = "is_active", columnDefinition = "boolean default true")
    @JsonIgnore
    private boolean isActive = true;

    @Column(name = "is_deleted", columnDefinition = "boolean default false")
    @JsonIgnore
    private boolean isDeleted = false;

    @Column(name = "is_opened", columnDefinition = "boolean default true")
    private boolean isOpened = true;


    @ManyToOne()
    @JoinColumn(name = "id")
    private Employer employer;

    @ManyToOne()
    @JoinColumn(name = "id")
    private City city;

    @ManyToOne()
    @JoinColumn(name = "id")
    private Job job;

}