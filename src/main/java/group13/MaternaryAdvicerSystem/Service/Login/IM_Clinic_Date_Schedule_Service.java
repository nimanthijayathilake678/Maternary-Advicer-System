package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.M_Clinic_Date_Schedule;

import java.util.List;

public interface IM_Clinic_Date_Schedule_Service {
    M_Clinic_Date_Schedule addClinicDate(M_Clinic_Date_Schedule m_clinic_date_schedule);

    List<M_Clinic_Date_Schedule> getClinicDate();

    void deleteClinicDate(Long id);
}
