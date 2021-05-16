package proje.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "job_seeker_verification")
public class JobSeekerVerification {

    @Id
    @GeneratedValue
    @Column(name = "job_seeker_verification_id")
    private int jobSeekerVerificationId;

    @Column(name = "job_seeker_id")
    private int jobSeekerId;

    @Column(name = "job_seeker_is_verified_by_mernis")
    private boolean isVerifiedByMernis;

    @Column(name = "job_seeker_is_verified_by_email")
    private boolean isVerifiedByEmail;
}
