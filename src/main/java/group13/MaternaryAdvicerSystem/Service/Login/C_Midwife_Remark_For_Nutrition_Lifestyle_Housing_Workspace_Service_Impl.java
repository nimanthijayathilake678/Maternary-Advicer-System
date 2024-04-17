package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Midwife_Remark;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace;
import group13.MaternaryAdvicerSystem.Repository.Login.C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace_Repository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace_Service_Impl implements C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace_Service {

    @Autowired
    private C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace_Repository c_midwife_remark_for_nutrition_lifestyle_housing_workspace_repository;

    @Override
    public void saveMidwifeOtherRemark(C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace midwifeRemarkForNutritionLifestyleHousingWorkspace) {
        c_midwife_remark_for_nutrition_lifestyle_housing_workspace_repository.save(midwifeRemarkForNutritionLifestyleHousingWorkspace);
    }

    @Override
    public List<C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace> getAllMidwifeOtherRemark() {
        return c_midwife_remark_for_nutrition_lifestyle_housing_workspace_repository.findAll();
    }

    @Override
    public C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace getMidwifeOtherRemarkById(Long id) {
        return c_midwife_remark_for_nutrition_lifestyle_housing_workspace_repository.findById(id).orElse(null);
    }

    @Override
    public boolean updateMidwifeOtherRemarkInfo(C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace updateMidwifeOtherRemark, Long id) {
        Optional<C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace> c_midwife_remark_for_nutrition_lifestyle_housing_workspace_optional = c_midwife_remark_for_nutrition_lifestyle_housing_workspace_repository.findById(id);
        if(c_midwife_remark_for_nutrition_lifestyle_housing_workspace_optional.isPresent()){
            C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace_To_Update = c_midwife_remark_for_nutrition_lifestyle_housing_workspace_optional.get();
            C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace_To_Update.setThreeMainMealsRemarkByMidwife(updateMidwifeOtherRemark.getThreeMainMealsRemarkByMidwife());
            C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace_To_Update.setAnimalProteinsRemarkByMidwife(updateMidwifeOtherRemark.getAnimalProteinsRemarkByMidwife());
            C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace_To_Update.setPlantProteinsGrainsRemarkByMidwife(updateMidwifeOtherRemark.getPlantProteinsGrainsRemarkByMidwife());
            C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace_To_Update.setVegetablesRemarkByMidwife(updateMidwifeOtherRemark.getVegetablesRemarkByMidwife());
            C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace_To_Update.setGreensRemarkByMidwife(updateMidwifeOtherRemark.getGreensRemarkByMidwife());
            C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace_To_Update.setFruitsRemarkByMidwife(updateMidwifeOtherRemark.getFruitsRemarkByMidwife());
            C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace_To_Update.setHavingMealTogetherRemarkByMidwife(updateMidwifeOtherRemark.getHavingMealTogetherRemarkByMidwife());
            C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace_To_Update.setIncludingGardenHarvestRemarkByMidwife(updateMidwifeOtherRemark.getIncludingGardenHarvestRemarkByMidwife());
            C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace_To_Update.setTooMuchSugarRemarkByMidwife(updateMidwifeOtherRemark.getTooMuchSugarRemarkByMidwife());
            C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace_To_Update.setTooMuchOilRemarkByMidwife(updateMidwifeOtherRemark.getTooMuchOilRemarkByMidwife());
            C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace_To_Update.setUseCigarettesBetelLeavesTobacoRemarkByMidwife(updateMidwifeOtherRemark.getUseCigarettesBetelLeavesTobacoRemarkByMidwife());
            C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace_To_Update.setUseLiquorRemarkByMidwife(updateMidwifeOtherRemark.getUseLiquorRemarkByMidwife());
            C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace_To_Update.setUseDrugsRemarkByMidwife(updateMidwifeOtherRemark.getUseDrugsRemarkByMidwife());
            C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace_To_Update.setHangoutWithSmokingPeopleRemarkByMidwife(updateMidwifeOtherRemark.getHangoutWithSmokingPeopleRemarkByMidwife());
            C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace_To_Update.setAtmosphereNotPhysicallyMentalyAbusiveRemarkByMidwife(updateMidwifeOtherRemark.getAtmosphereNotPhysicallyMentalyAbusiveRemarkByMidwife());
            C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace_To_Update.setDailyReligiousRitualRemarkByMidwife(updateMidwifeOtherRemark.getDailyReligiousRitualRemarkByMidwife());
            C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace_To_Update.setRegularExerciseRemarkByMidwife(updateMidwifeOtherRemark.getRegularExerciseRemarkByMidwife());
            C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace_To_Update.setTimeForHobbiesRemarkByMidwife(updateMidwifeOtherRemark.getTimeForHobbiesRemarkByMidwife());
            C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace_To_Update.setExposedToChemicalRemarkByMidwife(updateMidwifeOtherRemark.getExposedToChemicalRemarkByMidwife());
            C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace_To_Update.setExposedToLeadRemarkByMidwife(updateMidwifeOtherRemark.getExposedToLeadRemarkByMidwife());
            C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace_To_Update.setExposedToXRayRemarkByMidwife(updateMidwifeOtherRemark.getExposedToXRayRemarkByMidwife());
            C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace_To_Update.setHighTemperatureConditionsRemarkByMidwife(updateMidwifeOtherRemark.getHighTemperatureConditionsRemarkByMidwife());
            C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace_To_Update.setSmokeFromCookingRemarkByMidwife(updateMidwifeOtherRemark.getSmokeFromCookingRemarkByMidwife());
            C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace_To_Update.setNoiseEnvironmentRemarkByMidwife(updateMidwifeOtherRemark.getNoiseEnvironmentRemarkByMidwife());
            C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace_To_Update.setFinancialManagementRemarkByMidwife(updateMidwifeOtherRemark.getFinancialManagementRemarkByMidwife());
            C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace_To_Update.setCleanSafeWaterRemarkByMidwife(updateMidwifeOtherRemark.getCleanSafeWaterRemarkByMidwife());
            C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace_To_Update.setToiletFacilitiesRemarkByMidwife(updateMidwifeOtherRemark.getToiletFacilitiesRemarkByMidwife());
            C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace_To_Update.setProperWasteDispsalRemarkByMidwife(updateMidwifeOtherRemark.getProperWasteDispsalRemarkByMidwife());
            C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace_To_Update.setEnvironmentalHazardousConditionsRemarkByMidwife(updateMidwifeOtherRemark.getEnvironmentalHazardousConditionsRemarkByMidwife());
            return true;
        }
        return false;
    }


}
