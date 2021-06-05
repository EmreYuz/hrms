package proje.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "foreign_languages")
public class ForeignLanguageForCV {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "foreign_language_id")
    private int foreignLanguageId;

    @Column(name = "language")
    @NotBlank
    @NotNull
    private String language;

    @Column(name = "level")
    @NotBlank
    @NotNull
    private int level;


    @ManyToOne()
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;

}
