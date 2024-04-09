package group13.MaternaryAdvicerSystem.Controller;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Eligible_Family_Account;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Medical_Conditions;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Other_Sexual_And_Reproductive_Health;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Sexual_And_Reproductive_Health;
import group13.MaternaryAdvicerSystem.Service.Login.C_Eligible_Family_Account_Service;
import group13.MaternaryAdvicerSystem.Service.Login.C_Other_sexual_And_Reproductive_Health_Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/otherSexualAndReproductiveHealth")
@CrossOrigin

public class C_Other_Sexual_And_Reproductive_Health_Controller {
    private final C_Other_sexual_And_Reproductive_Health_Service c_other_sexual_and_reproductive_health_service;


    public  C_Other_Sexual_And_Reproductive_Health_Controller(C_Other_sexual_And_Reproductive_Health_Service c_other_sexual_and_reproductive_health_service ){
        this.c_other_sexual_and_reproductive_health_service = c_other_sexual_and_reproductive_health_service;
    }

    @PostMapping
    public String saveOtherSexualAndReproductiveHealthInfo(@RequestBody C_Other_Sexual_And_Reproductive_Health otherSexualAndReproductiveHealthInfo){
        c_other_sexual_and_reproductive_health_service.saveOtherSexualAndReproductiveHealth(otherSexualAndReproductiveHealthInfo);
        return "Add a other sexual and reproductive details";
    }

    @GetMapping
    public List<C_Other_Sexual_And_Reproductive_Health> getAllOtherSexualAndReproductiveHealthInfo(){
        return c_other_sexual_and_reproductive_health_service.getAllCoupleOtherSexualAndReproductiveHealth();
    }


    @GetMapping("/{id}")
    public C_Other_Sexual_And_Reproductive_Health getOtherSexualAndReproductiveHealthInfoById(@PathVariable Long id){
        return  c_other_sexual_and_reproductive_health_service. getOtherSexualAndReproductiveHealthById(id);
    }

    @PutMapping("/{id}")
    public String updateOtherSexualAndReproductiveHealthInfo(@RequestBody C_Other_Sexual_And_Reproductive_Health updateCoupleOtherSexualAndReproductiveHealthDetail, @PathVariable Long id){
        c_other_sexual_and_reproductive_health_service.updateOtherSexualAndReproductiveHealthService(updateCoupleOtherSexualAndReproductiveHealthDetail,id);
        return "Update other sexual and reproductive details";
    }

}
