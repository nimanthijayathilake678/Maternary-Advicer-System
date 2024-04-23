package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Midwife_Remark;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace;
import group13.MaternaryAdvicerSystem.Model.Domain.User;
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

    @Autowired
    private U_Basic_Info_Service uBasicInfoService;
    @Override
    public void saveMidwifeOtherRemark(C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace midwifeRemarkForNutritionLifestyleHousingWorkspace,Long userId) {
        User user = uBasicInfoService.getUserInfoById(userId);
        midwifeRemarkForNutritionLifestyleHousingWorkspace.setUser(user);
        c_midwife_remark_for_nutrition_lifestyle_housing_workspace_repository.save(midwifeRemarkForNutritionLifestyleHousingWorkspace);
    }

    @Override
    public List<C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace> getAllMidwifeOtherRemark() {
        return c_midwife_remark_for_nutrition_lifestyle_housing_workspace_repository.findAll();
    }

    @Override
    public C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace getMidwifeOtherRemarkById(Long userId) {
        return c_midwife_remark_for_nutrition_lifestyle_housing_workspace_repository.findByUserId(userId);
    }

    @Override
    public boolean updateMidwifeOtherRemarkInfo(C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace updateMidwifeOtherRemark, Long userId) {
        C_Midwife_Remark_For_Nutrition_Lifestyle_Housing_Workspace c_midwife_remark_for_nutrition_lifestyle_housing_workspace_optional = c_midwife_remark_for_nutrition_lifestyle_housing_workspace_repository.findByUserId(userId);
        if(c_midwife_remark_for_nutrition_lifestyle_housing_workspace_optional!=null){
            c_midwife_remark_for_nutrition_lifestyle_housing_workspace_optional.setThreeMainMealsRemarkByMidwife(updateMidwifeOtherRemark.getThreeMainMealsRemarkByMidwife());
            c_midwife_remark_for_nutrition_lifestyle_housing_workspace_optional.setAnimalProteinsRemarkByMidwife(updateMidwifeOtherRemark.getAnimalProteinsRemarkByMidwife());
            c_midwife_remark_for_nutrition_lifestyle_housing_workspace_optional.setPlantProteinsGrainsRemarkByMidwife(updateMidwifeOtherRemark.getPlantProteinsGrainsRemarkByMidwife());
            c_midwife_remark_for_nutrition_lifestyle_housing_workspace_optional.setVegetablesRemarkByMidwife(updateMidwifeOtherRemark.getVegetablesRemarkByMidwife());
            c_midwife_remark_for_nutrition_lifestyle_housing_workspace_optional.setGreensRemarkByMidwife(updateMidwifeOtherRemark.getGreensRemarkByMidwife());
            c_midwife_remark_for_nutrition_lifestyle_housing_workspace_optional.setFruitsRemarkByMidwife(updateMidwifeOtherRemark.getFruitsRemarkByMidwife());
            c_midwife_remark_for_nutrition_lifestyle_housing_workspace_optional.setHavingMealTogetherRemarkByMidwife(updateMidwifeOtherRemark.getHavingMealTogetherRemarkByMidwife());
            c_midwife_remark_for_nutrition_lifestyle_housing_workspace_optional.setIncludingGardenHarvestRemarkByMidwife(updateMidwifeOtherRemark.getIncludingGardenHarvestRemarkByMidwife());
            c_midwife_remark_for_nutrition_lifestyle_housing_workspace_optional.setTooMuchSugarRemarkByMidwife(updateMidwifeOtherRemark.getTooMuchSugarRemarkByMidwife());
            c_midwife_remark_for_nutrition_lifestyle_housing_workspace_optional.setTooMuchOilRemarkByMidwife(updateMidwifeOtherRemark.getTooMuchOilRemarkByMidwife());
            c_midwife_remark_for_nutrition_lifestyle_housing_workspace_optional.setUseCigarettesBetelLeavesTobacoRemarkByMidwife(updateMidwifeOtherRemark.getUseCigarettesBetelLeavesTobacoRemarkByMidwife());
            c_midwife_remark_for_nutrition_lifestyle_housing_workspace_optional.setUseLiquorRemarkByMidwife(updateMidwifeOtherRemark.getUseLiquorRemarkByMidwife());
            c_midwife_remark_for_nutrition_lifestyle_housing_workspace_optional.setUseDrugsRemarkByMidwife(updateMidwifeOtherRemark.getUseDrugsRemarkByMidwife());
            c_midwife_remark_for_nutrition_lifestyle_housing_workspace_optional.setHangoutWithSmokingPeopleRemarkByMidwife(updateMidwifeOtherRemark.getHangoutWithSmokingPeopleRemarkByMidwife());
            c_midwife_remark_for_nutrition_lifestyle_housing_workspace_optional.setAtmosphereNotPhysicallyMentalyAbusiveRemarkByMidwife(updateMidwifeOtherRemark.getAtmosphereNotPhysicallyMentalyAbusiveRemarkByMidwife());
            c_midwife_remark_for_nutrition_lifestyle_housing_workspace_optional.setDailyReligiousRitualRemarkByMidwife(updateMidwifeOtherRemark.getDailyReligiousRitualRemarkByMidwife());
            c_midwife_remark_for_nutrition_lifestyle_housing_workspace_optional.setRegularExerciseRemarkByMidwife(updateMidwifeOtherRemark.getRegularExerciseRemarkByMidwife());
            c_midwife_remark_for_nutrition_lifestyle_housing_workspace_optional.setTimeForHobbiesRemarkByMidwife(updateMidwifeOtherRemark.getTimeForHobbiesRemarkByMidwife());
            c_midwife_remark_for_nutrition_lifestyle_housing_workspace_optional.setExposedToChemicalRemarkByMidwife(updateMidwifeOtherRemark.getExposedToChemicalRemarkByMidwife());
            c_midwife_remark_for_nutrition_lifestyle_housing_workspace_optional.setExposedToLeadRemarkByMidwife(updateMidwifeOtherRemark.getExposedToLeadRemarkByMidwife());
            c_midwife_remark_for_nutrition_lifestyle_housing_workspace_optional.setExposedToXRayRemarkByMidwife(updateMidwifeOtherRemark.getExposedToXRayRemarkByMidwife());
            c_midwife_remark_for_nutrition_lifestyle_housing_workspace_optional.setHighTemperatureConditionsRemarkByMidwife(updateMidwifeOtherRemark.getHighTemperatureConditionsRemarkByMidwife());
            c_midwife_remark_for_nutrition_lifestyle_housing_workspace_optional.setSmokeFromCookingRemarkByMidwife(updateMidwifeOtherRemark.getSmokeFromCookingRemarkByMidwife());
            c_midwife_remark_for_nutrition_lifestyle_housing_workspace_optional.setNoiseEnvironmentRemarkByMidwife(updateMidwifeOtherRemark.getNoiseEnvironmentRemarkByMidwife());
            c_midwife_remark_for_nutrition_lifestyle_housing_workspace_optional.setFinancialManagementRemarkByMidwife(updateMidwifeOtherRemark.getFinancialManagementRemarkByMidwife());
            c_midwife_remark_for_nutrition_lifestyle_housing_workspace_optional.setCleanSafeWaterRemarkByMidwife(updateMidwifeOtherRemark.getCleanSafeWaterRemarkByMidwife());
            c_midwife_remark_for_nutrition_lifestyle_housing_workspace_optional.setToiletFacilitiesRemarkByMidwife(updateMidwifeOtherRemark.getToiletFacilitiesRemarkByMidwife());
            c_midwife_remark_for_nutrition_lifestyle_housing_workspace_optional.setProperWasteDispsalRemarkByMidwife(updateMidwifeOtherRemark.getProperWasteDispsalRemarkByMidwife());
            c_midwife_remark_for_nutrition_lifestyle_housing_workspace_optional.setEnvironmentalHazardousConditionsRemarkByMidwife(updateMidwifeOtherRemark.getEnvironmentalHazardousConditionsRemarkByMidwife());
            return true;
        }
        return false;
    }


}
