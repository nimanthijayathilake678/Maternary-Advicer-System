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

    @OneToOne
    private User user;

    @Column(nullable = false)
    private boolean w_regularMonthlyPeriod;

    @Column(nullable = false)
    private int w_noOfPeriodDays;

    @Column(nullable = false)
    private boolean w_heavyBleeding;

    @Column(nullable = false)
    private boolean w_vaginaBleeding;

    @Column(nullable = false)
    private boolean w_abdominalPain;

    @Column(nullable = false)
    private boolean w_unusualColorFoulSmelling;

    @Column(nullable = false)
    private boolean w_abortionHistory;

    @Column(nullable = false)
    private boolean w_stillBirthHistory;

    @Column(nullable = false)
    private boolean w_infantMortalityHistory;

    @Column(nullable = false)
    private boolean w_tubalPregnancyHistory;

    @Column(nullable = false)
    private boolean w_isItching;

    @Column(nullable = false)
    private boolean w_reproductiveOrganSurgery;

    @Column(nullable = false)
    private String w_reproductiveOrganSurgeryDetails;

    @Column(nullable = false)
    private boolean w_sexualProblems;

    @Column(nullable = false)
    private boolean w_satisfiedSexualRelationship;

    @Column(nullable = false)
    private boolean w_breastSelfExam;

    @Column(nullable = false)
    private boolean h_isItching;

    @Column(nullable = false)
    private boolean h_reproductiveOrganSurgery;

    @Column(nullable = false)
    private String h_reproductiveOrganSurgeryDetails;

    @Column(nullable = false)
    private boolean h_sexualProblems;

    @Column(nullable = false)
    private boolean h_satisfiedSexualRelationship;

    @Column(nullable = false)
    private boolean familyPlanning;

    @Column(nullable = false)
    private String familyPlanningDetails;

    @Column(nullable = false)
    private boolean delayingFirstChild;

    @Column(nullable = false)
    private int delayingTimePeriod;

}
