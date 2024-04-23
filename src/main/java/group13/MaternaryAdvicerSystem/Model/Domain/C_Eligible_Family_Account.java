package group13.MaternaryAdvicerSystem.Model.Domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Data
public class C_Eligible_Family_Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long registrationNo;

    @Column(nullable = false)
    private String moh;

    @Column(nullable = false)
    private String phm;

    @Column(nullable = false)
    private String wifeName;

    @Column(nullable = false)
    private String husbandName;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String telephone;

    @Column(nullable = false)
    private String address;

//    @OneToMany(mappedBy = "accountNo")
//    private Set<C_Personal_Info> personalInfos = new HashSet<>();

//    @OneToMany(mappedBy = "accountNo")
//    private Set<C_Medical_Conditions> medicalInfos = new HashSet<>();

//    @OneToMany(mappedBy = "accountNo")
//    private Set<C_Sexual_And_Reproductive_Health> sexualAndReproductiveHealths = new HashSet<>();

//    @OneToMany(mappedBy = "accountNo")
//    private Set<C_Other_Sexual_And_Reproductive_Health> otherSexualAndReproductiveHealths = new HashSet<>();

//    @OneToMany(mappedBy = "accountNo")
//    private Set<C_Family_Health> familyHealths = new HashSet<>();

//    @OneToMany(mappedBy = "accountNo")
//    private Set<C_Family_Nutrition> familyNutritions = new HashSet<>();

//    @OneToMany(mappedBy = "accountNo")
//    private Set<C_Housing_And_Workspace> housingAndWorkspaces = new HashSet<>();






}
