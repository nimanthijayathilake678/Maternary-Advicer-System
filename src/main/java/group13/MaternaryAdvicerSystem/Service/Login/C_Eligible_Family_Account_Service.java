package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Eligible_Family_Account;

import java.util.List;

public interface C_Eligible_Family_Account_Service {
    public void registerFamily(C_Eligible_Family_Account eligibleFamily);
    public List<C_Eligible_Family_Account> getAllFamilies();

    public C_Eligible_Family_Account getFamilyById(Long id);

    public boolean updateEligibleFamily(C_Eligible_Family_Account updateFamilyDetails , Long id);

}
