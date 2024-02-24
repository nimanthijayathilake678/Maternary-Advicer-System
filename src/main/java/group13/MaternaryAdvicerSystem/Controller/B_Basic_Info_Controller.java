package group13.MaternaryAdvicerSystem.Controller;

import group13.MaternaryAdvicerSystem.Model.Domain.B_Basic_Info;
import group13.MaternaryAdvicerSystem.Model.Dto.B_Basic_Info_Dto;
import group13.MaternaryAdvicerSystem.Model.Dto.Save_Immunization_Dto;
import group13.MaternaryAdvicerSystem.Service.Login.B_Basic_Info_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/newbaby")
public class B_Basic_Info_Controller {
    @Autowired
    private B_Basic_Info_Service b_basic_info_service;

    @PostMapping("/add")
    public String add(@RequestBody B_Basic_Info_Dto baby){

        b_basic_info_service.savebaby(baby);
        return "New baby is added";
    }

    @GetMapping("/getbabyInfo/{babyNum}")
    public List<B_Basic_Info_Dto> getBabyDetails(@PathVariable String babyNum){
        return b_basic_info_service.getBabyDetails(babyNum);
    }

}
