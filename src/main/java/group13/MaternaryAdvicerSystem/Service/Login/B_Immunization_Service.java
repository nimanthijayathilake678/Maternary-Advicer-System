package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.B_Basic_Info;
import group13.MaternaryAdvicerSystem.Model.Domain.B_Immunization;
import group13.MaternaryAdvicerSystem.Model.Dto.B_Basic_Info_Dto;
import group13.MaternaryAdvicerSystem.Model.Dto.Save_Immunization_Dto;

import java.util.List;
import java.util.Optional;

public interface B_Immunization_Service {
    public void saveBabyImmune(Save_Immunization_Dto babyImmune);
    public List<Save_Immunization_Dto> getBabyImmune(String babyNum);
}
