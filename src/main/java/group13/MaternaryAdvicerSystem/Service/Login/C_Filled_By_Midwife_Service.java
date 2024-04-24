package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Family_Nutrition;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Filled_By_Midwife;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;


public interface C_Filled_By_Midwife_Service {
    public void saveFilledByMidwifeDetails(C_Filled_By_Midwife filledByMidwife,Long userId);

    public List<C_Filled_By_Midwife> getAllFilledByMidwifeDetails();

    public C_Filled_By_Midwife getFilledByMidwifeDetailsById(Long userId);

    public boolean updateFilledByMidwifeDetails(C_Filled_By_Midwife updateFilledByMidwifeDetails , Long userId);
}
