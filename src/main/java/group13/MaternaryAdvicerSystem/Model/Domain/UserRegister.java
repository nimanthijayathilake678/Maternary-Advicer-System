package group13.MaternaryAdvicerSystem.Model.Domain;

import group13.MaternaryAdvicerSystem.Model.UserRole;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
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

    private String occupation;
    @Column(nullable = false)
    private String area;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;


}
