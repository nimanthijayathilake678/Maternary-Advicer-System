package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Eligible_Family_Account;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Personal_Info;
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
    public C_Personal_Info getPersonalInfoById(Long id){
        return c_personal_info_repository.findById(id).orElse(null);
    }

    @Override
    public boolean updatePersonalInfo(C_Personal_Info updatePersonalInfoDetails, Long id) {
        Optional<C_Personal_Info> c_personal_info_optional =  c_personal_info_repository.findById(id);
        if(c_personal_info_optional.isPresent()){
            C_Personal_Info c_peronal_info_To_Update = c_personal_info_optional.get();
            c_peronal_info_To_Update.setGender(updatePersonalInfoDetails.getGender());
            c_peronal_info_To_Update.setDob(updatePersonalInfoDetails.getDob());
            c_peronal_info_To_Update.setEducationalLevel(updatePersonalInfoDetails.getEducationalLevel());
            c_peronal_info_To_Update.setOccupation(updatePersonalInfoDetails.getOccupation());
            c_peronal_info_To_Update.setMarriedDate(updatePersonalInfoDetails.getMarriedDate());
            return true;
        }
        return false;
    }

    @Override
    public void savePersonalInfo(C_Personal_Info c_personal_info) {
        c_personal_info_repository.save(c_personal_info);
    }


}
