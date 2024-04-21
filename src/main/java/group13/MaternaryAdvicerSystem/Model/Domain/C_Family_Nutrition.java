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
    private User user;

    @Column(nullable = false)
    private boolean w_threeMainMeals;


    @Column(nullable = false)
    private boolean w_animalProteins;


    @Column(nullable = false)
    private boolean w_plantProteinsGrains;


    @Column(nullable = false)
    private boolean w_vegetables;


    @Column(nullable = false)
    private boolean w_greens;


    @Column(nullable = false)
    private boolean w_fruits;


    @Column(nullable = false)
    private boolean w_havingMealTogether;


    @Column(nullable = false)
    private boolean w_includingGardenHarvest;


    @Column(nullable = false)
    private boolean w_tooMushSugar;


    @Column(nullable = false)
    private boolean w_tooMuchOil;

    @Column(nullable = false)
    private boolean h_threeMainMeals;


    @Column(nullable = false)
    private boolean h_animalProteins;


    @Column(nullable = false)
    private boolean h_plantProteinsGrains;


    @Column(nullable = false)
    private boolean h_vegetables;


    @Column(nullable = false)
    private boolean h_greens;


    @Column(nullable = false)
    private boolean h_fruits;


    @Column(nullable = false)
    private boolean h_havingMealTogether;


    @Column(nullable = false)
    private boolean h_includingGardenHarvest;


    @Column(nullable = false)
    private boolean h_tooMushSugar;


    @Column(nullable = false)
    private boolean h_tooMuchOil;
}
