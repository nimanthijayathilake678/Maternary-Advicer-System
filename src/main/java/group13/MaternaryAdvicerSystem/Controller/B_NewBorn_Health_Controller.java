package group13.MaternaryAdvicerSystem.Controller;


import group13.MaternaryAdvicerSystem.Model.Dto.Save_Immunization_Referels_Dto;
import group13.MaternaryAdvicerSystem.Model.Dto.Save_NewBorn_Helath_Dto;

import group13.MaternaryAdvicerSystem.Service.Login.B_NewBorn_Health_Service_Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/newbornhealth")
public class B_NewBorn_Health_Controller {
    @Autowired
    private B_NewBorn_Health_Service_Impl b_newBorn_health_service_impl;

    @PostMapping("/addnewbornhealth")
    public String add(@RequestBody Save_NewBorn_Helath_Dto newBornHealth){

        b_newBorn_health_service_impl.saveNewBornHealth(newBornHealth);
        return "newborn helath record  is added";
    }

    @GetMapping("/getbabyHealth/{babyNum}")
    public List<Save_NewBorn_Helath_Dto> getNewBornHealth(@PathVariable String babyNum){
        return b_newBorn_health_service_impl.getNewBornHealth(babyNum);
    }
}
