package group13.MaternaryAdvicerSystem.Service.Login;
import group13.MaternaryAdvicerSystem.Model.Dto.B_Basic_Info_Dto;
import group13.MaternaryAdvicerSystem.Model.Dto.Save_BabyNutrients_Dto;
import java.util.List;
import java.util.Optional;

public interface B_Nutritions_Service {
    public void saveBabyNutritions(Save_BabyNutrients_Dto babyNutritions);
    public List<Save_BabyNutrients_Dto> getBabyNutritions(String babyNum);
}
