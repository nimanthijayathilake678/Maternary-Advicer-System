package group13.MaternaryAdvicerSystem.Model.Domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class C_Midwife_Remark {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long midwifeRemarkNo;

    @OneToOne
    @JoinColumn(name = "user_id" , referencedColumnName ="id" )
    private User user;

    @Column(nullable = false)
    private String mohRemarkByMidwife;

    @Column(nullable = false)
    private String phmRemarkByMidwife;

    @Column(nullable = false)
    private String wifeNameRemarkByMidwife;

    @Column(nullable = false)
    private String husbandNameRemarkByMidwife;

    @Column(nullable = false)
    private String emailRemarkByMidwife;

    @Column(nullable = false)
    private String telephoneRemarkByMidwife;

    @Column(nullable = false)
    private String addressRemarkByMidwife;

    @Column(nullable = false)
    private String dobRemarkByMidwife;

    @Column(nullable = false)
    private String educationalLevelRemarkByMidwife;

    @Column(nullable = false)
    private String occupationRemarkByMidwife;

    @Column(nullable = false)
    private String marriedDateRemarkByMidwife;

    @Column(nullable = false)
    private String anemiaRemarkByMidwife ;


    @Column(nullable = false)
    private String congenitalRemarkByMidwife ;


    @Column(nullable = false)
    private String rheumaticHeartDiseaseRemarkByMidwife;


    @Column(nullable = false)
    private String diabetesMellitusRemarkByMidwife ;


    @Column(nullable = false)
    private String hypertensionRemarkByMidwife ;


    @Column(nullable = false)
    private String hypercholesterolemiaRemarkByMidwife ;


    @Column(nullable = false)
    private String asthmaRemarkByMidwife ;


    @Column(nullable = false)
    private String thyroidRemarkByMidwife ;


    @Column(nullable = false)
    private String untratedDecayedTeethRemarkByMidwife ;


    @Column(nullable = false)
    private String toothDecayBleedingGumsRemarkByMidwife ;


    @Column(nullable = false)
    private String mentalIllnessesRemarkByMidwife ;


    @Column(nullable = false)
    private String rheumaticFeverRemarkByMidwife ;


    @Column(nullable = false)
    private String epilepsyRemarkByMidwife ;


    @Column(nullable = false)
    private String foodAllergiesRemarkByMidwife ;


    @Column(nullable = false)
    private String drugsAllergiesRemarkByMidwife ;


    @Column(nullable = false)
    private String longTermMedicineRemarkByMidwife ;


    @Column(nullable = false)
    private String otherSurgeriesRemarkByMidwife ;


    @Column(nullable = false)
    private String rubellaVaccineRemarkByMidwife ;


    @Column(nullable = false)
    private String folicAcidRemarkByMidwife ;


    @Column(nullable = false)
    private String bloodRelationMarrageRemarkByMidwife ;

    @Column(nullable = false)
    private String regularMonthlyPeriodRemarkByMidwife;

    @Column(nullable = false)
    private String noOfPeriodDaysRemarkByMidwife;

    @Column(nullable = false)
    private String heavyBleedingRemarkByMidwife;

    @Column(nullable = false)
    private String vaginaBleedingRemarkByMidwife;

    @Column(nullable = false)
    private String abdominalPainRemarkByMidwife;

    @Column(nullable = false)
    private String unusualColorFoulSmellingRemarkByMidwife;

    @Column(nullable = false)
    private String abortionHistoryRemarkByMidwife;

    @Column(nullable = false)
    private String stillBirthHistoryRemarkByMidwife;

    @Column(nullable = false)
    private String infantMortalityHistoryRemarkByMidwife;

    @Column(nullable = false)
    private String tubalPregnancyHistoryRemarkByMidwife;

    @Column(nullable = false)
    private String isItchingRemarkByMidwife;

    @Column(nullable = false)
    private String reproductiveOrganSurgeryRemarkByMidwife;

    @Column(nullable = false)
    private String reproductiveOrganSurgeryDetailsRemarkByMidwife;

    @Column(nullable = false)
    private String sexualProblemsRemarkByMidwife;

    @Column(nullable = false)
    private String satisfiedSexualRelationshipRemarkByMidwife;

    @Column(nullable = false)
    private String breastSelfExamRemarkByMidwife;

    @Column(nullable = false)
    private String familyPlanningRemarkByMidwife;

    @Column(nullable = false)
    private String familyPlanningDetailsRemarkByMidwife;

    @Column(nullable = false)
    private String delayingFirstChildRemarkByMidwife;

    @Column(nullable = false)
    private String delayingTimePeriodRemarkByMidwife;

    @Column(nullable = false)
    private String hypertensionRemark;


    @Column(nullable = false)
    private String diabetesMellitusFamilyRemarkByMidwife;


    @Column(nullable = false)
    private String heartDiseasesFamilyRemarkByMidwife;


    @Column(nullable = false)
    private String nervousDisordersRemarkByMidwife;


    @Column(nullable = false)
    private String hemophiliaRemarkByMidwife;


    @Column(nullable = false)
    private String thalassemiaRemarkByMidwife;


    @Column(nullable = false)
    private String mentalProblemsRemarkByMidwife;


    @Column(nullable = false)
    private String twinsRemarkByMidwife;
}
