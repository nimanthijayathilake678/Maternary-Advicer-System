package group13.MaternaryAdvicerSystem.Controller;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Eligible_Family_Account;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Sexual_And_Reproductive_Health;
import group13.MaternaryAdvicerSystem.Service.Login.C_Eligible_Family_Account_Service;
import group13.MaternaryAdvicerSystem.Service.Login.C_Sexual_And_Reproductive_Health_Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sexualAndReproductiveHealthInfo")
public class C_Sexual_And_reproductive_Health_Controller {

    private final C_Sexual_And_Reproductive_Health_Service c_sexual_and_reproductive_health_service;


    public  C_Sexual_And_reproductive_Health_Controller(C_Sexual_And_Reproductive_Health_Service  c_sexual_and_reproductive_health_service ){
        this.c_sexual_and_reproductive_health_service = c_sexual_and_reproductive_health_service;
    }

    @PostMapping
    public String saveSexualAndReproductiveDetails(@RequestBody C_Sexual_And_Reproductive_Health sexualAndReprodutiveInfo){
        c_sexual_and_reproductive_health_service.saveSexualAndReproductiveHealthDetails(sexualAndReprodutiveInfo);
        return "Add sexual and reproductive details";
    }

    @GetMapping
    public List<C_Sexual_And_Reproductive_Health> getAllSexualAndReproductiveInfo(){
        return c_sexual_and_reproductive_health_service.getAllSexualAndReproductiveHealthDetails();
    }

    @GetMapping("/{id}")
    public C_Sexual_And_Reproductive_Health getSexualAndReproductiveInfoById(@PathVariable Long id){
        return  c_sexual_and_reproductive_health_service. getSexualAndReproductiveHealthDetailsById(id);
    }

    @PutMapping("/{id}")
    public String updateSexualAndReproductiveInfo(@RequestBody C_Sexual_And_Reproductive_Health updateSexualAndReproductiveDetail, @PathVariable Long id){
        c_sexual_and_reproductive_health_service.updateSexualAndReproductiveHealthDetails(updateSexualAndReproductiveDetail,id);
        return "Update Add sexual and reproductive details successfully";
    }

}
