package proje.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="job_experiences")
public class JobExperienceForCV {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="job_experience_id")
    private int jobExperienceId;

    @Column(name="workplace_name")
    @NotBlank
    @NotNull
    private String workPlaceName;

    @Column(name="position")
    @NotBlank
    @NotNull
    private String position;

    @Column(name="working_start_date")
    @NotBlank
    @NotNull
    private int workingStartDate;

    @Column(name="working_quit_date")
    private int workingQuitDate;


    @ManyToOne()
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;
}
