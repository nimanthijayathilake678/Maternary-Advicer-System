package group13.MaternaryAdvicerSystem.Controller;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Midwife_Remark;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Personal_Info;
import group13.MaternaryAdvicerSystem.Service.Login.C_Midwife_Remark_Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/midwifeRemark")
@CrossOrigin
public class C_Midwife_Remark_Controller {
    private final C_Midwife_Remark_Service c_midwife_remark_service;

    public C_Midwife_Remark_Controller(C_Midwife_Remark_Service c_midwife_remark_service) {
        this.c_midwife_remark_service = c_midwife_remark_service;
    }

    @GetMapping
    public List<C_Midwife_Remark> getAllMidwifeRemarkInfo(){
        return c_midwife_remark_service.getAllMidwifeRemark();
    }


    @GetMapping("/{userId}")
    public C_Midwife_Remark getMidwifeRemarkInfoById(@PathVariable Long userId){
        return  c_midwife_remark_service.getMidwifeRemarkById(userId);
    }

    @PostMapping("/{userId}")
    public String saveMidwifeRemarkDetails(@RequestBody C_Midwife_Remark midwifeRemark,@PathVariable  Long userId){
        c_midwife_remark_service.saveMidwifeRemark(midwifeRemark,userId);
        return "Add a midwife remark info";
    }

    @PutMapping("/{userId}")
    public String updateMidwifeRemarkDetailsDetails(@RequestBody C_Midwife_Remark updateMidwifeRemarkDetailsDetail, @PathVariable Long userId){
        c_midwife_remark_service.updateMidwifeRemark( updateMidwifeRemarkDetailsDetail,userId);
        return "Update midwife remark successfully";
    }
}
