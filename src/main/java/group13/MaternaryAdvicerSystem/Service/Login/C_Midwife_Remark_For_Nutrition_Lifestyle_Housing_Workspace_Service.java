package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Midwife_Remark;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace;

import java.util.List;

public interface C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace_Service {
    public void saveMidwifeOtherRemark(C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace midwifeRemarkForNutritionLifestyleHousingWorkspace);

    public List<C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace> getAllMidwifeOtherRemark();

    public C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace getMidwifeOtherRemarkById(Long id);

    public boolean updateMidwifeOtherRemarkInfo(C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace updateMidwifeOtherRemark , Long id);
}
