package group13.MaternaryAdvicerSystem.Model.Domain;
import com.fasterxml.jackson.annotation.JsonIgnore;
import group13.MaternaryAdvicerSystem.Model.UserRole;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import lombok.*;
import org.hibernate.annotations.CollectionId;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
@Data
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
    private boolean familyFlag;

    @JsonIgnore
    @OneToOne(mappedBy = "user")
    private C_Personal_Info personalInfos;



    @JsonIgnore
    @OneToOne(mappedBy = "user")
    private C_Medical_Conditions medicalInfos;

    @JsonIgnore
    @OneToOne(mappedBy = "user")
    private C_Sexual_And_Reproductive_Health sexualAndReproductiveHealths;

    @JsonIgnore
    @OneToOne(mappedBy = "user")
    private C_Family_Health familyHealths;

    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private Set<C_Family_Nutrition> familyNutritions = new HashSet<>();

    @JsonIgnore
    @OneToOne(mappedBy = "user")
    private C_Life_Style lifeStyle;

    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private Set<C_Housing_And_Workspace> housingAndWorkspaces = new HashSet<>();

}
