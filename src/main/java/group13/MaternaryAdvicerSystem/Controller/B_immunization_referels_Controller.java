package group13.MaternaryAdvicerSystem.Controller;
import group13.MaternaryAdvicerSystem.Model.Dto.Save_Immunization_Dto;
import group13.MaternaryAdvicerSystem.Model.Dto.Save_Immunization_Referels_Dto;
import group13.MaternaryAdvicerSystem.Service.Login.B_Immunization_Referels_Service_Impl;
import group13.MaternaryAdvicerSystem.Service.Login.B_Immunization_Service_Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/newbabyimmunereferels")
public class B_immunization_referels_Controller {
    @Autowired
    private B_Immunization_Referels_Service_Impl b_immunization_service_referels_impl;

    @PostMapping("/addImmuneReferels")
    public String add(@RequestBody Save_Immunization_Referels_Dto babyImmuneReferels){

        b_immunization_service_referels_impl.saveBabyImmuneReferels(babyImmuneReferels);
        return "New baby refferel  is added";
    }

}
