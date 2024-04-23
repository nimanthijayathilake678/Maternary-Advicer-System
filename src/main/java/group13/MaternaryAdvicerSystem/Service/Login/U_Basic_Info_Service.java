package group13.MaternaryAdvicerSystem.Service.Login;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Personal_Info;
import group13.MaternaryAdvicerSystem.Model.Domain.P_Add_Refferal;
import group13.MaternaryAdvicerSystem.Model.Domain.User;
import group13.MaternaryAdvicerSystem.Model.Dto.Save_Immunization_Referels_Dto;
import group13.MaternaryAdvicerSystem.Model.Dto.UserRegisterDTO;

import java.util.List;

public interface U_Basic_Info_Service {


    void saveuser(UserRegisterDTO userRegister);
    //List<UserRegisterDTO>getUserBasicInfo(String nic);

    public List<User> getAllUserInformation();

    public User getUserInfoById(Long id);

    public boolean updateUserInfo(User updateUserlInfoDetails , Long id);

}
