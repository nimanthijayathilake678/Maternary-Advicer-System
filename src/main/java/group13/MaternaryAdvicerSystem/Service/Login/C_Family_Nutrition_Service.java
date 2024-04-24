package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Family_Health;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Family_Nutrition;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Medical_Conditions;

import java.util.List;

public interface C_Family_Nutrition_Service {
    public void saveFamilyNutrition(C_Family_Nutrition family_nutrition,Long userId);

    public List<C_Family_Nutrition> getAllCoupleFamilyNutrition();

    public C_Family_Nutrition getFamilyNutritionById(Long userId);

    public boolean updateFamilyNutrition(C_Family_Nutrition updateCoupleFamilyNutritionDetails , Long userId);
}
