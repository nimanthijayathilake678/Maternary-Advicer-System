package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Midwife_Remark;
import group13.MaternaryAdvicerSystem.Model.Domain.User;
import group13.MaternaryAdvicerSystem.Repository.Login.C_Midwife_Remark_Repository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class C_Midwife_Remark_Service_Iml implements C_Midwife_Remark_Service {
    @Autowired
    private C_Midwife_Remark_Repository c_midwife_remark_repository;

    @Autowired
    private  U_Basic_Info_Service uBasicInfoService;

    @Override
    public void saveMidwifeRemark(C_Midwife_Remark midwife_remark, Long userId) {

        User user = uBasicInfoService.getUserInfoById(userId);
        midwife_remark.setUser(user);
        c_midwife_remark_repository.save(midwife_remark);
    }

    @Override
    public List<C_Midwife_Remark> getAllMidwifeRemark() {
        return c_midwife_remark_repository.findAll();
    }

    @Override
    public C_Midwife_Remark getMidwifeRemarkById(Long userId) {
        return c_midwife_remark_repository.findByUserId(userId);
    }

    @Override
    public boolean updateMidwifeRemark(C_Midwife_Remark updateMidwifeRemark, Long userId) {
       C_Midwife_Remark c_midwife_remark_optional = c_midwife_remark_repository.findByUserId(userId);
        if(c_midwife_remark_optional!=null){
            c_midwife_remark_optional.setRegistrationRemarkByMidwife(updateMidwifeRemark.getRegistrationRemarkByMidwife());

            c_midwife_remark_optional.setMohRemarkByMidwife(updateMidwifeRemark.getMohRemarkByMidwife());
            c_midwife_remark_optional.setPhmRemarkByMidwife(updateMidwifeRemark.getPhmRemarkByMidwife());
            c_midwife_remark_optional.setWifeNameRemarkByMidwife(updateMidwifeRemark.getWifeNameRemarkByMidwife());
            c_midwife_remark_optional.setHusbandNameRemarkByMidwife(updateMidwifeRemark.getHusbandNameRemarkByMidwife());
            c_midwife_remark_optional.setEmailRemarkByMidwife(updateMidwifeRemark.getEmailRemarkByMidwife());
            c_midwife_remark_optional.setTelephoneRemarkByMidwife(updateMidwifeRemark.getTelephoneRemarkByMidwife());
            c_midwife_remark_optional.setAddressRemarkByMidwife(updateMidwifeRemark.getAddressRemarkByMidwife());
            c_midwife_remark_optional.setDobRemarkByMidwife(updateMidwifeRemark.getDobRemarkByMidwife());
            c_midwife_remark_optional.setEducationalLevelRemarkByMidwife(updateMidwifeRemark.getEducationalLevelRemarkByMidwife());
            c_midwife_remark_optional.setOccupationRemarkByMidwife(updateMidwifeRemark.getOccupationRemarkByMidwife());
            c_midwife_remark_optional.setMarriedDateRemarkByMidwife(updateMidwifeRemark.getMarriedDateRemarkByMidwife());
            c_midwife_remark_optional.setAnemiaRemarkByMidwife(updateMidwifeRemark.getAnemiaRemarkByMidwife());
            c_midwife_remark_optional.setCongenitalRemarkByMidwife(updateMidwifeRemark.getCongenitalRemarkByMidwife());
            c_midwife_remark_optional.setRheumaticHeartDiseaseRemarkByMidwife(updateMidwifeRemark.getRheumaticHeartDiseaseRemarkByMidwife());
            c_midwife_remark_optional.setDiabetesMellitusRemarkByMidwife(updateMidwifeRemark.getDiabetesMellitusRemarkByMidwife());
            c_midwife_remark_optional.setHypertensionRemarkByMidwife(updateMidwifeRemark.getHypertensionRemarkByMidwife());
            c_midwife_remark_optional.setAsthmaRemarkByMidwife(updateMidwifeRemark.getAsthmaRemarkByMidwife());
            c_midwife_remark_optional.setThyroidRemarkByMidwife(updateMidwifeRemark.getThyroidRemarkByMidwife());
            c_midwife_remark_optional.setUntratedDecayedTeethRemarkByMidwife(updateMidwifeRemark.getUntratedDecayedTeethRemarkByMidwife());
            c_midwife_remark_optional.setToothDecayBleedingGumsRemarkByMidwife(updateMidwifeRemark.getToothDecayBleedingGumsRemarkByMidwife());
            c_midwife_remark_optional.setMentalIllnessesRemarkByMidwife(updateMidwifeRemark.getMentalIllnessesRemarkByMidwife());
            c_midwife_remark_optional.setRheumaticFeverRemarkByMidwife(updateMidwifeRemark.getRheumaticFeverRemarkByMidwife());
            c_midwife_remark_optional.setEpilepsyRemarkByMidwife(updateMidwifeRemark.getEpilepsyRemarkByMidwife());
            c_midwife_remark_optional.setFoodAllergiesRemarkByMidwife(updateMidwifeRemark.getFoodAllergiesRemarkByMidwife());
            c_midwife_remark_optional.setDrugsAllergiesRemarkByMidwife(updateMidwifeRemark.getDrugsAllergiesRemarkByMidwife());
            c_midwife_remark_optional.setLongTermMedicineRemarkByMidwife(updateMidwifeRemark.getLongTermMedicineRemarkByMidwife());
            c_midwife_remark_optional.setOtherSurgeriesRemarkByMidwife(updateMidwifeRemark.getOtherSurgeriesRemarkByMidwife());
            c_midwife_remark_optional.setRubellaVaccineRemarkByMidwife(updateMidwifeRemark.getRubellaVaccineRemarkByMidwife());
            c_midwife_remark_optional.setFolicAcidRemarkByMidwife(updateMidwifeRemark.getFolicAcidRemarkByMidwife());
            c_midwife_remark_optional.setBloodRelationMarrageRemarkByMidwife(updateMidwifeRemark.getBloodRelationMarrageRemarkByMidwife());
            c_midwife_remark_optional.setRegularMonthlyPeriodRemarkByMidwife(updateMidwifeRemark.getRegularMonthlyPeriodRemarkByMidwife());
            c_midwife_remark_optional.setNoOfPeriodDaysRemarkByMidwife(updateMidwifeRemark.getNoOfPeriodDaysRemarkByMidwife());
            c_midwife_remark_optional.setHeavyBleedingRemarkByMidwife(updateMidwifeRemark.getHeavyBleedingRemarkByMidwife());
            c_midwife_remark_optional.setVaginaBleedingRemarkByMidwife(updateMidwifeRemark.getVaginaBleedingRemarkByMidwife());
            c_midwife_remark_optional.setAbdominalPainRemarkByMidwife(updateMidwifeRemark.getAbdominalPainRemarkByMidwife());
            c_midwife_remark_optional.setUnusualColorFoulSmellingRemarkByMidwife(updateMidwifeRemark.getUnusualColorFoulSmellingRemarkByMidwife());
            c_midwife_remark_optional.setAbortionHistoryRemarkByMidwife(updateMidwifeRemark.getAbortionHistoryRemarkByMidwife());
            c_midwife_remark_optional.setStillBirthHistoryRemarkByMidwife(updateMidwifeRemark.getStillBirthHistoryRemarkByMidwife());
            c_midwife_remark_optional.setInfantMortalityHistoryRemarkByMidwife(updateMidwifeRemark.getInfantMortalityHistoryRemarkByMidwife());
            c_midwife_remark_optional.setTubalPregnancyHistoryRemarkByMidwife(updateMidwifeRemark.getTubalPregnancyHistoryRemarkByMidwife());
            c_midwife_remark_optional.setIsItchingRemarkByMidwife(updateMidwifeRemark.getIsItchingRemarkByMidwife());
            c_midwife_remark_optional.setReproductiveOrganSurgeryRemarkByMidwife(updateMidwifeRemark.getReproductiveOrganSurgeryRemarkByMidwife());
            c_midwife_remark_optional.setReproductiveOrganSurgeryDetailsRemarkByMidwife(updateMidwifeRemark.getReproductiveOrganSurgeryDetailsRemarkByMidwife());
            c_midwife_remark_optional.setSexualProblemsRemarkByMidwife(updateMidwifeRemark.getSexualProblemsRemarkByMidwife());
            c_midwife_remark_optional.setSatisfiedSexualRelationshipRemarkByMidwife(updateMidwifeRemark.getSatisfiedSexualRelationshipRemarkByMidwife());
            c_midwife_remark_optional.setBreastSelfExamRemarkByMidwife(updateMidwifeRemark.getBreastSelfExamRemarkByMidwife());
            c_midwife_remark_optional.setFamilyPlanningRemarkByMidwife(updateMidwifeRemark.getFamilyPlanningRemarkByMidwife());
            c_midwife_remark_optional.setFamilyPlanningDetailsRemarkByMidwife(updateMidwifeRemark.getFamilyPlanningDetailsRemarkByMidwife());
            c_midwife_remark_optional.setDelayingFirstChildRemarkByMidwife(updateMidwifeRemark.getDelayingFirstChildRemarkByMidwife());
            c_midwife_remark_optional.setDelayingTimePeriodRemarkByMidwife(updateMidwifeRemark.getDelayingTimePeriodRemarkByMidwife());
            c_midwife_remark_optional.setHypertensionRemark(updateMidwifeRemark.getHypertensionRemark());
            c_midwife_remark_optional.setDiabetesMellitusFamilyRemarkByMidwife(updateMidwifeRemark.getDiabetesMellitusFamilyRemarkByMidwife());
            c_midwife_remark_optional.setHeartDiseasesFamilyRemarkByMidwife(updateMidwifeRemark.getHeartDiseasesFamilyRemarkByMidwife());
            c_midwife_remark_optional.setNervousDisordersRemarkByMidwife(updateMidwifeRemark.getNervousDisordersRemarkByMidwife());
            c_midwife_remark_optional.setHemophiliaRemarkByMidwife(updateMidwifeRemark.getHemophiliaRemarkByMidwife());
            c_midwife_remark_optional.setThalassemiaRemarkByMidwife(updateMidwifeRemark.getThalassemiaRemarkByMidwife());
            c_midwife_remark_optional.setMentalProblemsRemarkByMidwife(updateMidwifeRemark.getMentalProblemsRemarkByMidwife());
            c_midwife_remark_optional.setTwinsRemarkByMidwife(updateMidwifeRemark.getTwinsRemarkByMidwife());
            return true;
        }
        return false;
    }
}
