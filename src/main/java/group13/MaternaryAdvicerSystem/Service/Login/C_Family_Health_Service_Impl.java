package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Eligible_Family_Account;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Family_Health;
import group13.MaternaryAdvicerSystem.Model.Domain.User;
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
    public C_Family_Health getFamilyHealthDetailsById(Long userId) {
        return c_family_health_repository.findByUserId(userId);
    }

    @Override
    public boolean updateFamilyHealthDetails(C_Family_Health updateFamilyHealthInfo, Long userId) {
        C_Family_Health c_family_health_optional =  c_family_health_repository.findByUserId(userId);
        if(c_family_health_optional!=null){
            c_family_health_optional.setW_hypertension(updateFamilyHealthInfo.isW_hypertension());
            c_family_health_optional.setW_diabetesMellitus(updateFamilyHealthInfo.isW_diabetesMellitus());
            c_family_health_optional.setW_heartDiseases(updateFamilyHealthInfo.isW_heartDiseases());
            c_family_health_optional.setW_nervousDisorders(updateFamilyHealthInfo.isW_nervousDisorders());
            c_family_health_optional.setW_hemophilia(updateFamilyHealthInfo.isW_hemophilia());
            c_family_health_optional.setW_thalassemia(updateFamilyHealthInfo.isW_thalassemia());
            c_family_health_optional.setW_mentalProblems(updateFamilyHealthInfo.isW_mentalProblems());
            c_family_health_optional.setW_twins(updateFamilyHealthInfo.isW_twins());
            c_family_health_optional.setH_hypertension(updateFamilyHealthInfo.isH_hypertension());
            c_family_health_optional.setH_diabetesMellitus(updateFamilyHealthInfo.isH_diabetesMellitus());
            c_family_health_optional.setH_heartDiseases(updateFamilyHealthInfo.isH_heartDiseases());
            c_family_health_optional.setH_nervousDisorders(updateFamilyHealthInfo.isH_nervousDisorders());
            c_family_health_optional.setH_hemophilia(updateFamilyHealthInfo.isH_hemophilia());
            c_family_health_optional.setH_thalassemia(updateFamilyHealthInfo.isH_thalassemia());
            c_family_health_optional.setH_mentalProblems(updateFamilyHealthInfo.isH_mentalProblems());
            c_family_health_optional.setH_twins(updateFamilyHealthInfo.isH_twins());
            return true;
        }
        return false;
    }
}
