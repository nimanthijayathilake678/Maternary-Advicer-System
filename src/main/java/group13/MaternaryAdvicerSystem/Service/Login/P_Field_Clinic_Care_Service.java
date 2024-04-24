package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.P_Field_Clinic_Care;

import java.util.List;

public interface P_Field_Clinic_Care_Service {
    public void saveFieldClinicDetails(P_Field_Clinic_Care p_field_clinic_care);
    public List<P_Field_Clinic_Care> getAllFieldClinicDetails();
    public P_Field_Clinic_Care getFieldClinicDetailsById(Long id);
    public boolean updateFieldClinicDetails(P_Field_Clinic_Care updatePregnancyFieldClinicDetails, Long id);
}
