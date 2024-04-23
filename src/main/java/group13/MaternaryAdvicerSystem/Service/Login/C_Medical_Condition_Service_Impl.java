package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Eligible_Family_Account;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Medical_Conditions;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Personal_Info;
import group13.MaternaryAdvicerSystem.Model.Domain.User;
import group13.MaternaryAdvicerSystem.Repository.Login.C_Eligible_Family_Account_Repository;
import group13.MaternaryAdvicerSystem.Repository.Login.C_Medical_Conditions_Repository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class C_Medical_Condition_Service_Impl implements C_Medical_Conditions_Service{
    @Autowired
    C_Medical_Conditions_Repository c_medical_conditions_repository;

    @Autowired
    private U_Basic_Info_Service uBasicInfoService;
    @Override
    public void saveMedicalConditions(C_Medical_Conditions medicalConditions,Long userId){
        User user = uBasicInfoService.getUserInfoById(userId);
        medicalConditions.setUser(user);
        c_medical_conditions_repository.save(medicalConditions);
    }

    @Override
    public List<C_Medical_Conditions> getAllCoupleMedicalConditions() {
       return c_medical_conditions_repository.findAll();
    }

    @Override
    public C_Medical_Conditions getMedicalConditionsById(Long userId){
        return c_medical_conditions_repository.findByUserId(userId);
    }

    @Override
    public boolean updateMedicalConditions(C_Medical_Conditions updateCoupleMedicalDetails, Long userId) {
       C_Medical_Conditions c_medical_conditions_optional =  c_medical_conditions_repository.findByUserId(userId);
        if(c_medical_conditions_optional!=null){
            c_medical_conditions_optional.setW_anemia(updateCoupleMedicalDetails.isW_anemia());
            c_medical_conditions_optional.setW_congenital(updateCoupleMedicalDetails.isW_congenital());
            c_medical_conditions_optional.setW_rheumaticHeartDisease(updateCoupleMedicalDetails.isW_rheumaticHeartDisease());
            c_medical_conditions_optional.setW_diabetesMellitus(updateCoupleMedicalDetails.isW_diabetesMellitus());
            c_medical_conditions_optional.setW_hypertension(updateCoupleMedicalDetails.isW_hypertension());
            c_medical_conditions_optional.setW_hypercholesterolemia(updateCoupleMedicalDetails.isW_hypercholesterolemia());
            c_medical_conditions_optional.setW_asthma(updateCoupleMedicalDetails.isW_asthma());
            c_medical_conditions_optional.setW_thyroid(updateCoupleMedicalDetails.isW_thyroid());
            c_medical_conditions_optional.setW_untratedDecayedTeeth(updateCoupleMedicalDetails.isW_untratedDecayedTeeth());
            c_medical_conditions_optional.setW_toothDecayBleedingGums(updateCoupleMedicalDetails.isW_toothDecayBleedingGums());
            c_medical_conditions_optional.setW_mentalIllnesses(updateCoupleMedicalDetails.isW_mentalIllnesses());
            c_medical_conditions_optional.setW_rheumaticFever(updateCoupleMedicalDetails.isW_rheumaticFever());
            c_medical_conditions_optional.setW_epilepsy(updateCoupleMedicalDetails.isW_epilepsy());
            c_medical_conditions_optional.setW_foodAllergies(updateCoupleMedicalDetails.isW_foodAllergies());
            c_medical_conditions_optional.setW_drugsAllergies(updateCoupleMedicalDetails.isW_drugsAllergies());
//            c_medical_conditions_optional.setW_longTermMedicine(updateCoupleMedicalDetails.isW_longTermMedicine());
//            c_medical_conditions_optional.setW_otherSurgeries(updateCoupleMedicalDetails.isW_otherSurgeries());
//            c_medical_conditions_optional.setW_rubellaVaccine(updateCoupleMedicalDetails.isW_rubellaVaccine());
//            c_medical_conditions_optional.setW_folicAcid(updateCoupleMedicalDetails.isW_folicAcid());
//            c_medical_conditions_optional.setW_bloodRelationMarrage(updateCoupleMedicalDetails.isW_bloodRelationMarrage());
            c_medical_conditions_optional.setH_anemia(updateCoupleMedicalDetails.isH_anemia());
            c_medical_conditions_optional.setH_congenital(updateCoupleMedicalDetails.isH_congenital());
            c_medical_conditions_optional.setH_rheumaticHeartDisease(updateCoupleMedicalDetails.isH_rheumaticHeartDisease());
            c_medical_conditions_optional.setH_diabetesMellitus(updateCoupleMedicalDetails.isH_diabetesMellitus());
            c_medical_conditions_optional.setH_hypertension(updateCoupleMedicalDetails.isH_hypertension());
            c_medical_conditions_optional.setH_hypercholesterolemia(updateCoupleMedicalDetails.isH_hypercholesterolemia());
            c_medical_conditions_optional.setH_asthma(updateCoupleMedicalDetails.isH_asthma());
            c_medical_conditions_optional.setH_thyroid(updateCoupleMedicalDetails.isH_thyroid());
            c_medical_conditions_optional.setH_untratedDecayedTeeth(updateCoupleMedicalDetails.isH_untratedDecayedTeeth());
            c_medical_conditions_optional.setH_toothDecayBleedingGums(updateCoupleMedicalDetails.isH_toothDecayBleedingGums());
            c_medical_conditions_optional.setH_mentalIllnesses(updateCoupleMedicalDetails.isH_mentalIllnesses());
            c_medical_conditions_optional.setH_rheumaticFever(updateCoupleMedicalDetails.isH_rheumaticFever());
            c_medical_conditions_optional.setH_epilepsy(updateCoupleMedicalDetails.isH_epilepsy());
            c_medical_conditions_optional.setH_foodAllergies(updateCoupleMedicalDetails.isH_foodAllergies());
            c_medical_conditions_optional.setH_drugsAllergies(updateCoupleMedicalDetails.isH_drugsAllergies());
//            c_medical_conditions_optional.setH_longTermMedicine(updateCoupleMedicalDetails.isH_longTermMedicine());
//            c_medical_conditions_optional.setH_otherSurgeries(updateCoupleMedicalDetails.isH_otherSurgeries());

            return true;
        }
        return false;
    }


}



