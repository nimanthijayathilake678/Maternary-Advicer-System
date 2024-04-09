package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Eligible_Family_Account;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Sexual_And_Reproductive_Health;
import group13.MaternaryAdvicerSystem.Repository.Login.C_Eligible_Family_Account_Repository;
import group13.MaternaryAdvicerSystem.Repository.Login.C_Sexual_And_Reproductive_Health_Repository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional

public class C_Sexual_And_Reproductive_Health_Service_Impl implements C_Sexual_And_Reproductive_Health_Service {

    @Autowired
    C_Sexual_And_Reproductive_Health_Repository c_sexual_and_reproductive_health_repository;

    @Override
    public void saveSexualAndReproductiveHealthDetails(C_Sexual_And_Reproductive_Health sexualAndReproductiveHealth) {
        c_sexual_and_reproductive_health_repository.save(sexualAndReproductiveHealth);
    }

    @Override
    public List<C_Sexual_And_Reproductive_Health> getAllSexualAndReproductiveHealthDetails() {
        return c_sexual_and_reproductive_health_repository.findAll();
    }

    @Override
    public C_Sexual_And_Reproductive_Health getSexualAndReproductiveHealthDetailsById(Long id) {
        return c_sexual_and_reproductive_health_repository.findById(id).orElse(null);
    }

    @Override
    public boolean updateSexualAndReproductiveHealthDetails(C_Sexual_And_Reproductive_Health updatesexualAndReproductiveHealth, Long id) {
        Optional<C_Sexual_And_Reproductive_Health> c_sexual_and_reproductive_health_optional =  c_sexual_and_reproductive_health_repository.findById(id);
        if(c_sexual_and_reproductive_health_optional.isPresent()){
            C_Sexual_And_Reproductive_Health c_sexual_and_reproductive_health_To_Update = c_sexual_and_reproductive_health_optional.get();
            c_sexual_and_reproductive_health_To_Update.setGender(updatesexualAndReproductiveHealth.getGender());
            c_sexual_and_reproductive_health_To_Update.setRegularMonthlyPeriod(updatesexualAndReproductiveHealth.isRegularMonthlyPeriod());
            c_sexual_and_reproductive_health_To_Update.setNoOfPeriodDays(updatesexualAndReproductiveHealth.getNoOfPeriodDays());
            c_sexual_and_reproductive_health_To_Update.setHeavyBleeding(updatesexualAndReproductiveHealth.isHeavyBleeding());
            c_sexual_and_reproductive_health_To_Update.setVaginaBleeding(updatesexualAndReproductiveHealth.isVaginaBleeding());
            c_sexual_and_reproductive_health_To_Update.setAbdominalPain(updatesexualAndReproductiveHealth.isAbdominalPain());
            c_sexual_and_reproductive_health_To_Update.setStillBirthHistory(updatesexualAndReproductiveHealth.isStillBirthHistory());
            c_sexual_and_reproductive_health_To_Update.setInfantMortalityHistory(updatesexualAndReproductiveHealth.isInfantMortalityHistory());
            c_sexual_and_reproductive_health_To_Update.setTubalPregnancyHistory(updatesexualAndReproductiveHealth.isTubalPregnancyHistory());
            c_sexual_and_reproductive_health_To_Update.setItching(updatesexualAndReproductiveHealth.isItching());
            c_sexual_and_reproductive_health_To_Update.setReproductiveOrganSurgery(updatesexualAndReproductiveHealth.isReproductiveOrganSurgery());
            c_sexual_and_reproductive_health_To_Update.setReproductiveOrganSurgeryDetails(updatesexualAndReproductiveHealth.getReproductiveOrganSurgeryDetails());
            c_sexual_and_reproductive_health_To_Update.setSexualProblems(updatesexualAndReproductiveHealth.isSexualProblems());
            c_sexual_and_reproductive_health_To_Update.setSatisfiedSexualRelationship(updatesexualAndReproductiveHealth.isSatisfiedSexualRelationship());
            c_sexual_and_reproductive_health_To_Update.setBreastSelfExam(updatesexualAndReproductiveHealth.isBreastSelfExam());
            return true;
        }
        return false;
    }
}
