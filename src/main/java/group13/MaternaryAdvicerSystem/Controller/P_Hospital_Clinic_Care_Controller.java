package group13.MaternaryAdvicerSystem.Controller;

import group13.MaternaryAdvicerSystem.Model.Domain.P_Hospital_Clinic_Care;
import group13.MaternaryAdvicerSystem.Service.Login.I_P_Hospital_Care_Service;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:3000")
@RequestMapping("/hospital_clinic_care")
@RequiredArgsConstructor
public class P_Hospital_Clinic_Care_Controller {
    private final I_P_Hospital_Care_Service pHospitalCareService;

    @GetMapping
    public ResponseEntity<List<P_Hospital_Clinic_Care>> getP_Hospital_Clinic_Care(){
        return new ResponseEntity<>(pHospitalCareService.getP_Hospital_Clinic_Care(), HttpStatus.FOUND);
    }
    @PostMapping
    public P_Hospital_Clinic_Care addP_Hospital_Clinic_Care(@RequestBody P_Hospital_Clinic_Care p_hospital_clinic_care){
        return pHospitalCareService.addP_Hospital_Clinic_Care(p_hospital_clinic_care);
    }

    @GetMapping("/{id}")
    public P_Hospital_Clinic_Care getP_Hospital_Clinic_CareById(@PathVariable Long id){
        return pHospitalCareService.getP_Hospital_Clinic_CareById(id);
    }



}
