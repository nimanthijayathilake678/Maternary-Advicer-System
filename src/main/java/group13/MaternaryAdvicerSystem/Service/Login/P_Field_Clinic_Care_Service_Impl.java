package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.P_Field_Clinic_Care;
import group13.MaternaryAdvicerSystem.Repository.Login.P_Field_Clinic_Care_Repository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class P_Field_Clinic_Care_Service_Impl implements P_Field_Clinic_Care_Service{
    @Autowired
    P_Field_Clinic_Care_Repository p_field_clinic_care_repository;

    @Override
    public void saveFieldClinicDetails(P_Field_Clinic_Care p_field_clinic_care){
        p_field_clinic_care_repository.save(p_field_clinic_care);
    }

    @Override
    public List<P_Field_Clinic_Care> getAllFieldClinicDetails(){
        return p_field_clinic_care_repository.findAll();
    }

    @Override
    public P_Field_Clinic_Care getFieldClinicDetailsById(Long id){
        return p_field_clinic_care_repository.findById(id).orElse(null);
    }

    @Override
    public boolean updateFieldClinicDetails(P_Field_Clinic_Care updatePregnancyFieldClinicDetails, Long id){
        Optional<P_Field_Clinic_Care> p_field_clinic_care_optional=p_field_clinic_care_repository.findById(id);

        if (p_field_clinic_care_optional.isPresent()){
            P_Field_Clinic_Care p_field_clinic_care_to_update=p_field_clinic_care_optional.get();

            p_field_clinic_care_to_update.setId(updatePregnancyFieldClinicDetails.getId());
            p_field_clinic_care_to_update.setPregnancy_id(updatePregnancyFieldClinicDetails.getPregnancy_id());
            p_field_clinic_care_to_update.setCouple_id(updatePregnancyFieldClinicDetails.getCouple_id());
            p_field_clinic_care_to_update.setP_Visit_Date(updatePregnancyFieldClinicDetails.getP_Visit_Date());
            p_field_clinic_care_to_update.setP_Poa(updatePregnancyFieldClinicDetails.getP_Poa());
            p_field_clinic_care_to_update.setP_Anemia(updatePregnancyFieldClinicDetails.isP_Anemia());
            p_field_clinic_care_to_update.setP_Fundal_Height(updatePregnancyFieldClinicDetails.getP_Fundal_Height());
            p_field_clinic_care_to_update.setP_PresentingPart(updatePregnancyFieldClinicDetails.getP_PresentingPart());
            p_field_clinic_care_to_update.setP_FM(updatePregnancyFieldClinicDetails.isP_FM());
            p_field_clinic_care_to_update.setP_FHS(updatePregnancyFieldClinicDetails.isP_FHS());
            p_field_clinic_care_to_update.setP_Oedema(updatePregnancyFieldClinicDetails.isP_Oedema());
            p_field_clinic_care_to_update.setP_Sugar(updatePregnancyFieldClinicDetails.getP_Sugar());
            p_field_clinic_care_to_update.setP_Albumin(updatePregnancyFieldClinicDetails.getP_Albumin());
            p_field_clinic_care_to_update.setP_Nutritional_Requirements(updatePregnancyFieldClinicDetails.isP_Nutritional_Requirements());
            p_field_clinic_care_to_update.setP_EDD_Informed(updatePregnancyFieldClinicDetails.isP_EDD_Informed());
            p_field_clinic_care_to_update.setP_DangerousSituation_Informed(updatePregnancyFieldClinicDetails.isP_DangerousSituation_Informed());
            p_field_clinic_care_to_update.setP_Conditions_ToAvoid(updatePregnancyFieldClinicDetails.isP_Conditions_ToAvoid());
            p_field_clinic_care_to_update.setP_Importance_Of_Mindful(updatePregnancyFieldClinicDetails.isP_Importance_Of_Mindful());
            p_field_clinic_care_to_update.setP_Personal_Safety(updatePregnancyFieldClinicDetails.isP_Personal_Safety());
            p_field_clinic_care_to_update.setP_Onset_Informed(updatePregnancyFieldClinicDetails.isP_Onset_Informed());
            p_field_clinic_care_to_update.setP_Hospital_Things(updatePregnancyFieldClinicDetails.isP_Hospital_Things());
            p_field_clinic_care_to_update.setP_BabyCare(updatePregnancyFieldClinicDetails.isP_BabyCare());
            p_field_clinic_care_to_update.setP_Risk_Characteristics(updatePregnancyFieldClinicDetails.isP_Risk_Characteristics());
            p_field_clinic_care_to_update.setP_Exclusive_Breastfeeding(updatePregnancyFieldClinicDetails.isP_Exclusive_Breastfeeding());
            p_field_clinic_care_to_update.setP_Breastfeeding_Posture(updatePregnancyFieldClinicDetails.isP_Breastfeeding_Posture());
            p_field_clinic_care_to_update.setP_Confirm_Milk_Availability(updatePregnancyFieldClinicDetails.isP_Confirm_Milk_Availability());
            p_field_clinic_care_to_update.setP_Postpartum_RiskFactor(updatePregnancyFieldClinicDetails.isP_Postpartum_RiskFactor());
            p_field_clinic_care_to_update.setP_FamilyPlanning_Idea(updatePregnancyFieldClinicDetails.isP_FamilyPlanning_Idea());
            p_field_clinic_care_to_update.setP_FamilyPlanning_Methods(updatePregnancyFieldClinicDetails.isP_FamilyPlanning_Methods());
            p_field_clinic_care_to_update.setP_Date_To_Visit_Clinic(updatePregnancyFieldClinicDetails.getP_Date_To_Visit_Clinic());

            p_field_clinic_care_repository.save(p_field_clinic_care_to_update); 

            return true;
        }
        return false;
    }





}
