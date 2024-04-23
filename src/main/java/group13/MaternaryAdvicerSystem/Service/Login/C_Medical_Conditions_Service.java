package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Eligible_Family_Account;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Medical_Conditions;
import group13.MaternaryAdvicerSystem.Model.Domain.User;

import java.util.List;

public interface C_Medical_Conditions_Service {
    public void saveMedicalConditions(C_Medical_Conditions medicalConditions,Long userId);

    public List<C_Medical_Conditions> getAllCoupleMedicalConditions();

    public C_Medical_Conditions getMedicalConditionsById(Long userId);

    public boolean updateMedicalConditions(C_Medical_Conditions updateCoupleMedicalDetails , Long userId);

}
