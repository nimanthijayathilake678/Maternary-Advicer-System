package group13.MaternaryAdvicerSystem.Controller;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Life_Style;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Midwife_Remark;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace;
import group13.MaternaryAdvicerSystem.Service.Login.C_Life_Style_Service;
import group13.MaternaryAdvicerSystem.Service.Login.C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace_Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/othermidwifeRemark")
public class C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace_Controller {
    private final C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace_Service c_midwife_remark_for_nutrition_lifestyle_housing_workspace_service;

    public C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace_Controller(C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace_Service c_midwife_remark_for_nutrition_lifestyle_housing_workspace_service) {
        this.c_midwife_remark_for_nutrition_lifestyle_housing_workspace_service = c_midwife_remark_for_nutrition_lifestyle_housing_workspace_service;
    }

    @PostMapping("/{userId}")
    public String saveMidwifeOtherInfo(@RequestBody C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace otherRemark,@PathVariable Long userId){
        c_midwife_remark_for_nutrition_lifestyle_housing_workspace_service.saveMidwifeOtherRemark(otherRemark,userId);
        return "Add a midwife other remarks details";
    }

    @GetMapping
    public List<C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace> getAllMidwifeOtherRemarkInfo(){
        return c_midwife_remark_for_nutrition_lifestyle_housing_workspace_service.getAllMidwifeOtherRemark();
    }

    @GetMapping("/{userId}")
    public C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace getMidwifeOtherRemarkInfoById(@PathVariable Long userId){
        return  c_midwife_remark_for_nutrition_lifestyle_housing_workspace_service.getMidwifeOtherRemarkById(userId);
    }

    @PutMapping("/{userId}")
    public String updateMidwifeOtherRemarkDetailsDetails(@RequestBody C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace updateMidwifeOtherRemarkDetailsDetail, @PathVariable Long userId){
        c_midwife_remark_for_nutrition_lifestyle_housing_workspace_service.updateMidwifeOtherRemarkInfo( updateMidwifeOtherRemarkDetailsDetail,userId);
        return "Update midwife other remark successfully";
    }


}
