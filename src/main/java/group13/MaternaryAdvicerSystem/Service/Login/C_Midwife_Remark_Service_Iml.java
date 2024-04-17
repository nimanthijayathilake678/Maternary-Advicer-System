package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Midwife_Remark;
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
    @Override
    public void saveMidwifeRemark(C_Midwife_Remark midwife_remark) {
        c_midwife_remark_repository.save(midwife_remark);
    }

    @Override
    public List<C_Midwife_Remark> getAllMidwifeRemark() {
        return c_midwife_remark_repository.findAll();
    }

    @Override
    public C_Midwife_Remark getMidwifeRemarkById(Long id) {
        return c_midwife_remark_repository.findById(id).orElse(null);
    }

    @Override
    public boolean updateMidwifeRemark(C_Midwife_Remark updateMidwifeRemark, Long id) {
        Optional<C_Midwife_Remark> c_midwife_remark_optional = c_midwife_remark_repository.findById(id);
        if(c_midwife_remark_optional.isPresent()){
            C_Midwife_Remark c_midwife_remark_To_Update = c_midwife_remark_optional.get();
            c_midwife_remark_To_Update.setMohRemarkByMidwife(updateMidwifeRemark.getMohRemarkByMidwife());
            c_midwife_remark_To_Update.setPhmRemarkByMidwife(updateMidwifeRemark.getPhmRemarkByMidwife());
            c_midwife_remark_To_Update.setWifeNameRemarkByMidwife(updateMidwifeRemark.getWifeNameRemarkByMidwife());
            c_midwife_remark_To_Update.setHusbandNameRemarkByMidwife(updateMidwifeRemark.getHusbandNameRemarkByMidwife());
            c_midwife_remark_To_Update.setEmailRemarkByMidwife(updateMidwifeRemark.getEmailRemarkByMidwife());
            c_midwife_remark_To_Update.setTelephoneRemarkByMidwife(updateMidwifeRemark.getTelephoneRemarkByMidwife());
            c_midwife_remark_To_Update.setAddressRemarkByMidwife(updateMidwifeRemark.getAddressRemarkByMidwife());
            c_midwife_remark_To_Update.setDobRemarkByMidwife(updateMidwifeRemark.getDobRemarkByMidwife());
            c_midwife_remark_To_Update.setEducationalLevelRemarkByMidwife(updateMidwifeRemark.getEducationalLevelRemarkByMidwife());
            c_midwife_remark_To_Update.setOccupationRemarkByMidwife(updateMidwifeRemark.getOccupationRemarkByMidwife());
            c_midwife_remark_To_Update.setMarriedDateRemarkByMidwife(updateMidwifeRemark.getMarriedDateRemarkByMidwife());
            c_midwife_remark_To_Update.setAnemiaRemarkByMidwife(updateMidwifeRemark.getAnemiaRemarkByMidwife());
            c_midwife_remark_To_Update.setCongenitalRemarkByMidwife(updateMidwifeRemark.getCongenitalRemarkByMidwife());
            c_midwife_remark_To_Update.setRheumaticHeartDiseaseRemarkByMidwife(updateMidwifeRemark.getRheumaticHeartDiseaseRemarkByMidwife());
            c_midwife_remark_To_Update.setDiabetesMellitusRemarkByMidwife(updateMidwifeRemark.getDiabetesMellitusRemarkByMidwife());
            c_midwife_remark_To_Update.setHypertensionRemarkByMidwife(updateMidwifeRemark.getHypertensionRemarkByMidwife());
            c_midwife_remark_To_Update.setAsthmaRemarkByMidwife(updateMidwifeRemark.getAsthmaRemarkByMidwife());
            c_midwife_remark_To_Update.setThyroidRemarkByMidwife(updateMidwifeRemark.getThyroidRemarkByMidwife());
            c_midwife_remark_To_Update.setUntratedDecayedTeethRemarkByMidwife(updateMidwifeRemark.getUntratedDecayedTeethRemarkByMidwife());
            c_midwife_remark_To_Update.setToothDecayBleedingGumsRemarkByMidwife(updateMidwifeRemark.getToothDecayBleedingGumsRemarkByMidwife());
            c_midwife_remark_To_Update.setMentalIllnessesRemarkByMidwife(updateMidwifeRemark.getMentalIllnessesRemarkByMidwife());
            c_midwife_remark_To_Update.setRheumaticFeverRemarkByMidwife(updateMidwifeRemark.getRheumaticFeverRemarkByMidwife());
            c_midwife_remark_To_Update.setEpilepsyRemarkByMidwife(updateMidwifeRemark.getEpilepsyRemarkByMidwife());
            c_midwife_remark_To_Update.setFoodAllergiesRemarkByMidwife(updateMidwifeRemark.getFoodAllergiesRemarkByMidwife());
            c_midwife_remark_To_Update.setDrugsAllergiesRemarkByMidwife(updateMidwifeRemark.getDrugsAllergiesRemarkByMidwife());
            c_midwife_remark_To_Update.setLongTermMedicineRemarkByMidwife(updateMidwifeRemark.getLongTermMedicineRemarkByMidwife());
            c_midwife_remark_To_Update.setOtherSurgeriesRemarkByMidwife(updateMidwifeRemark.getOtherSurgeriesRemarkByMidwife());
            c_midwife_remark_To_Update.setRubellaVaccineRemarkByMidwife(updateMidwifeRemark.getRubellaVaccineRemarkByMidwife());
            c_midwife_remark_To_Update.setFolicAcidRemarkByMidwife(updateMidwifeRemark.getFolicAcidRemarkByMidwife());
            c_midwife_remark_To_Update.setBloodRelationMarrageRemarkByMidwife(updateMidwifeRemark.getBloodRelationMarrageRemarkByMidwife());
            c_midwife_remark_To_Update.setRegularMonthlyPeriodRemarkByMidwife(updateMidwifeRemark.getRegularMonthlyPeriodRemarkByMidwife());
            c_midwife_remark_To_Update.setNoOfPeriodDaysRemarkByMidwife(updateMidwifeRemark.getNoOfPeriodDaysRemarkByMidwife());
            c_midwife_remark_To_Update.setHeavyBleedingRemarkByMidwife(updateMidwifeRemark.getHeavyBleedingRemarkByMidwife());
            c_midwife_remark_To_Update.setVaginaBleedingRemarkByMidwife(updateMidwifeRemark.getVaginaBleedingRemarkByMidwife());
            c_midwife_remark_To_Update.setAbdominalPainRemarkByMidwife(updateMidwifeRemark.getAbdominalPainRemarkByMidwife());
            c_midwife_remark_To_Update.setUnusualColorFoulSmellingRemarkByMidwife(updateMidwifeRemark.getUnusualColorFoulSmellingRemarkByMidwife());
            c_midwife_remark_To_Update.setAbortionHistoryRemarkByMidwife(updateMidwifeRemark.getAbortionHistoryRemarkByMidwife());
            c_midwife_remark_To_Update.setStillBirthHistoryRemarkByMidwife(updateMidwifeRemark.getStillBirthHistoryRemarkByMidwife());
            c_midwife_remark_To_Update.setInfantMortalityHistoryRemarkByMidwife(updateMidwifeRemark.getInfantMortalityHistoryRemarkByMidwife());
            c_midwife_remark_To_Update.setTubalPregnancyHistoryRemarkByMidwife(updateMidwifeRemark.getTubalPregnancyHistoryRemarkByMidwife());
            c_midwife_remark_To_Update.setIsItchingRemarkByMidwife(updateMidwifeRemark.getIsItchingRemarkByMidwife());
            c_midwife_remark_To_Update.setReproductiveOrganSurgeryRemarkByMidwife(updateMidwifeRemark.getReproductiveOrganSurgeryRemarkByMidwife());
            c_midwife_remark_To_Update.setReproductiveOrganSurgeryDetailsRemarkByMidwife(updateMidwifeRemark.getReproductiveOrganSurgeryDetailsRemarkByMidwife());
            c_midwife_remark_To_Update.setSexualProblemsRemarkByMidwife(updateMidwifeRemark.getSexualProblemsRemarkByMidwife());
            c_midwife_remark_To_Update.setSatisfiedSexualRelationshipRemarkByMidwife(updateMidwifeRemark.getSatisfiedSexualRelationshipRemarkByMidwife());
            c_midwife_remark_To_Update.setBreastSelfExamRemarkByMidwife(updateMidwifeRemark.getBreastSelfExamRemarkByMidwife());
            c_midwife_remark_To_Update.setFamilyPlanningRemarkByMidwife(updateMidwifeRemark.getFamilyPlanningRemarkByMidwife());
            c_midwife_remark_To_Update.setFamilyPlanningDetailsRemarkByMidwife(updateMidwifeRemark.getFamilyPlanningDetailsRemarkByMidwife());
            c_midwife_remark_To_Update.setDelayingFirstChildRemarkByMidwife(updateMidwifeRemark.getDelayingFirstChildRemarkByMidwife());
            c_midwife_remark_To_Update.setDelayingTimePeriodRemarkByMidwife(updateMidwifeRemark.getDelayingTimePeriodRemarkByMidwife());
            c_midwife_remark_To_Update.setHypertensionRemark(updateMidwifeRemark.getHypertensionRemark());
            c_midwife_remark_To_Update.setDiabetesMellitusFamilyRemarkByMidwife(updateMidwifeRemark.getDiabetesMellitusFamilyRemarkByMidwife());
            c_midwife_remark_To_Update.setHeartDiseasesFamilyRemarkByMidwife(updateMidwifeRemark.getHeartDiseasesFamilyRemarkByMidwife());
            c_midwife_remark_To_Update.setNervousDisordersRemarkByMidwife(updateMidwifeRemark.getNervousDisordersRemarkByMidwife());
            c_midwife_remark_To_Update.setHemophiliaRemarkByMidwife(updateMidwifeRemark.getHemophiliaRemarkByMidwife());
            c_midwife_remark_To_Update.setThalassemiaRemarkByMidwife(updateMidwifeRemark.getThalassemiaRemarkByMidwife());
            c_midwife_remark_To_Update.setMentalProblemsRemarkByMidwife(updateMidwifeRemark.getMentalProblemsRemarkByMidwife());
            c_midwife_remark_To_Update.setTwinsRemarkByMidwife(updateMidwifeRemark.getTwinsRemarkByMidwife());
            return true;
        }
        return false;
    }
}
