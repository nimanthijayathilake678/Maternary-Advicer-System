package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.B_Basic_Info;
import group13.MaternaryAdvicerSystem.Model.Dto.B_Basic_Info_Dto;

import java.util.List;
import java.util.Optional;

public interface B_Basic_Info_Service {
    public void savebaby(B_Basic_Info_Dto baby);
    public List<B_Basic_Info_Dto> getBabyDetails(String babyNum);
    public List<B_Basic_Info_Dto> getBabyDetailsVog();
    public List<B_Basic_Info_Dto> getBabyDetailsByCoupleNum(String coupleNum);
    //public List<B_Basic_Info_Dto> getBabyDetailsByMidwife(String fsho);

}
