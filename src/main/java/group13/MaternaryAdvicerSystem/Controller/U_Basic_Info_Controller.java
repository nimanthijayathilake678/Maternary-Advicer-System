package group13.MaternaryAdvicerSystem.Controller;
import group13.MaternaryAdvicerSystem.Model.Dto.B_Basic_Info_Dto;
import group13.MaternaryAdvicerSystem.Model.Dto.Save_Immunization_Dto;
import group13.MaternaryAdvicerSystem.Service.Login.B_Basic_Info_Service;
import group13.MaternaryAdvicerSystem.Service.Login.U_Basic_Info_Service_Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import group13.MaternaryAdvicerSystem.Model.Dto.UserRegisterDTO;
import group13.MaternaryAdvicerSystem.Service.Login.U_Basic_Info_Service;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/newuser")
public class U_Basic_Info_Controller {
    @Autowired
    private final U_Basic_Info_Service u_basic_info_service;
    @Autowired
    public U_Basic_Info_Controller(U_Basic_Info_Service u_basic_info_service){
        this.u_basic_info_service = u_basic_info_service;
    }

    @PostMapping("/add")
    public String adduser(@RequestBody UserRegisterDTO user){
        u_basic_info_service.saveuser(user);
        return "New user is added";
    }



}
