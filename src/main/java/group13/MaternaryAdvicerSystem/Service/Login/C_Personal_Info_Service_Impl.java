package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Eligible_Family_Account;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Personal_Info;
import group13.MaternaryAdvicerSystem.Model.Domain.User;
import group13.MaternaryAdvicerSystem.Repository.Login.C_Personal_Info_Repository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class C_Personal_Info_Service_Impl implements C_Personal_Info_Service {
    @Autowired
    C_Personal_Info_Repository c_personal_info_repository;

    @Override
    public List<C_Personal_Info> getAllPersonalInformation() {
        return c_personal_info_repository.findAll();

    }

    @Override
    public C_Personal_Info getPersonalInfoById(Long userId){
        return c_personal_info_repository.findByUserId(userId);
    }

    @Override
    public boolean updatePersonalInfo(C_Personal_Info updatePersonalInfoDetails, Long userId) {
        C_Personal_Info c_personal_info_optional =  c_personal_info_repository.findByUserId(userId);
        if(c_personal_info_optional!=null){
            c_personal_info_optional.setW_dob(updatePersonalInfoDetails.getW_dob());
            c_personal_info_optional.setW_educationalLevel(updatePersonalInfoDetails.getW_educationalLevel());
            c_personal_info_optional.setW_occupation(updatePersonalInfoDetails.getW_occupation());
            c_personal_info_optional.setH_name(updatePersonalInfoDetails.getH_name());
            c_personal_info_optional.setH_dob(updatePersonalInfoDetails.getH_dob());
            c_personal_info_optional.setH_educationalLevel(updatePersonalInfoDetails.getH_educationalLevel());
            c_personal_info_optional.setH_occupation(updatePersonalInfoDetails.getH_occupation());
            c_personal_info_optional.setMarriedDate(updatePersonalInfoDetails.getMarriedDate());
            c_personal_info_optional.setAddress(updatePersonalInfoDetails.getAddress());
            return true;
        }
        return false;
    }

    @Override
    public void savePersonalInfo(C_Personal_Info c_personal_info) {
        c_personal_info_repository.save(c_personal_info);
    }


}
