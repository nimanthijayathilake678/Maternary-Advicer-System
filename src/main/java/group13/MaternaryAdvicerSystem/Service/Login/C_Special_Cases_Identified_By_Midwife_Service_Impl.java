package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Sexual_And_Reproductive_Health;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Special_Cases_Identified_By_Midwife;
import group13.MaternaryAdvicerSystem.Repository.Login.C_Special_Cases_Identified_By_Midwife_Repository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@Transactional
public class C_Special_Cases_Identified_By_Midwife_Service_Impl implements C_Special_Cases_Identified_By_Midwife_Service{
    @Autowired
    C_Special_Cases_Identified_By_Midwife_Repository c_special_cases_identified_by_midwife_repository;

    @Override
    public void saveSpecialCasesIdentifiedByMidwifeInfo(C_Special_Cases_Identified_By_Midwife c_special_cases_identified_by_midwife) {
        c_special_cases_identified_by_midwife_repository.save(c_special_cases_identified_by_midwife);
    }

    @Override
    public List<C_Special_Cases_Identified_By_Midwife> getAllSpecialCasesIdentifiedByMidwifeInfo() {
        return c_special_cases_identified_by_midwife_repository.findAll();
    }

    @Override
    public C_Special_Cases_Identified_By_Midwife getSpecialCasesIdentifiedByMidwifeInfoById(Long id) {
        return c_special_cases_identified_by_midwife_repository.findById(id).orElse(null);
    }

    @Override
    public boolean updateSpecialCasesIdentifiedByMidwifeInfo(C_Special_Cases_Identified_By_Midwife updateSpecialCasesIdentifiedByMidwifeInfoDetails, Long id) {
        Optional<C_Special_Cases_Identified_By_Midwife> c_special_cases_identified_by_midwife_optional = c_special_cases_identified_by_midwife_repository.findById(id);
        if(c_special_cases_identified_by_midwife_optional.isPresent()){
            C_Special_Cases_Identified_By_Midwife c_special_cases_identified_by_midwife_To_Update = c_special_cases_identified_by_midwife_optional.get();
            c_special_cases_identified_by_midwife_To_Update.setSpecialCaseId(updateSpecialCasesIdentifiedByMidwifeInfoDetails.getSpecialCaseId());
            return true;
        }
        return false;
    }
}
