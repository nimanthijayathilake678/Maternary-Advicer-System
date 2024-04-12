package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Family_Nutrition;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Housing_And_Workspace;
import group13.MaternaryAdvicerSystem.Repository.Login.C_Housing_And_Workspace_Repository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class C_Housing_And_Workspace_Service_Impl implements C_Housing_And_Workspace_Service{
    @Autowired
    C_Housing_And_Workspace_Repository c_housing_and_workspace_repository;
    @Override
    public void saveHousingAndWorkspace(C_Housing_And_Workspace c_housing_and_workspace) {
        c_housing_and_workspace_repository.save(c_housing_and_workspace);

    }

    @Override
    public List<C_Housing_And_Workspace> getAllHousingAndWorkspaceDetails() {
        return c_housing_and_workspace_repository.findAll();
    }

    @Override
    public C_Housing_And_Workspace getHousingAndWorkspaceDetailsById(Long id) {
        return c_housing_and_workspace_repository.findById(id).orElse(null);
    }

    @Override
    public boolean updateHousingAndWorkspaceDetails(C_Housing_And_Workspace updateHousingAndWorkspace, Long id) {
        Optional<C_Housing_And_Workspace> c_housing_and_workspace_optional =  c_housing_and_workspace_repository.findById(id);
        if(c_housing_and_workspace_optional.isPresent()){
            C_Housing_And_Workspace c_housing_and_workspace_To_Update = c_housing_and_workspace_optional.get();
            c_housing_and_workspace_To_Update.setGender(updateHousingAndWorkspace.getGender());
            c_housing_and_workspace_To_Update.setExposedToChemical(updateHousingAndWorkspace.isExposedToChemical());
            c_housing_and_workspace_To_Update.setExposedToLead(updateHousingAndWorkspace.isExposedToLead());
            c_housing_and_workspace_To_Update.setExposedToXRay(updateHousingAndWorkspace.isExposedToXRay());
            c_housing_and_workspace_To_Update.setHighTemperatureConditions(updateHousingAndWorkspace.isHighTemperatureConditions());
            c_housing_and_workspace_To_Update.setSmokeFromCooking(updateHousingAndWorkspace.isSmokeFromCooking());
            c_housing_and_workspace_To_Update.setNoiseEnvironment(updateHousingAndWorkspace.isNoiseEnvironment());
            c_housing_and_workspace_To_Update.setFinancialManagement(updateHousingAndWorkspace.isFinancialManagement());
            c_housing_and_workspace_To_Update.setCleanSafeWater(updateHousingAndWorkspace.isCleanSafeWater());
            c_housing_and_workspace_To_Update.setToiletFacilities(updateHousingAndWorkspace.isToiletFacilities());
            c_housing_and_workspace_To_Update.setProperWasteDispsal(updateHousingAndWorkspace.isProperWasteDispsal());
            c_housing_and_workspace_To_Update.setEnvironmentalHazardousConditions(updateHousingAndWorkspace.isEnvironmentalHazardousConditions());
            return true;
        }
        return false;
    }
}
