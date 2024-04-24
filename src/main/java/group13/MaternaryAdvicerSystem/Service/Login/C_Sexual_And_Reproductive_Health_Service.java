package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Medical_Conditions;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Sexual_And_Reproductive_Health;
import group13.MaternaryAdvicerSystem.Model.Domain.User;

import java.util.List;

public interface C_Sexual_And_Reproductive_Health_Service {
    public void saveSexualAndReproductiveHealthDetails(C_Sexual_And_Reproductive_Health sexualAndReproductiveHealth,Long userId);

    public List<C_Sexual_And_Reproductive_Health> getAllSexualAndReproductiveHealthDetails();

    public C_Sexual_And_Reproductive_Health getSexualAndReproductiveHealthDetailsById(Long userId);

    public boolean updateSexualAndReproductiveHealthDetails(C_Sexual_And_Reproductive_Health updatesexualAndReproductiveHealth , Long userId);
}
