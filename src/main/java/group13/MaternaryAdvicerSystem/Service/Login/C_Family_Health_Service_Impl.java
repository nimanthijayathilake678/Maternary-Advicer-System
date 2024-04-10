package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Eligible_Family_Account;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Family_Health;
import group13.MaternaryAdvicerSystem.Repository.Login.C_Eligible_Family_Account_Repository;
import group13.MaternaryAdvicerSystem.Repository.Login.C_Family_Health_Repository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class C_Family_Health_Service_Impl implements C_Family_Health_Service{
    @Autowired
    C_Family_Health_Repository c_family_health_repository;

    @Override
    public void saveFamilyHealth(C_Family_Health c_family_health) {
        c_family_health_repository.save(c_family_health);

    }

    @Override
    public List<C_Family_Health> getAllFamilyHealthDetails() {
        return c_family_health_repository.findAll();
    }

    @Override
    public C_Family_Health getFamilyHealthDetailsById(Long id) {
        return c_family_health_repository.findById(id).orElse(null);
    }

    @Override
    public boolean updateFamilyHealthDetails(C_Family_Health updateFamilyHealthInfo, Long id) {
        Optional<C_Family_Health> c_family_health_optional =  c_family_health_repository.findById(id);
        if(c_family_health_optional.isPresent()){
            C_Family_Health c_family_health_To_Update = c_family_health_optional.get();
            c_family_health_To_Update.setGender(updateFamilyHealthInfo.getGender());
            c_family_health_To_Update.setHypertension(updateFamilyHealthInfo.isHypertension());
            c_family_health_To_Update.setDiabetesMellitus(updateFamilyHealthInfo.isDiabetesMellitus());
            c_family_health_To_Update.setHeartDiseases(updateFamilyHealthInfo.isHeartDiseases());
            c_family_health_To_Update.setNervousDisorders(updateFamilyHealthInfo.isNervousDisorders());
            c_family_health_To_Update.setHemophilia(updateFamilyHealthInfo.isHemophilia());
            c_family_health_To_Update.setThalassemia(updateFamilyHealthInfo.isThalassemia());
            c_family_health_To_Update.setMentalProblems(updateFamilyHealthInfo.isMentalProblems());
            c_family_health_To_Update.setTwins(updateFamilyHealthInfo.isTwins());
            return true;
        }
        return false;
    }
}
