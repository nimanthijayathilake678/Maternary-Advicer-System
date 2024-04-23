package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.*;
import group13.MaternaryAdvicerSystem.Model.Dto.B_Basic_Info_Dto;
import group13.MaternaryAdvicerSystem.Model.Dto.Save_Immunization_Dto;
import group13.MaternaryAdvicerSystem.Model.Dto.Save_Immunization_Referels_Dto;
import group13.MaternaryAdvicerSystem.Repository.Login.B_Basic_Info_Repository;
import group13.MaternaryAdvicerSystem.Repository.Login.C_Basic_Info_Repository;
import group13.MaternaryAdvicerSystem.Repository.Login.P_Basic_Info_Repository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class B_Basic_Info_Service_Impl implements B_Basic_Info_Service{
    @Autowired
    private B_Basic_Info_Repository b_basic_info_repository;
    @Autowired
    private P_Basic_Info_Repository p_basic_info_repository;
    @Autowired
    private C_Basic_Info_Repository c_basic_info_repository;
    public void savebaby(B_Basic_Info_Dto baby){
        B_Basic_Info b_basic_info = new B_Basic_Info();
        b_basic_info.setB_Reg_Num(baby.getB_Reg_Num());
        b_basic_info.setB_Reg_Date(baby.getB_Reg_Date());
        b_basic_info.setB_MOH_Division(baby.getB_MOH_Division());
        b_basic_info.setB_FSHO_Division(baby.getB_FSHO_Division());
        b_basic_info.setB_Name(baby.getB_Name());
        b_basic_info.setB_Mother_Age(baby.getB_Mother_Age());

        Optional<P_Basic_Info> pBasicInfo;
        pBasicInfo = p_basic_info_repository.findById(baby.getPregnancy_id());
        pBasicInfo.ifPresent(b_basic_info::setPregnancy_id);
//        if(pBasicInfo.isPresent()){
//            b_basic_info.setPregnancy_id(pBasicInfo.get());
//        }
        Optional<C_Basic_Info> cBasicInfo;
        cBasicInfo = c_basic_info_repository.findById(baby.getCouple_id());
        cBasicInfo.ifPresent(b_basic_info::setCouple_id);

        b_basic_info_repository.save(b_basic_info);
    }


    @Override
    public List<B_Basic_Info_Dto> getBabyDetails(String babyNum) {
        Optional <B_Basic_Info> b_basic_info = b_basic_info_repository.findById(babyNum);
        List<B_Basic_Info_Dto> savebasicinfoDto = new ArrayList<>();
        if (b_basic_info.isPresent()){
            B_Basic_Info_Dto basic_info_dto=new B_Basic_Info_Dto();
            basic_info_dto.setB_MOH_Division(b_basic_info.get().getB_MOH_Division());
            basic_info_dto.setB_Name(b_basic_info.get().getB_Name());
            basic_info_dto.setB_Reg_Date(b_basic_info.get().getB_Reg_Date());
            basic_info_dto.setB_Mother_Age(b_basic_info.get().getB_Mother_Age());
            basic_info_dto.setB_Reg_Num(b_basic_info.get().getB_Reg_Num());
            basic_info_dto.setB_FSHO_Division(b_basic_info.get().getB_FSHO_Division());
            basic_info_dto.setCouple_id(b_basic_info.get().getCouple_id().getC_Reg_Num());
            basic_info_dto.setPregnancy_id(b_basic_info.get().getPregnancy_id().getP_Reg_Num());
            savebasicinfoDto.add(basic_info_dto);
            return savebasicinfoDto;
        }else {
            throw new RuntimeException();
        }
    }

    @Override
    public List<B_Basic_Info_Dto> getBabyDetailsVog(){
         List<B_Basic_Info> b_basic_info_vog = b_basic_info_repository.findAll();
         List<B_Basic_Info_Dto> savebasicinfoDto = new ArrayList<>();
        List<B_Immunization_Referels> B_Basic_Info=null;

        if(b_basic_info_vog.isEmpty()){
            b_basic_info_vog = b_basic_info_repository.findAll();
        }
        assert B_Basic_Info!=null;
        for (B_Basic_Info savebasicinfovog : b_basic_info_vog){
            B_Basic_Info_Dto basic_info_dto=new B_Basic_Info_Dto();
            basic_info_dto.setB_MOH_Division(savebasicinfovog.getB_MOH_Division());
            basic_info_dto.setB_Name(savebasicinfovog.getB_Name());
            basic_info_dto.setB_Reg_Date(savebasicinfovog.getB_Reg_Date());
            basic_info_dto.setB_Mother_Age(savebasicinfovog.getB_Mother_Age());
            basic_info_dto.setB_Reg_Num(savebasicinfovog.getB_Reg_Num());
            basic_info_dto.setB_FSHO_Division(savebasicinfovog.getB_FSHO_Division());
            basic_info_dto.setCouple_id(savebasicinfovog.getCouple_id().getC_Reg_Num());
            basic_info_dto.setPregnancy_id(savebasicinfovog.getPregnancy_id().getP_Reg_Num());

            savebasicinfoDto.add(basic_info_dto);
        }
        return  savebasicinfoDto;

    }

    @Override
    public List<B_Basic_Info_Dto> getBabyDetailsByCoupleNum(String coupleNum) {

        Optional<C_Basic_Info> c_basic_info=c_basic_info_repository.findById(coupleNum);
        C_Basic_Info couple_id = null;
        if(c_basic_info.isPresent()){
            couple_id = c_basic_info.get();
        }

        assert couple_id != null;
        List<B_Basic_Info> b_basic_info = couple_id.getBabies();
        List<B_Basic_Info_Dto> savebasicinfoDto = new ArrayList<>();

        assert b_basic_info!=null;
        for(B_Basic_Info basicInfo: b_basic_info){
            B_Basic_Info_Dto basic_info_dto=new B_Basic_Info_Dto();
            basic_info_dto.setB_MOH_Division(basicInfo.getB_MOH_Division());
            basic_info_dto.setB_Name(basicInfo.getB_Name());
            basic_info_dto.setB_Reg_Date(basicInfo.getB_Reg_Date());
            basic_info_dto.setB_Mother_Age(basicInfo.getB_Mother_Age());
            basic_info_dto.setB_Reg_Num(basicInfo.getB_Reg_Num());
            basic_info_dto.setB_FSHO_Division(basicInfo.getB_FSHO_Division());
            basic_info_dto.setCouple_id(basicInfo.getCouple_id().getC_Reg_Num());
            basic_info_dto.setPregnancy_id(basicInfo.getPregnancy_id().getP_Reg_Num());

            savebasicinfoDto.add(basic_info_dto);
        }
        return savebasicinfoDto;
    }
//    @Override
//    public List<B_Basic_Info_Dto> getBabyDetailsByMidwife(String fsho){
//        Optional <B_Basic_Info> b_basic_info = b_basic_info_repository.findById(fsho);
//        List<B_Basic_Info_Dto> savebasicinfoDto = new ArrayList<>();
//        if (b_basic_info.isPresent()){
//            B_Basic_Info_Dto basic_info_dto=new B_Basic_Info_Dto();
//            basic_info_dto.setB_MOH_Division(b_basic_info.get().getB_MOH_Division());
//            basic_info_dto.setB_Name(b_basic_info.get().getB_Name());
//            basic_info_dto.setB_Reg_Date(b_basic_info.get().getB_Reg_Date());
//            basic_info_dto.setB_Mother_Age(b_basic_info.get().getB_Mother_Age());
//            basic_info_dto.setB_Reg_Num(b_basic_info.get().getB_Reg_Num());
//            basic_info_dto.setB_FSHO_Division(b_basic_info.get().getB_FSHO_Division());
//            basic_info_dto.setCouple_id(b_basic_info.get().getCouple_id().getC_Reg_Num());
//            basic_info_dto.setPregnancy_id(b_basic_info.get().getPregnancy_id().getP_Reg_Num());
//            savebasicinfoDto.add(basic_info_dto);
//            return savebasicinfoDto;
//        }else {
//            throw new RuntimeException();
//        }
//    }




}
