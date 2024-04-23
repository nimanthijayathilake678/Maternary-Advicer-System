package group13.MaternaryAdvicerSystem.Controller;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Eligible_Family_Account;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Personal_Info;
import group13.MaternaryAdvicerSystem.Model.Domain.User;
import group13.MaternaryAdvicerSystem.Model.Dto.B_Basic_Info_Dto;
import group13.MaternaryAdvicerSystem.Model.Dto.C_Personal_Info_Dto;
import group13.MaternaryAdvicerSystem.Service.Login.C_Personal_Info_Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personalInfo")
@CrossOrigin
public class C_Personal_Info_Controller {
    private final C_Personal_Info_Service c_personal_info_service;

    public C_Personal_Info_Controller(C_Personal_Info_Service c_personal_info_service){
        this.c_personal_info_service = c_personal_info_service;
    }

    @GetMapping
    public List<C_Personal_Info> getAllPersonalInfo(){
        return c_personal_info_service.getAllPersonalInformation();
    }


    @GetMapping("/{userId}")
    public C_Personal_Info getPesonalInformationById(@PathVariable Long userId){
        return  c_personal_info_service.getPersonalInfoById(userId);
    }

    @PostMapping("/{userId}")
    public String saveInfoDetails(@RequestBody C_Personal_Info personalInfo,@PathVariable Long userId){
        c_personal_info_service.savePersonalInfo(personalInfo, userId);
        return "Add a personal info";
    }

    @PutMapping("/{userId}")
    public String updatePersonalDetails(@RequestBody C_Personal_Info updatePersonalDetail, @PathVariable Long userId){
        boolean updated = c_personal_info_service.updatePersonalInfo( updatePersonalDetail,userId);
        if(updated){
            return "Update Family account details successfully";
        }
        else{
            return "Can not update";
        }
    }
}