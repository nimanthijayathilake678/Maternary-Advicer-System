package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Eligible_Family_Account;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Sexual_And_Reproductive_Health;
import group13.MaternaryAdvicerSystem.Model.Domain.User;
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

    @Autowired
    private U_Basic_Info_Service uBasicInfoService;
    @Override
    public void saveSexualAndReproductiveHealthDetails(C_Sexual_And_Reproductive_Health sexualAndReproductiveHealth,Long userId) {
        User user = uBasicInfoService.getUserInfoById(userId);
        sexualAndReproductiveHealth.setUser(user);
        c_sexual_and_reproductive_health_repository.save(sexualAndReproductiveHealth);
    }

    @Override
    public List<C_Sexual_And_Reproductive_Health> getAllSexualAndReproductiveHealthDetails() {
        return c_sexual_and_reproductive_health_repository.findAll();
    }

    @Override
    public C_Sexual_And_Reproductive_Health getSexualAndReproductiveHealthDetailsById(Long userId) {
        return c_sexual_and_reproductive_health_repository.findByUserId(userId);
    }

    @Override
    public boolean updateSexualAndReproductiveHealthDetails(C_Sexual_And_Reproductive_Health updatesexualAndReproductiveHealth, Long userId) {
        C_Sexual_And_Reproductive_Health c_sexual_and_reproductive_health_optional =  c_sexual_and_reproductive_health_repository.findByUserId(userId);
        if(c_sexual_and_reproductive_health_optional!=null){
            c_sexual_and_reproductive_health_optional.setW_regularMonthlyPeriod(updatesexualAndReproductiveHealth.isW_regularMonthlyPeriod());
            c_sexual_and_reproductive_health_optional.setW_noOfPeriodDays(updatesexualAndReproductiveHealth.getW_noOfPeriodDays());
            c_sexual_and_reproductive_health_optional.setW_heavyBleeding(updatesexualAndReproductiveHealth.isW_heavyBleeding());
            c_sexual_and_reproductive_health_optional.setW_vaginaBleeding(updatesexualAndReproductiveHealth.isW_vaginaBleeding());
            c_sexual_and_reproductive_health_optional.setW_abdominalPain(updatesexualAndReproductiveHealth.isW_abdominalPain());
            c_sexual_and_reproductive_health_optional.setW_unusualColorFoulSmelling(updatesexualAndReproductiveHealth.isW_unusualColorFoulSmelling());
            c_sexual_and_reproductive_health_optional.setW_abortionHistory(updatesexualAndReproductiveHealth.isW_abortionHistory());
            c_sexual_and_reproductive_health_optional.setW_stillBirthHistory(updatesexualAndReproductiveHealth.isW_stillBirthHistory());
            c_sexual_and_reproductive_health_optional.setW_infantMortalityHistory(updatesexualAndReproductiveHealth.isW_infantMortalityHistory());
            c_sexual_and_reproductive_health_optional.setW_tubalPregnancyHistory(updatesexualAndReproductiveHealth.isW_tubalPregnancyHistory());
            c_sexual_and_reproductive_health_optional.setW_isItching(updatesexualAndReproductiveHealth.isW_isItching());
            c_sexual_and_reproductive_health_optional.setW_reproductiveOrganSurgery(updatesexualAndReproductiveHealth.isW_reproductiveOrganSurgery());
            c_sexual_and_reproductive_health_optional.setW_reproductiveOrganSurgeryDetails(updatesexualAndReproductiveHealth.getW_reproductiveOrganSurgeryDetails());
            c_sexual_and_reproductive_health_optional.setW_sexualProblems(updatesexualAndReproductiveHealth.isW_sexualProblems());
            c_sexual_and_reproductive_health_optional.setW_satisfiedSexualRelationship(updatesexualAndReproductiveHealth.isW_satisfiedSexualRelationship());
            c_sexual_and_reproductive_health_optional.setW_breastSelfExam(updatesexualAndReproductiveHealth.isW_breastSelfExam());
            c_sexual_and_reproductive_health_optional.setH_isItching(updatesexualAndReproductiveHealth.isH_isItching());
            c_sexual_and_reproductive_health_optional.setH_reproductiveOrganSurgery(updatesexualAndReproductiveHealth.isH_reproductiveOrganSurgery());
            c_sexual_and_reproductive_health_optional.setH_reproductiveOrganSurgeryDetails(updatesexualAndReproductiveHealth.getH_reproductiveOrganSurgeryDetails());
            c_sexual_and_reproductive_health_optional.setH_sexualProblems(updatesexualAndReproductiveHealth.isH_sexualProblems());
            c_sexual_and_reproductive_health_optional.setH_satisfiedSexualRelationship(updatesexualAndReproductiveHealth.isH_satisfiedSexualRelationship());
            c_sexual_and_reproductive_health_optional.setFamilyPlanning(updatesexualAndReproductiveHealth.isFamilyPlanning());
            c_sexual_and_reproductive_health_optional.setFamilyPlanningDetails(updatesexualAndReproductiveHealth.getFamilyPlanningDetails());
            c_sexual_and_reproductive_health_optional.setDelayingFirstChild(updatesexualAndReproductiveHealth.isDelayingFirstChild());
            c_sexual_and_reproductive_health_optional.setDelayingTimePeriod(updatesexualAndReproductiveHealth.getDelayingTimePeriod());
            return true;
        }
        return false;
    }
}
