package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Dto.Save_Immunization_Referels_Dto;
import group13.MaternaryAdvicerSystem.Model.Dto.Save_NewBorn_Helath_Dto;

import java.util.List;

public interface B_NewBorn_Health_Service {
    public void saveNewBornHealth(Save_NewBorn_Helath_Dto newBornHealth);
    public List<Save_NewBorn_Helath_Dto> getNewBornHealth(String babyNum);


}
