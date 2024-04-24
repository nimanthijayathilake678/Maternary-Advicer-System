package group13.MaternaryAdvicerSystem.Controller;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Eligible_Family_Account;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Family_Health;
import group13.MaternaryAdvicerSystem.Model.Domain.User;
import group13.MaternaryAdvicerSystem.Service.Login.C_Eligible_Family_Account_Service;
import group13.MaternaryAdvicerSystem.Service.Login.C_Family_Health_Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/familyHealth")
@CrossOrigin

public class C_Family_Health_Service_Controller {
    private final C_Family_Health_Service c_family_health_service;

    public C_Family_Health_Service_Controller(C_Family_Health_Service c_family_health_service) {
        this.c_family_health_service = c_family_health_service;
    }


    @PostMapping("/{userId}")
    public String addFamilyHealth(@RequestBody C_Family_Health familyHealth,@PathVariable  Long userId){
        c_family_health_service.saveFamilyHealth(familyHealth,userId);
        return "Add a couple family health";
    }

    @GetMapping
    public List<C_Family_Health> getAllFamilyHealthInfo(){
        return c_family_health_service.getAllFamilyHealthDetails();
    }

    @GetMapping("/{userId}")
    public C_Family_Health getRegisteredFamilyHealthById(@PathVariable Long userId){
        return  c_family_health_service.getFamilyHealthDetailsById(userId);
    }

    @PutMapping("/{userId}")
    public String updateFamilyHealthInfo(@RequestBody C_Family_Health updateFamilyHealthDetail, @PathVariable Long userId){
        c_family_health_service.updateFamilyHealthDetails(updateFamilyHealthDetail,userId);
        return "Update Family Health details successfully";
    }

}
