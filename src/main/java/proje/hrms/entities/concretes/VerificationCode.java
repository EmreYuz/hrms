package proje.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "verification_codes")
public class VerificationCode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "employer_id")
    private int employerId;

    @Column(name = "email_verification_code")
    private String emailVerificationCode;

    @Column(name = "created_date", columnDefinition = "Date default CURRENT_DATE")
    private LocalDate createdDate = LocalDate.now();

    @Column(name = "expiration_date")  // ?
    private LocalDate expirationDate;

    @Column(name = "is_expired", columnDefinition = "boolean default false")
    private Boolean isExpired = false;

    @Column(name = "confirmed_date")  //  ?
    private LocalDate confirmedDate;

    public VerificationCode(int employerId, String emailVerificationCode, LocalDate expirationDate) {
        super();
        this.employerId = employerId;
        this.emailVerificationCode = emailVerificationCode;
        this.expirationDate = expirationDate;
    }
}
