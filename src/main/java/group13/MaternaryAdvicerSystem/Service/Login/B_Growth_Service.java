package group13.MaternaryAdvicerSystem.Service.Login;
import group13.MaternaryAdvicerSystem.Model.Dto.Save_BabyNutrients_Dto;
import group13.MaternaryAdvicerSystem.Model.Dto.Save_BabyGrowth_Dto;
import java.util.List;
import java.util.Optional;

public interface B_Growth_Service {
    public void saveBabyGrowth(Save_BabyGrowth_Dto babyGrowth);
    public List<Save_BabyGrowth_Dto> getBabyGrowth(String babyNum);
}
