package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.M_Clinic_Date_Schedule;
import group13.MaternaryAdvicerSystem.Repository.Login.M_Clinic_Date_Schedule_Repository;
import group13.MaternaryAdvicerSystem.exception.M_Clinic_Date_ScheduleNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class M_Clinic_Date_Schedule_Service implements IM_Clinic_Date_Schedule_Service{
    private final M_Clinic_Date_Schedule_Repository mClinicDateScheduleRepository;

    @Override
    public List<M_Clinic_Date_Schedule> getClinicDate(){
        return mClinicDateScheduleRepository.findAll();
    }

    @Override
    public M_Clinic_Date_Schedule addClinicDate(M_Clinic_Date_Schedule m_clinic_date_schedule){
        return mClinicDateScheduleRepository.save(m_clinic_date_schedule);
    }

    @Override
    public void deleteClinicDate(Long id){
        if(!mClinicDateScheduleRepository.existsById(id)){
            throw new M_Clinic_Date_ScheduleNotFoundException("Sorry,Clinic Date Not Found");
        }
        mClinicDateScheduleRepository.deleteById(id);
    }



}
