package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Eligible_Family_Account;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Medical_Conditions;
import group13.MaternaryAdvicerSystem.Model.Domain.User;

import java.util.List;

public interface C_Medical_Conditions_Service {
    public void saveMedicalConditions(C_Medical_Conditions medicalConditions);

    public List<C_Medical_Conditions> getAllCoupleMedicalConditions();

    public C_Medical_Conditions getMedicalConditionsById(User id);

    public boolean updateMedicalConditions(C_Medical_Conditions updateCoupleMedicalDetails , User id);

}
