package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.P_Basic_Info;
import group13.MaternaryAdvicerSystem.Repository.Login.P_Basic_Info_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class P_Basic_Info_Service_Impl implements P_Basic_Info_Service{
    @Autowired
    P_Basic_Info_Repository p_basic_info_repository;
    @Override
    public void savepregnancy(P_Basic_Info pregnancy){
        p_basic_info_repository.save(pregnancy);
        System.out.println("Successfully Added new family details");
    }
//
//    @Override
//    public List<P_Basic_Info> getAllPregBasicInfo(){
//        return p_basic_info_repository.findAll();
//    }
//
//    @Override
//    public P_Basic_Info getPregBasicInfoById(String P_Reg_Num){
//        return p_basic_info_repository.findById(P_Reg_Num).orElse(null);
//    }
//
//    @Override
//    public boolean updatePregBasicInfo(P_Basic_Info updateBasicDetails,String P_Reg_Num){
//        Optional<P_Basic_Info> p_basic_info_optional = p_basic_info_repository.findById(P_Reg_Num);
//        if(p_basic_info_optional.isPresent()){
//            P_Basic_Info p_basic_info_to_update = p_basic_info_optional.get();
//
//            p_basic_info_to_update.setP_Reg_Num(updateBasicDetails.getP_Reg_Num());
//            p_basic_info_to_update.setP_Reg_Location(updateBasicDetails.getP_Reg_Location());
//            p_basic_info_to_update.setP_Reg_Date(updateBasicDetails.getP_Reg_Date());
//            p_basic_info_to_update.setCouple_id(updateBasicDetails.getCouple_id());
//            p_basic_info_to_update.setC_Reg_Date(updateBasicDetails.getC_Reg_Date());
//            p_basic_info_to_update.setP_Grama_Division(updateBasicDetails.getP_Grama_Division());
//            p_basic_info_to_update.setP_MOH_Division(updateBasicDetails.getP_MOH_Division());
//            p_basic_info_to_update.setP_PHM_Division(updateBasicDetails.getP_PHM_Division());
//            p_basic_info_to_update.setP_Hospital_Clinic_Name(updateBasicDetails.getP_Hospital_Clinic_Name());
//            p_basic_info_to_update.setP_Consultant_Name(updateBasicDetails.getP_Consultant_Name());
//            p_basic_info_to_update.setP_Field_Clinic_Name(updateBasicDetails.getP_Field_Clinic_Name());
//            p_basic_info_to_update.setP_Mother_Name(updateBasicDetails.getP_Mother_Name());
//            p_basic_info_to_update.setP_Father_Name(updateBasicDetails.getP_Father_Name());
//            p_basic_info_to_update.setP_Telephone(updateBasicDetails.getP_Telephone());
//            p_basic_info_to_update.setP_Address(updateBasicDetails.getP_Address());
//
//            p_basic_info_repository.save(p_basic_info_to_update);
//            return true;
//        }
//        return false;
//    }

}
