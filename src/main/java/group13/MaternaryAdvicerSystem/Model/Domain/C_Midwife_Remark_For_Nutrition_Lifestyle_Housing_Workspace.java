package group13.MaternaryAdvicerSystem.Model.Domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long othermidwifeRemarkNo;

    @OneToOne
    @JoinColumn(name = "user_id" , referencedColumnName ="id" )
    private User user;

    private String threeMainMealsRemarkByMidwife;
    private String animalProteinsRemarkByMidwife;
    private String plantProteinsGrainsRemarkByMidwife;
    private String vegetablesRemarkByMidwife;
    private String greensRemarkByMidwife;
    private String fruitsRemarkByMidwife;
    private String havingMealTogetherRemarkByMidwife;
    private String includingGardenHarvestRemarkByMidwife;
    private String tooMuchSugarRemarkByMidwife;
    private String tooMuchOilRemarkByMidwife;
    private String useCigarettesBetelLeavesTobacoRemarkByMidwife;
    private String useLiquorRemarkByMidwife;
    private String useDrugsRemarkByMidwife;
    private String hangoutWithSmokingPeopleRemarkByMidwife;
    private String atmosphereNotPhysicallyMentalyAbusiveRemarkByMidwife;
    private String dailyReligiousRitualRemarkByMidwife;
    private String regularExerciseRemarkByMidwife;
    private String timeForHobbiesRemarkByMidwife;
    private String exposedToChemicalRemarkByMidwife;
    private String exposedToLeadRemarkByMidwife;
    private String exposedToXRayRemarkByMidwife;
    private String highTemperatureConditionsRemarkByMidwife;
    private String smokeFromCookingRemarkByMidwife;
    private String noiseEnvironmentRemarkByMidwife;
    private String financialManagementRemarkByMidwife;
    private String cleanSafeWaterRemarkByMidwife;
    private String toiletFacilitiesRemarkByMidwife;
    private String properWasteDispsalRemarkByMidwife;
    private String environmentalHazardousConditionsRemarkByMidwife;
}
