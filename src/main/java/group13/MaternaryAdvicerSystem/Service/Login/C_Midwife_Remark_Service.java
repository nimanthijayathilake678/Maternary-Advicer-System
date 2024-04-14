package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Midwife_Remark;

import java.util.List;

public interface C_Midwife_Remark_Service {
    public void saveMidwifeRemark(C_Midwife_Remark midwife_remark);

    public List<C_Midwife_Remark> getAllMidwifeRemark();

    public C_Midwife_Remark getMidwifeRemarkById(Long id);

    public boolean updateMidwifeRemark(C_Midwife_Remark updateMidwifeRemark , Long id);
}
