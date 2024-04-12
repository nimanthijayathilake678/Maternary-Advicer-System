package group13.MaternaryAdvicerSystem.Controller;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Housing_And_Workspace;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Life_Style;
import group13.MaternaryAdvicerSystem.Service.Login.C_Family_Nutrition_Service;
import group13.MaternaryAdvicerSystem.Service.Login.C_Housing_And_Workspace_Service;
import group13.MaternaryAdvicerSystem.Service.Login.C_Life_Style_Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("/housingAndWorkspace")
@RestController
public class C_Housing_And_Workspace_Controller {
    private final C_Housing_And_Workspace_Service c_housing_and_workspace_service;

    public C_Housing_And_Workspace_Controller(C_Housing_And_Workspace_Service c_housing_and_workspace_service) {
        this.c_housing_and_workspace_service = c_housing_and_workspace_service;
    }

    @PostMapping
    public String saveHousingAndWorkspaceInfo(@RequestBody C_Housing_And_Workspace housingAndWorkspace){
        c_housing_and_workspace_service.saveHousingAndWorkspace(housingAndWorkspace);
        return "Add a housing and workspace details";
    }

    @GetMapping
    public List<C_Housing_And_Workspace> getAllHousingAndWorkspaceInfo(){
        return c_housing_and_workspace_service.getAllHousingAndWorkspaceDetails();
    }

    @GetMapping("/{id}")
    public C_Housing_And_Workspace getHousingAndWorkspaceInfoById(@PathVariable Long id){
        return  c_housing_and_workspace_service.getHousingAndWorkspaceDetailsById(id);
    }

    @PutMapping("/{id}")
    public String updateHousingAndWorkspaceInfo(@RequestBody C_Housing_And_Workspace updateHousingAndWorkspace, @PathVariable Long id){
        c_housing_and_workspace_service.updateHousingAndWorkspaceDetails(updateHousingAndWorkspace,id);
        return "Update life style details successfully";
    }

}
