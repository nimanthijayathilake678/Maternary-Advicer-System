package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Medical_Conditions;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Other_Sexual_And_Reproductive_Health;
import group13.MaternaryAdvicerSystem.Repository.Login.C_Medical_Conditions_Repository;
import group13.MaternaryAdvicerSystem.Repository.Login.C_Other_Sexual_And_Reproductive_Health_Repository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional

public class C_Other_Sexual_And_Reproductive_Health_Service_Impl implements C_Other_sexual_And_Reproductive_Health_Service {
    @Autowired
    C_Other_Sexual_And_Reproductive_Health_Repository c_other_sexual_and_reproductive_health_repository;

    @Override
    public void saveOtherSexualAndReproductiveHealth(C_Other_Sexual_And_Reproductive_Health otherSexualAndReproductiveHealth){
        c_other_sexual_and_reproductive_health_repository.save(otherSexualAndReproductiveHealth);
    }

    @Override
    public List<C_Other_Sexual_And_Reproductive_Health> getAllCoupleOtherSexualAndReproductiveHealth(){
        return c_other_sexual_and_reproductive_health_repository.findAll();
    }

    @Override
    public C_Other_Sexual_And_Reproductive_Health getOtherSexualAndReproductiveHealthById(Long id){
        return c_other_sexual_and_reproductive_health_repository.findById(id).orElse(null);
    }

    @Override
    public boolean updateOtherSexualAndReproductiveHealthService(C_Other_Sexual_And_Reproductive_Health updateCoupleOtherSexualAndReproductiveHealth , Long id) {
        Optional<C_Other_Sexual_And_Reproductive_Health> c_other_sexual_and_reproductive_health_optional =  c_other_sexual_and_reproductive_health_repository.findById(id);
        if(c_other_sexual_and_reproductive_health_optional.isPresent()){
            C_Other_Sexual_And_Reproductive_Health c_other_sexual_and_reproductive_health_To_Update = c_other_sexual_and_reproductive_health_optional.get();
            c_other_sexual_and_reproductive_health_To_Update.setFamilyPlanning(updateCoupleOtherSexualAndReproductiveHealth.isFamilyPlanning());
            c_other_sexual_and_reproductive_health_To_Update.setFamilyPlanningDetails(updateCoupleOtherSexualAndReproductiveHealth.getFamilyPlanningDetails());
            c_other_sexual_and_reproductive_health_To_Update.setDelayingFirstChild(updateCoupleOtherSexualAndReproductiveHealth.isDelayingFirstChild());
            c_other_sexual_and_reproductive_health_To_Update.setDelayingTimePeriod(updateCoupleOtherSexualAndReproductiveHealth.getDelayingTimePeriod());
            return true;
        }
        return false;
    }
}
