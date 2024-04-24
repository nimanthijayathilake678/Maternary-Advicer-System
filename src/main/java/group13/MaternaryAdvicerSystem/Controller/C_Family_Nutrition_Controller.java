package group13.MaternaryAdvicerSystem.Controller;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Eligible_Family_Account;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Family_Nutrition;
import group13.MaternaryAdvicerSystem.Service.Login.C_Eligible_Family_Account_Service;
import group13.MaternaryAdvicerSystem.Service.Login.C_Family_Health_Service;
import group13.MaternaryAdvicerSystem.Service.Login.C_Family_Nutrition_Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("/familyNutrition")
@RestController

public class C_Family_Nutrition_Controller {
    private final C_Family_Nutrition_Service c_family_nutrition_service;

    public C_Family_Nutrition_Controller(C_Family_Nutrition_Service c_family_nutrition_service) {
        this.c_family_nutrition_service = c_family_nutrition_service;
    }

    @PostMapping("/{userId}")
    public String saveFamilyNutritionDetails(@RequestBody C_Family_Nutrition familyNutrition, @PathVariable Long userId){
        c_family_nutrition_service.saveFamilyNutrition(familyNutrition,userId);
        return "Add a family nutrition details";
    }

    @GetMapping
    public List<C_Family_Nutrition> getAllFamilyNutritionInfos(){
        return c_family_nutrition_service.getAllCoupleFamilyNutrition();
    }

    @GetMapping("/{userId}")
    public C_Family_Nutrition getFamilyNutritionInfosById(@PathVariable Long userId){
        return  c_family_nutrition_service.getFamilyNutritionById(userId);
    }

    @PutMapping("/{userId}")
    public String updateFamilyNutritionInfos(@RequestBody C_Family_Nutrition updateFamilyNutritionDetail, @PathVariable Long userId){
        c_family_nutrition_service.updateFamilyNutrition(updateFamilyNutritionDetail,userId);
        return "Update Family account details successfully";
    }
}
