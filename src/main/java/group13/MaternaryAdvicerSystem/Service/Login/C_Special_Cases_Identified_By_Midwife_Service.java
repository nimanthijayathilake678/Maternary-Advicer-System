package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Personal_Info;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Special_Cases_Identified_By_Midwife;

import java.util.List;

public interface C_Special_Cases_Identified_By_Midwife_Service {
    public void saveSpecialCasesIdentifiedByMidwifeInfo(C_Special_Cases_Identified_By_Midwife c_special_cases_identified_by_midwife);

    public List<C_Special_Cases_Identified_By_Midwife> getAllSpecialCasesIdentifiedByMidwifeInfo();

    public C_Special_Cases_Identified_By_Midwife getSpecialCasesIdentifiedByMidwifeInfoById(Long id);

    public boolean updateSpecialCasesIdentifiedByMidwifeInfo(C_Special_Cases_Identified_By_Midwife updateSpecialCasesIdentifiedByMidwifeInfoDetails , Long id);
}
