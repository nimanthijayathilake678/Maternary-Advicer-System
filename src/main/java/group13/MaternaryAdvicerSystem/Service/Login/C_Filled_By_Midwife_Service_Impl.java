package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Family_Nutrition;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Filled_By_Midwife;
import group13.MaternaryAdvicerSystem.Model.Domain.User;
import group13.MaternaryAdvicerSystem.Repository.Login.C_Filled_By_Midwife_Repository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class C_Filled_By_Midwife_Service_Impl implements C_Filled_By_Midwife_Service{
    @Autowired
    C_Filled_By_Midwife_Repository c_filled_by_midwife_repository;

    @Autowired
    private U_Basic_Info_Service uBasicInfoService;


    @Override
    public void saveFilledByMidwifeDetails(C_Filled_By_Midwife filledByMidwife,Long userId) {
        User user = uBasicInfoService.getUserInfoById(userId);
        filledByMidwife.setUser(user);
        c_filled_by_midwife_repository.save(filledByMidwife);
    }

    @Override
    public List<C_Filled_By_Midwife> getAllFilledByMidwifeDetails() {
        return c_filled_by_midwife_repository.findAll();
    }

    @Override
    public C_Filled_By_Midwife getFilledByMidwifeDetailsById(Long userId) {
        return c_filled_by_midwife_repository.findByUserId(userId);
    }

    @Override
    public boolean updateFilledByMidwifeDetails(C_Filled_By_Midwife updateFilledByMidwifeDetails, Long userId) {
        C_Filled_By_Midwife c_filled_by_midwife_optional = c_filled_by_midwife_repository.findByUserId(userId);
        if(c_filled_by_midwife_optional!=null){
            c_filled_by_midwife_optional.setW_weight(updateFilledByMidwifeDetails.getW_weight());
           c_filled_by_midwife_optional.setW_height(updateFilledByMidwifeDetails.getW_height());
            c_filled_by_midwife_optional.setW_bloodType(updateFilledByMidwifeDetails.getW_bloodType());
            c_filled_by_midwife_optional.setW_hemoglobinValue(updateFilledByMidwifeDetails.getW_hemoglobinValue());
            c_filled_by_midwife_optional.setH_weight(updateFilledByMidwifeDetails.getH_weight());
            c_filled_by_midwife_optional.setH_bloodType(updateFilledByMidwifeDetails.getH_bloodType());
            c_filled_by_midwife_optional.setH_hemoglobinValue(updateFilledByMidwifeDetails.getH_hemoglobinValue());
            c_filled_by_midwife_optional.setH_height(updateFilledByMidwifeDetails.getH_height());
            return true;
        }
        return false;
    }
}
