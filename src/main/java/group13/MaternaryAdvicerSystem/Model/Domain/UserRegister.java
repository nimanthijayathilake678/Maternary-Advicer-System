package group13.MaternaryAdvicerSystem.Model.Domain;

import group13.MaternaryAdvicerSystem.Model.UserRole;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "userregister")
public class UserRegister {
    @Id
    private String id;
    @Column(nullable = false)
    private String fullName;
    @Column(nullable = false)
    private String nicNo;
    @Column(nullable = false)
    private Date birthday;
    @Column(nullable = false)
    private String contactNo;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String gender;
    @Column(nullable = false)
    private String marriedStatus;
    @Column(nullable = false)
    private String area;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    @Size(min = 8, max = 20)
    private String password;
    @Enumerated(EnumType.STRING)
    private UserRole Position;

}
