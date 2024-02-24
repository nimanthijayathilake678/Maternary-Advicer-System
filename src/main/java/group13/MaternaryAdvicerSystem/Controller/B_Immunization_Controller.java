package group13.MaternaryAdvicerSystem.Controller;

import group13.MaternaryAdvicerSystem.Model.Domain.B_Immunization;
import group13.MaternaryAdvicerSystem.Model.Dto.B_Basic_Info_Dto;
import group13.MaternaryAdvicerSystem.Model.Dto.Save_Immunization_Dto;
import group13.MaternaryAdvicerSystem.Service.Login.B_Basic_Info_Service;
import group13.MaternaryAdvicerSystem.Service.Login.B_Immunization_Service;
import group13.MaternaryAdvicerSystem.Service.Login.B_Immunization_Service_Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/newbabyimmune")
public class B_Immunization_Controller {
    @Autowired
    private B_Immunization_Service_Impl b_immunization_service_impl;

    @PostMapping("/addImmune")
    public String add(@RequestBody Save_Immunization_Dto babyImmune){

        b_immunization_service_impl.saveBabyImmune(babyImmune);
        return "New baby is added";
    }


    @GetMapping("/getbabyImmune/{babyNum}")
    public List<Save_Immunization_Dto> getBabyImmune(@PathVariable String babyNum){
        return b_immunization_service_impl.getBabyImmune(babyNum);
    }

}
