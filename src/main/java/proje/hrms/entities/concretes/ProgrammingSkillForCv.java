package proje.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "programming_skills")
public class ProgrammingSkillForCv {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "programming_skill_id")
    private int programmingSkillId;

    @Column(name = "programming_skill_name")
    @NotBlank
    @NotNull
    private String programmingSkillName;


    @ManyToOne()
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;
}
