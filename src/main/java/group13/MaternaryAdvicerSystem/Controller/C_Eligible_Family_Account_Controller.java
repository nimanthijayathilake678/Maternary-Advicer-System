package group13.MaternaryAdvicerSystem.Controller;

import group13.MaternaryAdvicerSystem.Model.Dto.B_Basic_Info_Dto;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Eligible_Family_Account;
import group13.MaternaryAdvicerSystem.Model.Dto.UserRegisterDTO;
import group13.MaternaryAdvicerSystem.Service.Login.B_Basic_Info_Service;
import group13.MaternaryAdvicerSystem.Service.Login.C_Eligible_Family_Account_Service;
import group13.MaternaryAdvicerSystem.Service.Login.U_Basic_Info_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/EligibleCouple")
@CrossOrigin
public class C_Eligible_Family_Account_Controller {

    private final C_Eligible_Family_Account_Service c_eligible_family_account_service;


    public  C_Eligible_Family_Account_Controller(C_Eligible_Family_Account_Service  c_eligible_family_account_service ){
        this.c_eligible_family_account_service = c_eligible_family_account_service;
    }

    @PostMapping
    public String add(@RequestBody C_Eligible_Family_Account couple){
        c_eligible_family_account_service.registerFamily(couple);
        return "Add a couple";
    }

    @GetMapping
    public List<C_Eligible_Family_Account> getAllRegisteredFamilies(){
        return c_eligible_family_account_service.getAllFamilies();
    }

    @GetMapping("/{id}")
    public C_Eligible_Family_Account getRegisteredFamiliyById(@PathVariable Long id){
        return  c_eligible_family_account_service.getFamilyById(id);
    }

    @PutMapping("/{id}")
    public String updateEligibleFamilyAccount(@RequestBody C_Eligible_Family_Account updateCoupleDetail, @PathVariable Long id){
        c_eligible_family_account_service.updateEligibleFamily(updateCoupleDetail,id);
        return "Update Family account details successfully";
    }


}
