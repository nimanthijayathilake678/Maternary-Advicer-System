package group13.MaternaryAdvicerSystem.Controller;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Eligible_Family_Account;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Medical_Conditions;
import group13.MaternaryAdvicerSystem.Model.Domain.User;
import group13.MaternaryAdvicerSystem.Service.Login.C_Eligible_Family_Account_Service;
import group13.MaternaryAdvicerSystem.Service.Login.C_Medical_Conditions_Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/CoupleMedicalConditions")
@CrossOrigin

public class C_Medical_Conditions_Controller {

    private final C_Medical_Conditions_Service c_medical_conditions_service;

    public C_Medical_Conditions_Controller(C_Medical_Conditions_Service c_medical_conditions_service){
        this.c_medical_conditions_service = c_medical_conditions_service;
    }

    @PostMapping("/{userId}")
    public String saveMedicalInfo(@RequestBody C_Medical_Conditions medicalConditions,@PathVariable Long userId){
        c_medical_conditions_service.saveMedicalConditions(medicalConditions,userId);
        return "Add medical conditions";
    }

    @GetMapping
    public List<C_Medical_Conditions> getAllRegisteredFamilies(){
        return c_medical_conditions_service.getAllCoupleMedicalConditions();
    }

    @GetMapping("/{userId}")
    public C_Medical_Conditions getMedicalConditionsById(@PathVariable Long userId){
        return  c_medical_conditions_service.getMedicalConditionsById(userId);
    }

    @PutMapping("/{userId}")
    public String updateMedicalConditions(@RequestBody C_Medical_Conditions updateMedicalDetail, @PathVariable Long userId){
        c_medical_conditions_service.updateMedicalConditions(updateMedicalDetail,userId);
        return "Update Family account details successfully";
    }
}
