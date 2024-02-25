package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Dto.Save_Immunization_Dto;
import group13.MaternaryAdvicerSystem.Model.Dto.Save_Immunization_Referels_Dto;

import java.util.List;

public interface B_Immunization_Referels_Service {
    public void saveBabyImmuneReferels(Save_Immunization_Referels_Dto babyImmuneReferels);
    public List<Save_Immunization_Referels_Dto> getBabyImmuneReferels(String babyNum);
}

