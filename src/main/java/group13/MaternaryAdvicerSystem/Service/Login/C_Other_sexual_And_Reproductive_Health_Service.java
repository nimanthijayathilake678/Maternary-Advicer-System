package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Medical_Conditions;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Other_Sexual_And_Reproductive_Health;

import java.util.List;

public interface C_Other_sexual_And_Reproductive_Health_Service {
    public void saveOtherSexualAndReproductiveHealth(C_Other_Sexual_And_Reproductive_Health otherSexualAndReproductiveHealth);

    public List<C_Other_Sexual_And_Reproductive_Health> getAllCoupleOtherSexualAndReproductiveHealth();

    public C_Other_Sexual_And_Reproductive_Health getOtherSexualAndReproductiveHealthById(Long id);

    public boolean updateOtherSexualAndReproductiveHealthService(C_Other_Sexual_And_Reproductive_Health updateCoupleOtherSexualAndReproductiveHealth , Long id);
}
