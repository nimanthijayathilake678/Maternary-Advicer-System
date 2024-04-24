package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Eligible_Family_Account;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Family_Nutrition;
import group13.MaternaryAdvicerSystem.Model.Domain.User;
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

    @Autowired
    private  U_Basic_Info_Service uBasicInfoService;
    @Override
    public void saveFamilyNutrition(C_Family_Nutrition family_nutrition,Long userId) {
        User user = uBasicInfoService.getUserInfoById(userId);
        family_nutrition.setUser(user);
        c_family_nutrition_repository.save(family_nutrition);
    }

    @Override
    public List<C_Family_Nutrition> getAllCoupleFamilyNutrition() {
        return c_family_nutrition_repository.findAll();
    }

    @Override
    public C_Family_Nutrition getFamilyNutritionById(Long userId) {
        return c_family_nutrition_repository.findByUserId(userId);
    }

    @Override
    public boolean updateFamilyNutrition(C_Family_Nutrition updateCoupleFamilyNutritionDetails, Long userId) {
        C_Family_Nutrition c_family_nutrition_optional =  c_family_nutrition_repository.findByUserId(userId);
        if(c_family_nutrition_optional!=null){
            c_family_nutrition_optional.setW_threeMainMeals(updateCoupleFamilyNutritionDetails.isW_threeMainMeals());
            c_family_nutrition_optional.setW_animalProteins(updateCoupleFamilyNutritionDetails.isW_animalProteins());
            c_family_nutrition_optional.setW_plantProteinsGrains(updateCoupleFamilyNutritionDetails.isW_plantProteinsGrains());
            c_family_nutrition_optional.setW_vegetables(updateCoupleFamilyNutritionDetails.isW_vegetables());
            c_family_nutrition_optional.setW_greens(updateCoupleFamilyNutritionDetails.isW_greens());
            c_family_nutrition_optional.setW_fruits(updateCoupleFamilyNutritionDetails.isW_fruits());
            c_family_nutrition_optional.setW_havingMealTogether(updateCoupleFamilyNutritionDetails.isW_havingMealTogether());
            c_family_nutrition_optional.setW_includingGardenHarvest(updateCoupleFamilyNutritionDetails.isW_includingGardenHarvest());
            c_family_nutrition_optional.setW_tooMushSugar(updateCoupleFamilyNutritionDetails.isW_tooMushSugar());
            c_family_nutrition_optional.setW_tooMuchOil(updateCoupleFamilyNutritionDetails.isW_tooMuchOil());
            c_family_nutrition_optional.setH_threeMainMeals(updateCoupleFamilyNutritionDetails.isH_threeMainMeals());
            c_family_nutrition_optional.setH_animalProteins(updateCoupleFamilyNutritionDetails.isH_animalProteins());
            c_family_nutrition_optional.setH_plantProteinsGrains(updateCoupleFamilyNutritionDetails.isH_plantProteinsGrains());
            c_family_nutrition_optional.setH_vegetables(updateCoupleFamilyNutritionDetails.isH_vegetables());
            c_family_nutrition_optional.setH_greens(updateCoupleFamilyNutritionDetails.isH_greens());
            c_family_nutrition_optional.setH_fruits(updateCoupleFamilyNutritionDetails.isH_fruits());
            c_family_nutrition_optional.setH_havingMealTogether(updateCoupleFamilyNutritionDetails.isH_havingMealTogether());
            c_family_nutrition_optional.setH_includingGardenHarvest(updateCoupleFamilyNutritionDetails.isH_includingGardenHarvest());
            c_family_nutrition_optional.setH_tooMushSugar(updateCoupleFamilyNutritionDetails.isH_tooMushSugar());
            c_family_nutrition_optional.setH_tooMuchOil(updateCoupleFamilyNutritionDetails.isH_tooMuchOil());
            return true;
        }
        return false;
    }
}
