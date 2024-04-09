package group13.MaternaryAdvicerSystem.Service.Login;
import group13.MaternaryAdvicerSystem.Model.Dto.Save_Immunization_Referels_Dto;
import group13.MaternaryAdvicerSystem.Model.Dto.UserRegisterDTO;

import java.util.List;

public interface U_Basic_Info_Service {


    void saveuser(UserRegisterDTO userRegister);
    //List<UserRegisterDTO>getUserBasicInfo(String nic);

}
