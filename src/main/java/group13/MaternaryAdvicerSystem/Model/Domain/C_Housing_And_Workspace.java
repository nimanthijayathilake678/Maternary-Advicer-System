package group13.MaternaryAdvicerSystem.Model.Domain;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class C_Housing_And_Workspace {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long familyNutritionId;

    @ManyToOne
    private C_Eligible_Family_Account accountNo;

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false)
    private boolean exposedToChemical;

    @Column(nullable = false)
    private boolean exposedToLead;

    @Column(nullable = false)
    private boolean exposedToXRay;

    @Column(nullable = false)
    private boolean highTemperatureConditions;

    @Column(nullable = false)
    private boolean smokeFromCooking;

    @Column(nullable = false)
    private boolean noiseEnvironment;

    @Column(nullable = false)
    private boolean financialManagement;

    @Column(nullable = false)
    private boolean cleanSafeWater;

    @Column(nullable = false)
    private boolean toiletFacilities;

    @Column(nullable = false)
    private boolean properWasteDispsal;

    @Column(nullable = false)
    private boolean environmentalHazardousConditions;
}
