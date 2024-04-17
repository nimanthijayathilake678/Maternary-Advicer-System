package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Counselling_Session_By_Midwife;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Filled_By_Midwife;
import group13.MaternaryAdvicerSystem.Repository.Login.C_Counselling_Session_By_Midwife_Repository;
import group13.MaternaryAdvicerSystem.Repository.Login.C_Family_Health_Repository;
import group13.MaternaryAdvicerSystem.Repository.Login.C_Special_Cases_Identified_By_Midwife_Repository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional

public class C_Counselling_Session_By_Midwife_Service_Impl implements C_Counselling_Session_By_Midwife_Service{
    @Autowired
    C_Counselling_Session_By_Midwife_Repository c_counselling_session_by_midwife_repository;

    @Override
    public void saveCounsellingDetails(C_Counselling_Session_By_Midwife counsellingSessionByMidwife) {
        c_counselling_session_by_midwife_repository.save(counsellingSessionByMidwife);
    }

    @Override
    public List<C_Counselling_Session_By_Midwife> getAllCounsellingDetails() {
        return c_counselling_session_by_midwife_repository.findAll();
    }

    @Override
    public C_Counselling_Session_By_Midwife getCounsellingDetailsById(Long id) {
        return c_counselling_session_by_midwife_repository.findById(id).orElse(null);
    }

    @Override
    public boolean updateCounsellingDetails(C_Counselling_Session_By_Midwife updateCounsellingSessionByMidwife, Long id) {
        Optional<C_Counselling_Session_By_Midwife> c_counselling_session_by_midwife_optional = c_counselling_session_by_midwife_repository.findById(id);
        if(c_counselling_session_by_midwife_optional.isPresent()){
            C_Counselling_Session_By_Midwife c_counselling_session_by_midwife_To_Update = c_counselling_session_by_midwife_optional.get();
            c_counselling_session_by_midwife_To_Update.setCounsellingDate(updateCounsellingSessionByMidwife.getCounsellingDate());
            return true;
        }
        return false;
    }

}
