package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Eligible_Family_Account;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Medical_Conditions;
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

    @Override
    public void saveMedicalConditions(C_Medical_Conditions medicalConditions){
        c_medical_conditions_repository.save(medicalConditions);
    }

    @Override
    public List<C_Medical_Conditions> getAllCoupleMedicalConditions() {
       return c_medical_conditions_repository.findAll();
    }

    @Override
    public C_Medical_Conditions getMedicalConditionsById(Long id){
        return c_medical_conditions_repository.findById(id).orElse(null);
    }

    @Override
    public boolean updateMedicalConditions(C_Medical_Conditions updateCoupleMedicalDetails, Long id) {
        Optional<C_Medical_Conditions> c_medical_conditions_optional =  c_medical_conditions_repository.findById(id);
        if(c_medical_conditions_optional.isPresent()){
            C_Medical_Conditions c_medical_conditions_To_Update = c_medical_conditions_optional.get();
            c_medical_conditions_To_Update.setGender(updateCoupleMedicalDetails.getGender());
            c_medical_conditions_To_Update.setAnemia(updateCoupleMedicalDetails.isAnemia());
            c_medical_conditions_To_Update.setCongenital(updateCoupleMedicalDetails.isCongenital());
            c_medical_conditions_To_Update.setRheumaticHeartDisease(updateCoupleMedicalDetails.isRheumaticHeartDisease());
            c_medical_conditions_To_Update.setDiabetesMellitus(updateCoupleMedicalDetails.isDiabetesMellitus());
            c_medical_conditions_To_Update.setHypertension(updateCoupleMedicalDetails.isHypertension());
            c_medical_conditions_To_Update.setHypercholesterolemia(updateCoupleMedicalDetails.isHypercholesterolemia());
            c_medical_conditions_To_Update.setAsthma(updateCoupleMedicalDetails.isAsthma());
            c_medical_conditions_To_Update.setThyroid(updateCoupleMedicalDetails.isThyroid());
            c_medical_conditions_To_Update.setUntratedDecayedTeeth(updateCoupleMedicalDetails.isUntratedDecayedTeeth());
            c_medical_conditions_To_Update.setToothDecayBleedingGums(updateCoupleMedicalDetails.isToothDecayBleedingGums());
            c_medical_conditions_To_Update.setMentalIllnesses(updateCoupleMedicalDetails.isMentalIllnesses());
            c_medical_conditions_To_Update.setRheumaticFever(updateCoupleMedicalDetails.isRheumaticFever());
            c_medical_conditions_To_Update.setEpilepsy(updateCoupleMedicalDetails.isEpilepsy());
            c_medical_conditions_To_Update.setFoodAllergies(updateCoupleMedicalDetails.isFoodAllergies());
            c_medical_conditions_To_Update.setDrugsAllergies(updateCoupleMedicalDetails.isDrugsAllergies());
            c_medical_conditions_To_Update.setLongTermMedicine(updateCoupleMedicalDetails.isLongTermMedicine());
            c_medical_conditions_To_Update.setOtherSurgeries(updateCoupleMedicalDetails.isOtherSurgeries());
            c_medical_conditions_To_Update.setRubellaVaccine(updateCoupleMedicalDetails.isRubellaVaccine());
            c_medical_conditions_To_Update.setFolicAcid(updateCoupleMedicalDetails.isFolicAcid());
            c_medical_conditions_To_Update.setBloodRelationMarrage(updateCoupleMedicalDetails.isBloodRelationMarrage());
            return true;
        }
        return false;
    }
}



