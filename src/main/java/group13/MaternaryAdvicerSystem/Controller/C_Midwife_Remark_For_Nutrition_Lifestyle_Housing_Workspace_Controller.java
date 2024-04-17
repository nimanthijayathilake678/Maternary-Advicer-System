package group13.MaternaryAdvicerSystem.Controller;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Life_Style;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Midwife_Remark;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace;
import group13.MaternaryAdvicerSystem.Service.Login.C_Life_Style_Service;
import group13.MaternaryAdvicerSystem.Service.Login.C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace_Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/othermidwifeRemark")
public class C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace_Controller {
    private final C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace_Service c_midwife_remark_for_nutrition_lifestyle_housing_workspace_service;

    public C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace_Controller(C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace_Service c_midwife_remark_for_nutrition_lifestyle_housing_workspace_service) {
        this.c_midwife_remark_for_nutrition_lifestyle_housing_workspace_service = c_midwife_remark_for_nutrition_lifestyle_housing_workspace_service;
    }

    @PostMapping
    public String saveMidwifeOtherInfo(@RequestBody C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace otherRemark){
        c_midwife_remark_for_nutrition_lifestyle_housing_workspace_service.saveMidwifeOtherRemark(otherRemark);
        return "Add a midwife other remarks details";
    }

    @GetMapping
    public List<C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace> getAllMidwifeOtherRemarkInfo(){
        return c_midwife_remark_for_nutrition_lifestyle_housing_workspace_service.getAllMidwifeOtherRemark();
    }

    @GetMapping("/{id}")
    public C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace getMidwifeOtherRemarkInfoById(@PathVariable Long id){
        return  c_midwife_remark_for_nutrition_lifestyle_housing_workspace_service.getMidwifeOtherRemarkById(id);
    }

    @PutMapping("/{id}")
    public String updateMidwifeOtherRemarkDetailsDetails(@RequestBody C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace updateMidwifeOtherRemarkDetailsDetail, @PathVariable Long id){
        c_midwife_remark_for_nutrition_lifestyle_housing_workspace_service.updateMidwifeOtherRemarkInfo( updateMidwifeOtherRemarkDetailsDetail,id);
        return "Update midwife other remark successfully";
    }


}
