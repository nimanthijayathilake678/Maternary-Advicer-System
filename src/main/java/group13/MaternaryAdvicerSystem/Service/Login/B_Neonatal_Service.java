package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Dto.Save_BabyNutrients_Dto;
import group13.MaternaryAdvicerSystem.Model.Dto.Save_Neonatal_Dto;

import java.util.List;

public interface B_Neonatal_Service {
    public void saveBabyNeonatal(Save_Neonatal_Dto babyNeonatal);
    public List<Save_Neonatal_Dto> getBabyNeonatal(String babyNum);
}
