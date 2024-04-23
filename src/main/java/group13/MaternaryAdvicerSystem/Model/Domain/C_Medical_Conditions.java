package group13.MaternaryAdvicerSystem.Model.Domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
public class C_Medical_Conditions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long medicalConditionId;

    @OneToOne
    @JoinColumn(name = "user_id" , referencedColumnName ="id" )
    private User user;

    @Column(nullable = false)
    private boolean w_anemia ;


    @Column(nullable = false)
    private boolean w_congenital ;


    @Column(nullable = false)
    private boolean w_rheumaticHeartDisease;


    @Column(nullable = false)
    private boolean w_diabetesMellitus ;


    @Column(nullable = false)
    private boolean w_hypertension ;


    @Column(nullable = false)
    private boolean w_hypercholesterolemia ;


    @Column(nullable = false)
    private boolean w_asthma ;


    @Column(nullable = false)
    private boolean w_thyroid ;


    @Column(nullable = false)
    private boolean w_untratedDecayedTeeth ;


    @Column(nullable = false)
    private boolean w_toothDecayBleedingGums ;


    @Column(nullable = false)
    private boolean w_mentalIllnesses ;


    @Column(nullable = false)
    private boolean w_rheumaticFever ;


    @Column(nullable = false)
    private boolean w_epilepsy ;


    @Column(nullable = false)
    private boolean w_foodAllergies ;


    @Column(nullable = false)
    private boolean w_drugsAllergies ;


//    @Column(nullable = false)
//    private boolean w_longTermMedicine ;
//
//
//    @Column(nullable = false)
//    private boolean w_otherSurgeries ;
//
//
//    @Column(nullable = false)
//    private boolean w_rubellaVaccine ;
//
//
//    @Column(nullable = false)
//    private boolean w_folicAcid ;
//
//
//    @Column(nullable = false)
//    private boolean w_bloodRelationMarrage ;


    @Column(nullable = false)
    private boolean h_anemia ;


    @Column(nullable = false)
    private boolean h_congenital ;


    @Column(nullable = false)
    private boolean h_rheumaticHeartDisease;


    @Column(nullable = false)
    private boolean h_diabetesMellitus ;


    @Column(nullable = false)
    private boolean h_hypertension ;


    @Column(nullable = false)
    private boolean h_hypercholesterolemia ;


    @Column(nullable = false)
    private boolean h_asthma ;


    @Column(nullable = false)
    private boolean h_thyroid ;


    @Column(nullable = false)
    private boolean h_untratedDecayedTeeth ;


    @Column(nullable = false)
    private boolean h_toothDecayBleedingGums ;


    @Column(nullable = false)
    private boolean h_mentalIllnesses ;


    @Column(nullable = false)
    private boolean h_rheumaticFever ;


    @Column(nullable = false)
    private boolean h_epilepsy ;


    @Column(nullable = false)
    private boolean h_foodAllergies ;


    @Column(nullable = false)
    private boolean h_drugsAllergies ;


//    @Column(nullable = false)
//    private boolean h_longTermMedicine ;
//
//
//    @Column(nullable = false)
//    private boolean h_otherSurgeries ;

}
