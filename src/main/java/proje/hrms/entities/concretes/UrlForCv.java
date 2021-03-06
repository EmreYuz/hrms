package proje.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "candidate_urls")
public class UrlForCv {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "candidate_url_id")
    private int candidateUrlId;

    @Column(name = "candidate_url")
    private String url;


    @ManyToOne()
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;
}
