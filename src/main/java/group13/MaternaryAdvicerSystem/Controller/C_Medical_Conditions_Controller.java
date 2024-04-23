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

    @PostMapping
    public String saveMedicalInfo(@RequestBody C_Medical_Conditions medicalConditions){
        c_medical_conditions_service.saveMedicalConditions(medicalConditions);
        return "Add medical conditions";
    }

    @GetMapping
    public List<C_Medical_Conditions> getAllRegisteredFamilies(){
        return c_medical_conditions_service.getAllCoupleMedicalConditions();
    }

    @GetMapping("/{id}")
    public C_Medical_Conditions getMedicalConditionsById(@PathVariable User id){
        return  c_medical_conditions_service.getMedicalConditionsById(id);
    }

    @PutMapping("/{id}")
    public String updateMedicalConditions(@RequestBody C_Medical_Conditions updateMedicalDetail, @PathVariable User id){
        c_medical_conditions_service.updateMedicalConditions(updateMedicalDetail,id);
        return "Update Family account details successfully";
    }
}
