package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Counselling_Session_By_Midwife;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Other_Sexual_And_Reproductive_Health;
import group13.MaternaryAdvicerSystem.Repository.Login.C_Family_Health_Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface C_Counselling_Session_By_Midwife_Service {

    public void saveCounsellingDetails(C_Counselling_Session_By_Midwife counsellingSessionByMidwife);

    public List<C_Counselling_Session_By_Midwife> getAllCounsellingDetails();

    public C_Counselling_Session_By_Midwife getCounsellingDetailsById(Long id);

    public boolean updateCounsellingDetails(C_Counselling_Session_By_Midwife updateCounsellingSessionByMidwife , Long id);
}
