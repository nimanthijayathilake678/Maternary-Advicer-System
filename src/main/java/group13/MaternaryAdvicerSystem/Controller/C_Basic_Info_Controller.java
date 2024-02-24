package group13.MaternaryAdvicerSystem.Controller;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Basic_Info;
import group13.MaternaryAdvicerSystem.Service.Login.C_Basic_Info_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/newcouple")
public class C_Basic_Info_Controller {
    @Autowired
    private C_Basic_Info_Service c_basic_info_service;

    @PostMapping("/add")
    public String add(@RequestBody C_Basic_Info couple){
        c_basic_info_service.savecouple(couple);
        return "New couple is added";
    }
}
