package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Eligible_Family_Account;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Family_Nutrition;
import group13.MaternaryAdvicerSystem.Repository.Login.C_Eligible_Family_Account_Repository;
import group13.MaternaryAdvicerSystem.Repository.Login.C_Family_Nutrition_Repository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class C_Family_Nutrition_Serivice_Impl implements C_Family_Nutrition_Service{
    @Autowired
    C_Family_Nutrition_Repository c_family_nutrition_repository;
    @Override
    public void saveFamilyNutrition(C_Family_Nutrition family_nutrition) {
        c_family_nutrition_repository.save(family_nutrition);
    }

    @Override
    public List<C_Family_Nutrition> getAllCoupleFamilyNutrition() {
        return c_family_nutrition_repository.findAll();
    }

    @Override
    public C_Family_Nutrition getFamilyNutritionById(Long id) {
        return c_family_nutrition_repository.findById(id).orElse(null);
    }

    @Override
    public boolean updateFamilyNutrition(C_Family_Nutrition updateCoupleFamilyNutritionDetails, Long id) {
        Optional<C_Family_Nutrition> c_family_nutrition_optional =  c_family_nutrition_repository.findById(id);
        if(c_family_nutrition_optional.isPresent()){
            C_Family_Nutrition c_family_nutrition_To_Update = c_family_nutrition_optional.get();
            c_family_nutrition_To_Update.setW_threeMainMeals(updateCoupleFamilyNutritionDetails.isW_threeMainMeals());
            c_family_nutrition_To_Update.setW_animalProteins(updateCoupleFamilyNutritionDetails.isW_animalProteins());
            c_family_nutrition_To_Update.setW_plantProteinsGrains(updateCoupleFamilyNutritionDetails.isW_plantProteinsGrains());
            c_family_nutrition_To_Update.setW_vegetables(updateCoupleFamilyNutritionDetails.isW_vegetables());
            c_family_nutrition_To_Update.setW_greens(updateCoupleFamilyNutritionDetails.isW_greens());
            c_family_nutrition_To_Update.setW_fruits(updateCoupleFamilyNutritionDetails.isW_fruits());
            c_family_nutrition_To_Update.setW_havingMealTogether(updateCoupleFamilyNutritionDetails.isW_havingMealTogether());
            c_family_nutrition_To_Update.setW_includingGardenHarvest(updateCoupleFamilyNutritionDetails.isW_includingGardenHarvest());
            c_family_nutrition_To_Update.setW_tooMushSugar(updateCoupleFamilyNutritionDetails.isW_tooMushSugar());
            c_family_nutrition_To_Update.setW_tooMuchOil(updateCoupleFamilyNutritionDetails.isW_tooMuchOil());
            c_family_nutrition_To_Update.setH_threeMainMeals(updateCoupleFamilyNutritionDetails.isH_threeMainMeals());
            c_family_nutrition_To_Update.setH_animalProteins(updateCoupleFamilyNutritionDetails.isH_animalProteins());
            c_family_nutrition_To_Update.setH_plantProteinsGrains(updateCoupleFamilyNutritionDetails.isH_plantProteinsGrains());
            c_family_nutrition_To_Update.setH_vegetables(updateCoupleFamilyNutritionDetails.isH_vegetables());
            c_family_nutrition_To_Update.setH_greens(updateCoupleFamilyNutritionDetails.isH_greens());
            c_family_nutrition_To_Update.setH_fruits(updateCoupleFamilyNutritionDetails.isH_fruits());
            c_family_nutrition_To_Update.setH_havingMealTogether(updateCoupleFamilyNutritionDetails.isH_havingMealTogether());
            c_family_nutrition_To_Update.setH_includingGardenHarvest(updateCoupleFamilyNutritionDetails.isH_includingGardenHarvest());
            c_family_nutrition_To_Update.setH_tooMushSugar(updateCoupleFamilyNutritionDetails.isH_tooMushSugar());
            c_family_nutrition_To_Update.setH_tooMuchOil(updateCoupleFamilyNutritionDetails.isH_tooMuchOil());
            return true;
        }
        return false;
    }
}
