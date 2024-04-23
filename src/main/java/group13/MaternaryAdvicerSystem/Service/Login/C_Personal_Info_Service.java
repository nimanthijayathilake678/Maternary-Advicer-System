package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Eligible_Family_Account;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Personal_Info;
import group13.MaternaryAdvicerSystem.Model.Domain.User;

import java.util.List;

public interface C_Personal_Info_Service {
//    public void savePersonalInfo(C_Personal_Info c_personal_info);
    public List<C_Personal_Info> getAllPersonalInformation();
    public void savePersonalInfo(C_Personal_Info c_personal_info,Long userId);

    public C_Personal_Info getPersonalInfoById(Long userId);

    public boolean updatePersonalInfo(C_Personal_Info updatePersonalInfoDetails , Long userId);
}
