package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Family_Nutrition;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Filled_By_Midwife;
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
    @Override
    public void saveFilledByMidwifeDetails(C_Filled_By_Midwife filledByMidwife) {
        c_filled_by_midwife_repository.save(filledByMidwife);
    }

    @Override
    public List<C_Filled_By_Midwife> getAllFilledByMidwifeDetails() {
        return c_filled_by_midwife_repository.findAll();
    }

    @Override
    public C_Filled_By_Midwife getFilledByMidwifeDetailsById(Long id) {
        return c_filled_by_midwife_repository.findById(id).orElse(null);
    }

    @Override
    public boolean updateFilledByMidwifeDetails(C_Filled_By_Midwife updateFilledByMidwifeDetails, Long id) {
        Optional<C_Filled_By_Midwife> c_filled_by_midwife_optional = c_filled_by_midwife_repository.findById(id);
        if(c_filled_by_midwife_optional.isPresent()){
            C_Filled_By_Midwife c_filled_by_midwife_To_Update = c_filled_by_midwife_optional.get();
            c_filled_by_midwife_To_Update.setGender(updateFilledByMidwifeDetails.getGender());
            c_filled_by_midwife_To_Update.setWeight(updateFilledByMidwifeDetails.getWeight());
            c_filled_by_midwife_To_Update.setHeight(updateFilledByMidwifeDetails.getHeight());
            c_filled_by_midwife_To_Update.setBloodType(updateFilledByMidwifeDetails.getBloodType());
            c_filled_by_midwife_To_Update.setHemoglobinValue(updateFilledByMidwifeDetails.getHemoglobinValue());
            return true;
        }
        return false;
    }
}
