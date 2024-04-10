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
            c_family_nutrition_To_Update.setGender(updateCoupleFamilyNutritionDetails.getGender());
            c_family_nutrition_To_Update.setThreeMainMeals(updateCoupleFamilyNutritionDetails.isThreeMainMeals());
            c_family_nutrition_To_Update.setAnimalProteins(updateCoupleFamilyNutritionDetails.isAnimalProteins());
            c_family_nutrition_To_Update.setPlantProteinsGrains(updateCoupleFamilyNutritionDetails.isPlantProteinsGrains());
            c_family_nutrition_To_Update.setVegetables(updateCoupleFamilyNutritionDetails.isVegetables());
            c_family_nutrition_To_Update.setGreens(updateCoupleFamilyNutritionDetails.isGreens());
            c_family_nutrition_To_Update.setFruits(updateCoupleFamilyNutritionDetails.isFruits());
            c_family_nutrition_To_Update.setHavingMealTogether(updateCoupleFamilyNutritionDetails.isHavingMealTogether());
            c_family_nutrition_To_Update.setIncludingGardenHarvest(updateCoupleFamilyNutritionDetails.isIncludingGardenHarvest());
            c_family_nutrition_To_Update.setTooMushSugar(updateCoupleFamilyNutritionDetails.isTooMushSugar());
            c_family_nutrition_To_Update.setTooMuchOil(updateCoupleFamilyNutritionDetails.isTooMuchOil());
            return true;
        }
        return false;
    }
}
