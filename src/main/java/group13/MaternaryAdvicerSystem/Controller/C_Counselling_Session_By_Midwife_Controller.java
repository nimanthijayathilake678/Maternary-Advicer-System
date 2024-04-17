package group13.MaternaryAdvicerSystem.Controller;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Counselling_Session_By_Midwife;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Filled_By_Midwife;
import group13.MaternaryAdvicerSystem.Service.Login.C_Counselling_Session_By_Midwife_Service;
import group13.MaternaryAdvicerSystem.Service.Login.C_Filled_By_Midwife_Service;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/counsellingDates")
@CrossOrigin
@RestController
public class C_Counselling_Session_By_Midwife_Controller {
    private final C_Counselling_Session_By_Midwife_Service c_counselling_session_by_midwife_service;

    public C_Counselling_Session_By_Midwife_Controller(C_Counselling_Session_By_Midwife_Service c_counselling_session_by_midwife_service) {
        this.c_counselling_session_by_midwife_service = c_counselling_session_by_midwife_service;
    }

    @PostMapping
    public String saveCounsellingInfo(@RequestBody C_Counselling_Session_By_Midwife counsellingSessionByMidwife){
        c_counselling_session_by_midwife_service.saveCounsellingDetails(counsellingSessionByMidwife);
        return "Save counselling details";
    }

    @GetMapping
    public List<C_Counselling_Session_By_Midwife> getAllCounsellingInfo(){
        return c_counselling_session_by_midwife_service.getAllCounsellingDetails();
    }

    @GetMapping("/{id}")
    public C_Counselling_Session_By_Midwife getAllCounsellingInfoById(@PathVariable Long id){
        return  c_counselling_session_by_midwife_service.getCounsellingDetailsById(id);
    }

    @PutMapping("/{id}")
    public String updateCounsellingInfos(@RequestBody C_Counselling_Session_By_Midwife updateCounsellingDetail, @PathVariable Long id){
        c_counselling_session_by_midwife_service.updateCounsellingDetails(updateCounsellingDetail,id);
        return "Update counselling details successfully";
    }
}
