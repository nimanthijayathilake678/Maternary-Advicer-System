package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Family_Health;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Housing_And_Workspace;

import java.util.List;

public interface C_Housing_And_Workspace_Service {
    public void saveHousingAndWorkspace(C_Housing_And_Workspace c_housing_and_workspace);
    public List<C_Housing_And_Workspace> getAllHousingAndWorkspaceDetails();

    public C_Housing_And_Workspace getHousingAndWorkspaceDetailsById(Long id);

    public boolean updateHousingAndWorkspaceDetails(C_Housing_And_Workspace updateHousingAndWorkspace , Long id);
}
