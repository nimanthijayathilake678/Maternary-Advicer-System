package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Family_Nutrition;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Life_Style;

import java.util.List;

public interface C_Life_Style_Service {
    public void saveLifeStyleDetails(C_Life_Style life_style);

    public List<C_Life_Style> getAllCoupleLifeStyleDetails();

    public C_Life_Style getLifeStyleDetailsById(Long id);

    public boolean updateLifeStyleDetails(C_Life_Style updateCoupleLifeStyleDetails , Long id);
}
