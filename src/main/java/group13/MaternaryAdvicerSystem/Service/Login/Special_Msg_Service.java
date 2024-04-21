package group13.MaternaryAdvicerSystem.Service.Login;
import group13.MaternaryAdvicerSystem.Model.Dto.Save_Special_Msg_Dto;
import java.util.List;
import java.util.Optional;
import group13.MaternaryAdvicerSystem.Repository.Login.Special_Service_Repository;
public interface Special_Msg_Service {


    public void saveSpecialMsg(Save_Special_Msg_Dto specialMsg);
    public List<Save_Special_Msg_Dto> getSpecialMsg(String babyNum);
    public void deleteSpecialMsgById(Long id);
}




