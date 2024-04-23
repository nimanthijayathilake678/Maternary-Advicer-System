package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.M_Clinic_Date_Schedule;
import group13.MaternaryAdvicerSystem.Repository.Login.M_Clinic_Date_Schedule_Repository;
import group13.MaternaryAdvicerSystem.exception.M_Clinic_Date_ScheduleNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class M_Clinic_Date_Schedule_Service implements IM_Clinic_Date_Schedule_Service{

    //@Autowired
   // private M_Clinic_Date_Schedule_Repository m_clinic_date_schedule_repository;

    private final M_Clinic_Date_Schedule_Repository mClinicDateScheduleRepository ;

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


    /*
    @Override
    public void addClinicDate(M_Clinic_Data_Schedule_Dto clinicdate){
        M_Clinic_Date_Schedule m_clinic_date_schedule = new M_Clinic_Date_Schedule();
        m_clinic_date_schedule.setArea(clinicdate.getArea());
        m_clinic_date_schedule.setDescription(clinicdate.getDescription());
        m_clinic_date_schedule.setDate(clinicdate.getDate());
        m_clinic_date_schedule.setStarttime(clinicdate.getStartTime());

        m_clinic_date_schedule_repository.save(m_clinic_date_schedule);
    }


    @Override
    public List<M_Clinic_Data_Schedule_Dto> getClinicDate(){
        List<M_Clinic_Date_Schedule> mClinicDateSchedules = m_clinic_date_schedule_repository.findAll();
        List<M_Clinic_Data_Schedule_Dto> saveclinicdateDto = new ArrayList<>();
       // List<B_Immunization_Referels> B_Basic_Info=null;

        if(mClinicDateSchedules.isEmpty()){
            mClinicDateSchedules = m_clinic_date_schedule_repository.findAll();
        }

        for (M_Clinic_Date_Schedule saveclinicdate : mClinicDateSchedules){
            M_Clinic_Data_Schedule_Dto mClinicDataScheduleDto=new M_Clinic_Data_Schedule_Dto();
            mClinicDataScheduleDto.setArea(saveclinicdate.getArea());
            mClinicDataScheduleDto.setDescription(saveclinicdate.getDescription());
            mClinicDataScheduleDto.setDate(saveclinicdate.getDate());
            mClinicDataScheduleDto.setStartTime(saveclinicdate.getStarttime());


            saveclinicdateDto.add(mClinicDataScheduleDto);
        }
        return  saveclinicdateDto;

    }
*/
}
