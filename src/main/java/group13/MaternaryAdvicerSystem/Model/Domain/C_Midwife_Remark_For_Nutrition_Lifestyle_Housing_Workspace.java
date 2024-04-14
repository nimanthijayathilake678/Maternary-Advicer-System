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


    @Column(nullable = false)
    private String threeMainMealsRemarkByMidwife;


    @Column(nullable = false)
    private String animalProteinsRemarkByMidwife;


    @Column(nullable = false)
    private String plantProteinsGrainsRemarkByMidwife;


    @Column(nullable = false)
    private String vegetablesRemarkByMidwife;


    @Column(nullable = false)
    private String greensRemarkByMidwife;


    @Column(nullable = false)
    private String fruitsRemarkByMidwife;


    @Column(nullable = false)
    private String havingMealTogetherRemarkByMidwife;


    @Column(nullable = false)
    private String includingGardenHarvestRemarkByMidwife;


    @Column(nullable = false)
    private String tooMuchSugarRemarkByMidwife;


    @Column(nullable = false)
    private String tooMuchOilRemarkByMidwife;

    @Column(nullable = false)
    private String useCigarettesBetelLeavesTobacoRemarkByMidwife;

    @Column(nullable = false)
    private String useLiquorRemarkByMidwife;

    @Column(nullable = false)
    private String useDrugsRemarkByMidwife;

    @Column(nullable = false)
    private String hangoutWithSmokingPeopleRemarkByMidwife;

    @Column(nullable = false)
    private String atmosphereNotPhysicallyMentalyAbusiveRemarkByMidwife;

    @Column(nullable = false)
    private String dailyReligiousRitualRemarkByMidwife;

    @Column(nullable = false)
    private String regularExerciseRemarkByMidwife;

    @Column(nullable = false)
    private String timeForHobbiesRemarkByMidwife;

    @Column(nullable = false)
    private String exposedToChemicalRemarkByMidwife;

    @Column(nullable = false)
    private String exposedToLeadRemarkByMidwife;

    @Column(nullable = false)
    private String exposedToXRayRemarkByMidwife;

    @Column(nullable = false)
    private String highTemperatureConditionsRemarkByMidwife;

    @Column(nullable = false)
    private String smokeFromCookingRemarkByMidwife;

    @Column(nullable = false)
    private String noiseEnvironmentRemarkByMidwife;

    @Column(nullable = false)
    private String financialManagementRemarkByMidwife;

    @Column(nullable = false)
    private String cleanSafeWaterRemarkByMidwife;

    @Column(nullable = false)
    private String toiletFacilitiesRemarkByMidwife;

    @Column(nullable = false)
    private String properWasteDispsalRemarkByMidwife;

    @Column(nullable = false)
    private String environmentalHazardousConditionsRemarkByMidwife;
}
