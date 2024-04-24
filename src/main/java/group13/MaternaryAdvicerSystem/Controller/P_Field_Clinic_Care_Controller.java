package group13.MaternaryAdvicerSystem.Controller;

import group13.MaternaryAdvicerSystem.Model.Domain.P_Field_Clinic_Care;
import group13.MaternaryAdvicerSystem.Service.Login.P_Field_Clinic_Care_Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fieldClinics")
@CrossOrigin
public class P_Field_Clinic_Care_Controller {
    public final P_Field_Clinic_Care_Service p_field_clinic_care_service;

    public P_Field_Clinic_Care_Controller(P_Field_Clinic_Care_Service p_field_clinic_care_service){
        this.p_field_clinic_care_service=p_field_clinic_care_service;
    }
    @PostMapping
    public String saveFieldClinicInfo(@RequestBody P_Field_Clinic_Care pFieldClinicCare){
        p_field_clinic_care_service.saveFieldClinicDetails(pFieldClinicCare);
        return "Add a field clinic details";

    }
    @GetMapping
    public List<P_Field_Clinic_Care> getAllFieldClinicInfos(){
        return p_field_clinic_care_service.getAllFieldClinicDetails();
    }
    @GetMapping("/{id}")
    public P_Field_Clinic_Care getFieldClinicInfosById(@PathVariable Long id) {
        return p_field_clinic_care_service.getFieldClinicDetailsById(id);
    }

//    @PutMapping
//    public String  updateFieldClinicInfo(@RequestBody P_Field_Clinic_Care updateFieldInfo,@PathVariable Long id){
//        p_field_clinic_care_service.updateFieldClinicDetails(updateFieldInfo, id);
//        return "Update field cliic details successfully";
//
//    }
    @PutMapping("/{id}")
    public String updateFieldClinicInfo(@RequestBody P_Field_Clinic_Care updateFieldInfo, @PathVariable Long id) {
        p_field_clinic_care_service.updateFieldClinicDetails(updateFieldInfo, id);
        return "Update field clinic details successfully";
    }


}
