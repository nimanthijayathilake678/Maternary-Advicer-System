package group13.MaternaryAdvicerSystem.Controller;


import group13.MaternaryAdvicerSystem.Model.Dto.Save_Neonatal_Dto;
import group13.MaternaryAdvicerSystem.Service.Login.B_Neonatal_Service_Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/babyNeonatal")
public class B_Neonatal_Controller {

    @Autowired
    private B_Neonatal_Service_Impl b_neonatal_service_impl;

    @PostMapping("/addneonatal")
    public String add(@RequestBody Save_Neonatal_Dto babyNeonatal){
        b_neonatal_service_impl.saveBabyNeonatal(babyNeonatal);

        return "newborn neonatal record  is added";
    }

//    @PostMapping("/addneonatal")
//    public Save_Neonatal_Dto add(@RequestBody Save_Neonatal_Dto babyNeonatal){
//        return babyNeonatal;
//    }
}
