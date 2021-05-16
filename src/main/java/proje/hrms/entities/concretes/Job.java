package proje.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "jobs")
public class Job {

    @Id
    @GeneratedValue
    @Column(name = "job_id")
    private int jobId;

    @Column(name = "job_name")
    private String jobName;

    @Column(name = "job_description")
    private String jobDescription;
}
