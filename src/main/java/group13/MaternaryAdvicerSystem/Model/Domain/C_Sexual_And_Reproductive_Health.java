package group13.MaternaryAdvicerSystem.Model.Domain;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Data
@Entity
public class C_Sexual_And_Reproductive_Health {
    @Id
    @GeneratedValue
    private Long sexualAndReproductiveId;

    @ManyToOne
    private C_Eligible_Family_Account accountNo;

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false)
    private boolean regularMonthlyPeriod;

    @Column(nullable = false)
    private int noOfPeriodDays;

    @Column(nullable = false)
    private boolean heavyBleeding;

    @Column(nullable = false)
    private boolean vaginaBleeding;

    @Column(nullable = false)
    private boolean abdominalPain;

    @Column(nullable = false)
    private boolean unusualColorFoulSmelling;

    @Column(nullable = false)
    private boolean abortionHistory;

    @Column(nullable = false)
    private boolean stillBirthHistory;

    @Column(nullable = false)
    private boolean infantMortalityHistory;

    @Column(nullable = false)
    private boolean tubalPregnancyHistory;

    @Column(nullable = false)
    private boolean isItching;

    @Column(nullable = false)
    private boolean reproductiveOrganSurgery;

    @Column(nullable = false)
    private String reproductiveOrganSurgeryDetails;

    @Column(nullable = false)
    private boolean sexualProblems;

    @Column(nullable = false)
    private boolean satisfiedSexualRelationship;

    @Column(nullable = false)
    private boolean breastSelfExam;


}
