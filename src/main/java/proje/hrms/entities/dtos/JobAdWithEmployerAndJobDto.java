package proje.hrms.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAdWithEmployerAndJobDto {

    private int jobAdId;
    private String companyName;
    private String jobName;
    private int openPositionNo;
    private LocalDate createdDate;
    private LocalDate applicationDeadline;
}
