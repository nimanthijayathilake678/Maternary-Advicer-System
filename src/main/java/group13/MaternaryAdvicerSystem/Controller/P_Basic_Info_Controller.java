package group13.MaternaryAdvicerSystem.Controller;



import group13.MaternaryAdvicerSystem.Model.Domain.P_Basic_Info;
import group13.MaternaryAdvicerSystem.Service.Login.P_Basic_Info_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/newpregnancy")
public class P_Basic_Info_Controller {
    @Autowired
    private P_Basic_Info_Service p_basic_info_service;

    @PostMapping("/add")
    public String add(@RequestBody P_Basic_Info pregnancy){
        p_basic_info_service.savepregnancy(pregnancy);
        return "New pregnancy is added";
    }


}
