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

    @PostMapping
    public String saveFamilyNutritionDetails(@RequestBody C_Family_Nutrition familyNutrition){
        c_family_nutrition_service.saveFamilyNutrition(familyNutrition);
        return "Add a family nutrition details";
    }

    @GetMapping
    public List<C_Family_Nutrition> getAllFamilyNutritionInfos(){
        return c_family_nutrition_service.getAllCoupleFamilyNutrition();
    }

    @GetMapping("/{id}")
    public C_Family_Nutrition getFamilyNutritionInfosById(@PathVariable Long id){
        return  c_family_nutrition_service.getFamilyNutritionById(id);
    }

    @PutMapping("/{id}")
    public String updateFamilyNutritionInfos(@RequestBody C_Family_Nutrition updateFamilyNutritionDetail, @PathVariable Long id){
        c_family_nutrition_service.updateFamilyNutrition(updateFamilyNutritionDetail,id);
        return "Update Family account details successfully";
    }
}
