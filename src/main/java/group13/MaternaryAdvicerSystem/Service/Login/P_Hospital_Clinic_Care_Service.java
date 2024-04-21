package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.P_Hospital_Clinic_Care;
import group13.MaternaryAdvicerSystem.Repository.Login.P_Hospital_Care_Repository;
import group13.MaternaryAdvicerSystem.exception.P_Hospital_Clinic_CareNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@RequiredArgsConstructor
public class P_Hospital_Clinic_Care_Service implements I_P_Hospital_Care_Service{
    private final P_Hospital_Care_Repository p_hospital_care_repository;

    @Override
    public List<P_Hospital_Clinic_Care> getP_Hospital_Clinic_Care(){
        return p_hospital_care_repository.findAll();
    }


    @Override
    public P_Hospital_Clinic_Care addP_Hospital_Clinic_Care(P_Hospital_Clinic_Care p_hospital_clinic_care){
        return p_hospital_care_repository.save(p_hospital_clinic_care);
    }
    @Override
    public P_Hospital_Clinic_Care getP_Hospital_Clinic_CareById(Long id){
        return p_hospital_care_repository.findById(id)
                .orElseThrow(() -> new P_Hospital_Clinic_CareNotFoundException("Sorry, no student found with the Id :" +id));
    }


}
