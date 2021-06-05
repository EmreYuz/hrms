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
@Table(name = "cover_letters")
public class CoverLetterForCv {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cover_letter_id")
    private int coverLetterId;

    @Column(name = "letter")
    @NotBlank
    @NotNull
    private String letter;

    @ManyToOne()
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;
}
