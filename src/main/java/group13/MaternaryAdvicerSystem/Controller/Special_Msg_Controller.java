package group13.MaternaryAdvicerSystem.Controller;
import group13.MaternaryAdvicerSystem.Model.Domain.SpecialMsg;
import group13.MaternaryAdvicerSystem.Model.Dto.B_Basic_Info_Dto;
import group13.MaternaryAdvicerSystem.Model.Dto.Save_Special_Msg_Dto;
import group13.MaternaryAdvicerSystem.Service.Login.Special_Msg_Service;
import group13.MaternaryAdvicerSystem.Service.Login.B_Basic_Info_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
@RestController
@RequestMapping("/newmsg")
public class Special_Msg_Controller {
    @Autowired
    private  Special_Msg_Service special_msg_service;

    @PostMapping("/add")
    public String saveSpecialMsg(@RequestBody Save_Special_Msg_Dto msg){
        special_msg_service.saveSpecialMsg(msg);
        return "New msg is added";
    }

    @GetMapping("/getmsgInfo/{regNum}")
    public List<Save_Special_Msg_Dto> getSpecialMsg(@PathVariable String regNum){
        return special_msg_service.getSpecialMsg(regNum);
    }
    @DeleteMapping("/deletemsg/{id}")
    public String deleteSpecialMsg(@PathVariable Long id){
        special_msg_service.deleteSpecialMsgById(id);
        return "Special message deleted successfully";
    }
}
