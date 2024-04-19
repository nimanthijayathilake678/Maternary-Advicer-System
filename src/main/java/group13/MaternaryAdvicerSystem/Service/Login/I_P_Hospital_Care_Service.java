package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.P_Hospital_Clinic_Care;

import java.util.List;

public interface I_P_Hospital_Care_Service {
    P_Hospital_Clinic_Care addP_Hospital_Clinic_Care(P_Hospital_Clinic_Care p_hospital_clinic_care);

    List<P_Hospital_Clinic_Care> getP_Hospital_Clinic_Care();

    P_Hospital_Clinic_Care getP_Hospital_Clinic_CareById(Long id);
}
