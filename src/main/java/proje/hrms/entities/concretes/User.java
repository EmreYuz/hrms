package proje.hrms.entities.concretes;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "email")
    @NotBlank
    @NotNull
    @Email
    private String email;

    @Column(name = "password")
    @NotBlank
    @NotNull
    private String password;

    @NotBlank
    @NotNull
    private String passwordAgain;

    @JsonIgnore
    @Column(name = "is_active", columnDefinition = "boolean default true")
    private Boolean isActive = true;

    @JsonIgnore
    @Column(name = "is_deleted", columnDefinition = "boolean default false")
    private Boolean isDeleted = false;

    @JsonIgnore
    @Column(name = "created_date", columnDefinition = "Date default CURRENT_DATE")
    private LocalDate createdDate = LocalDate.now();
}
