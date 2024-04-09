package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.B_Basic_Info;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Eligible_Family_Account;
import group13.MaternaryAdvicerSystem.Model.Dto.C_Eligible_Family_Account_Dto;
import group13.MaternaryAdvicerSystem.Repository.Login.C_Eligible_Family_Account_Repository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class C_Eligible_Family_Account_Service_Impl implements  C_Eligible_Family_Account_Service{
    @Autowired
    C_Eligible_Family_Account_Repository c_eligible_family_account_repository;

    @Override
    public void registerFamily(C_Eligible_Family_Account eligible_Family){
        c_eligible_family_account_repository.save(eligible_Family);
        System.out.println("Successfully Added new family details");
    }

    @Override
    public List<C_Eligible_Family_Account> getAllFamilies() {
        return c_eligible_family_account_repository.findAll();
    }

    @Override
    public C_Eligible_Family_Account getFamilyById(Long id){
        return c_eligible_family_account_repository.findById(id).orElse(null);
    }

    @Override
    public boolean updateEligibleFamily(C_Eligible_Family_Account updateFamilyDetails, Long id) {
        Optional<C_Eligible_Family_Account> c_eligible_family_account_optional =  c_eligible_family_account_repository.findById(id);
        if(c_eligible_family_account_optional.isPresent()){
            C_Eligible_Family_Account c_eligible_family_account_To_Update = c_eligible_family_account_optional.get();
            c_eligible_family_account_To_Update.setPhm(updateFamilyDetails.getPhm());
            c_eligible_family_account_To_Update.setMoh(updateFamilyDetails.getMoh());
            c_eligible_family_account_To_Update.setWifeName(updateFamilyDetails.getWifeName());
            c_eligible_family_account_To_Update.setHusbandName(updateFamilyDetails.getHusbandName());
            c_eligible_family_account_To_Update.setEmail(updateFamilyDetails.getEmail());
            c_eligible_family_account_To_Update.setAddress(updateFamilyDetails.getAddress());
            c_eligible_family_account_To_Update.setTelephone(updateFamilyDetails.getTelephone());
            c_eligible_family_account_repository.save(c_eligible_family_account_To_Update);
            return true;
        }
        return false;
    }

}
