package group13.MaternaryAdvicerSystem.Controller;

import group13.MaternaryAdvicerSystem.Model.Domain.M_Clinic_Date_Schedule;
import group13.MaternaryAdvicerSystem.Service.Login.IM_Clinic_Date_Schedule_Service;
import group13.MaternaryAdvicerSystem.Service.Login.M_Clinic_Date_Schedule_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/clinicDate")
//@RequiredArgsConstructor
public class M_Clinic_Date_Schedule_Controller {

    private final IM_Clinic_Date_Schedule_Service mClinicDateScheduleService;

    public M_Clinic_Date_Schedule_Controller(IM_Clinic_Date_Schedule_Service mClinicDateScheduleService) {
        this.mClinicDateScheduleService = mClinicDateScheduleService;
    }

    @GetMapping
    public ResponseEntity<List<M_Clinic_Date_Schedule>> getClinicDate(){
        return new ResponseEntity<>(mClinicDateScheduleService.getClinicDate(), HttpStatus.FOUND);
    }
    @PostMapping
    public M_Clinic_Date_Schedule addClinicDate(@RequestBody M_Clinic_Date_Schedule m_clinic_date_schedule){
        return mClinicDateScheduleService.addClinicDate(m_clinic_date_schedule);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteClinicDate(@PathVariable Long id){
        mClinicDateScheduleService.deleteClinicDate(id);
    }

    /*
    private final IM_Clinic_Date_Schedule_Service imClinicDateScheduleService;
    @Autowired
    public M_Clinic_Date_Schedule_Controller(M_Clinic_Date_Schedule_Service m_clinic_date_schedule_service){
        this.imClinicDateScheduleService = m_clinic_date_schedule_service;
    }
    @PostMapping("/add")
    public String add(@RequestBody M_Clinic_Data_Schedule_Dto clinicdate){

        imClinicDateScheduleService.addClinicDate(clinicdate);
        return "New Clinic Date is added";
    }

    @GetMapping("/getclinicdates")
    public List<M_Clinic_Data_Schedule_Dto> getClinicDate(){
        return imClinicDateScheduleService.getClinicDate();
    }
*/
}
