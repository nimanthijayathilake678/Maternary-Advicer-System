package group13.MaternaryAdvicerSystem.Model.Domain;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class C_Family_Nutrition {
    @Id
    @GeneratedValue
    private Long familyNutritionId;

    @ManyToOne
    private C_Eligible_Family_Account accountNo;

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false)
    private boolean threeMainMeals;


    @Column(nullable = false)
    private boolean animalProteins;


    @Column(nullable = false)
    private boolean plantProteinsGrains;


    @Column(nullable = false)
    private boolean vegetables;


    @Column(nullable = false)
    private boolean greens;


    @Column(nullable = false)
    private boolean fruits;


    @Column(nullable = false)
    private boolean havingMealTogether;


    @Column(nullable = false)
    private boolean includingGardenHarvest;


    @Column(nullable = false)
    private boolean tooMushSugar;


    @Column(nullable = false)
    private boolean tooMuchOil;
}
