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

    private String mohRemarkByMidwife;
    private String phmRemarkByMidwife;
    private String wifeNameRemarkByMidwife;
    private String husbandNameRemarkByMidwife;
    private String emailRemarkByMidwife;
    private String telephoneRemarkByMidwife;
    private String addressRemarkByMidwife;
    private String dobRemarkByMidwife;
    private String educationalLevelRemarkByMidwife;
    private String occupationRemarkByMidwife;
    private String marriedDateRemarkByMidwife;
    private String anemiaRemarkByMidwife ;
    private String congenitalRemarkByMidwife ;
    private String rheumaticHeartDiseaseRemarkByMidwife;
    private String diabetesMellitusRemarkByMidwife ;
    private String hypertensionRemarkByMidwife ;
    private String hypercholesterolemiaRemarkByMidwife ;
    private String asthmaRemarkByMidwife ;
    private String thyroidRemarkByMidwife ;
    private String untratedDecayedTeethRemarkByMidwife ;
    private String toothDecayBleedingGumsRemarkByMidwife ;
    private String mentalIllnessesRemarkByMidwife ;
    private String rheumaticFeverRemarkByMidwife ;
    private String epilepsyRemarkByMidwife ;
    private String foodAllergiesRemarkByMidwife ;
    private String drugsAllergiesRemarkByMidwife ;
    private String longTermMedicineRemarkByMidwife ;
    private String otherSurgeriesRemarkByMidwife ;
    private String rubellaVaccineRemarkByMidwife ;
    private String folicAcidRemarkByMidwife ;
    private String bloodRelationMarrageRemarkByMidwife ;
    private String regularMonthlyPeriodRemarkByMidwife;
    private String noOfPeriodDaysRemarkByMidwife;
    private String heavyBleedingRemarkByMidwife;
    private String vaginaBleedingRemarkByMidwife;
    private String abdominalPainRemarkByMidwife;
    private String unusualColorFoulSmellingRemarkByMidwife;
    private String abortionHistoryRemarkByMidwife;
    private String stillBirthHistoryRemarkByMidwife;
    private String infantMortalityHistoryRemarkByMidwife;
    private String tubalPregnancyHistoryRemarkByMidwife;
    private String isItchingRemarkByMidwife;
    private String reproductiveOrganSurgeryRemarkByMidwife;
    private String reproductiveOrganSurgeryDetailsRemarkByMidwife;
    private String sexualProblemsRemarkByMidwife;
    private String satisfiedSexualRelationshipRemarkByMidwife;
    private String breastSelfExamRemarkByMidwife;
    private String familyPlanningRemarkByMidwife;
    private String familyPlanningDetailsRemarkByMidwife;
    private String delayingFirstChildRemarkByMidwife;
    private String delayingTimePeriodRemarkByMidwife;
    private String hypertensionRemark;
    private String diabetesMellitusFamilyRemarkByMidwife;
    private String heartDiseasesFamilyRemarkByMidwife;
    private String nervousDisordersRemarkByMidwife;
    private String hemophiliaRemarkByMidwife;
    private String thalassemiaRemarkByMidwife;
    private String mentalProblemsRemarkByMidwife;
    private String twinsRemarkByMidwife;
}
