package group13.MaternaryAdvicerSystem.Service.Login;
import group13.MaternaryAdvicerSystem.Model.Dto.B_Basic_Info_Dto;
import group13.MaternaryAdvicerSystem.Model.Dto.Chat_Forum_Dto;
import group13.MaternaryAdvicerSystem.Model.Dto.Save_BabyNutrients_Dto;

import java.util.List;
import java.util.Optional;

public interface Chat_Forum_Service {
    public void savechat(Chat_Forum_Dto chat);
    public List<Chat_Forum_Dto>getchat();
}
