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
    @GeneratedValue
    private Long medicalConditionId;

    @ManyToOne
    private C_Eligible_Family_Account accountNo;

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false)
    private boolean anemia ;


    @Column(nullable = false)
    private boolean congenital ;


    @Column(nullable = false)
    private boolean rheumaticHeartDisease;


    @Column(nullable = false)
    private boolean diabetesMellitus ;


    @Column(nullable = false)
    private boolean hypertension ;


    @Column(nullable = false)
    private boolean hypercholesterolemia ;


    @Column(nullable = false)
    private boolean asthma ;


    @Column(nullable = false)
    private boolean thyroid ;


    @Column(nullable = false)
    private boolean untratedDecayedTeeth ;


    @Column(nullable = false)
    private boolean toothDecayBleedingGums ;


    @Column(nullable = false)
    private boolean mentalIllnesses ;


    @Column(nullable = false)
    private boolean rheumaticFever ;


    @Column(nullable = false)
    private boolean epilepsy ;


    @Column(nullable = false)
    private boolean foodAllergies ;


    @Column(nullable = false)
    private boolean drugsAllergies ;


    @Column(nullable = false)
    private boolean longTermMedicine ;


    @Column(nullable = false)
    private boolean otherSurgeries ;


    @Column(nullable = false)
    private boolean rubellaVaccine ;


    @Column(nullable = false)
    private boolean folicAcid ;


    @Column(nullable = false)
    private boolean bloodRelationMarrage ;

}
