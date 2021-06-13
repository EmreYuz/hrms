package proje.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "foreign_languages")
public class ForeignLanguageForCV {

    public void setLevel(int level) {


        if (level < 0 || level > 5) {
            throw new IllegalArgumentException("Dil seviyeniz en düşük 1, en yüksek 5 olmalıdır.");
        } else {
            this.level = level;
        }
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "foreign_language_id")
    private int foreignLanguageId;

    @Column(name = "language")
    @NotBlank
    @NotNull
    private String language;

    @Column(name = "level")
    @NotNull
    private int level;


    @ManyToOne()
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;

}
