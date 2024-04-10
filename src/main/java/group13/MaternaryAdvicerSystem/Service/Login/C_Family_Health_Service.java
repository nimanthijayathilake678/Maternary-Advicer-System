package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Eligible_Family_Account;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Family_Health;

import java.util.List;

public interface C_Family_Health_Service {
    public void saveFamilyHealth(C_Family_Health c_family_health);
    public List<C_Family_Health> getAllFamilyHealthDetails();

    public C_Family_Health getFamilyHealthDetailsById(Long id);

    public boolean updateFamilyHealthDetails(C_Family_Health updateFamilyHealthInfo , Long id);
}
