package group13.MaternaryAdvicerSystem.Model.Domain;
import group13.MaternaryAdvicerSystem.Model.UserRole;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   //@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String regNum;
    @Column(nullable = false)
    private String fullName;
    @Column(nullable = false)
    private String firstName;
    //@Column(nullable = false)
   // private String nicNo;
    @Column(nullable = false)
    private String lastName;
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
    @Size(min = 5, max = 30)
    private String username;
    @Column(nullable = false)
    @Size(min = 8, max = 20)
    private String password;
    @Enumerated(EnumType.STRING)
    private UserRole Position;
}
