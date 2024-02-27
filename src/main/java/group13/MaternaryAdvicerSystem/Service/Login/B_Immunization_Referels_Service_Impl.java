package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.B_Basic_Info;
import group13.MaternaryAdvicerSystem.Model.Domain.B_Immunization;
import group13.MaternaryAdvicerSystem.Model.Domain.B_Immunization_Referels;
import group13.MaternaryAdvicerSystem.Model.Dto.Save_Immunization_Referels_Dto;
import group13.MaternaryAdvicerSystem.Repository.Login.B_Basic_Info_Repository;
import group13.MaternaryAdvicerSystem.Repository.Login.B_Immunization_Referels_Repository;
import group13.MaternaryAdvicerSystem.Repository.Login.B_Immunization_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class B_Immunization_Referels_Service_Impl implements B_Immunization_Referels_Service{


    @Autowired
    private B_Basic_Info_Repository b_basic_info_repository;
    @Autowired
    private B_Immunization_Referels_Repository b_immunization_referels_repository;
    @Override
    public void saveBabyImmuneReferels(Save_Immunization_Referels_Dto babyImmuneReferels){
        B_Immunization_Referels b_immunization_referels=new B_Immunization_Referels();
        Optional<B_Basic_Info> basicInfo;
        basicInfo = b_basic_info_repository.findById(babyImmuneReferels.getBabyNum());

        if( basicInfo.isPresent()){
            b_immunization_referels.setBabyNum(basicInfo.get());
        }
        b_immunization_referels.setB_Immunization_Name(babyImmuneReferels.getB_Immunization_Name());
        b_immunization_referels.setB_Referel_Place(babyImmuneReferels.getB_Referel_Place());
        b_immunization_referels.setB_Referel_Reason(babyImmuneReferels.getB_Referel_Reason());
        b_immunization_referels_repository.save(b_immunization_referels);


    }
    @Override
    public List<Save_Immunization_Referels_Dto> getBabyImmuneReferels(String babyNum){
        Optional<B_Basic_Info> b_basic_info=b_basic_info_repository.findById(babyNum);
        List<B_Immunization_Referels> b_immunization_referels=null;
        List<Save_Immunization_Referels_Dto> saveImmunizationReferelsDtos=new ArrayList<>();
        if(b_basic_info.isPresent()){
            b_immunization_referels = b_immunization_referels_repository.findByBabyNum(b_basic_info.get());
        }

        assert b_immunization_referels !=null;
            for(B_Immunization_Referels immunizationReferels:b_immunization_referels){
                Save_Immunization_Referels_Dto saveImmunizationReferelsDto1=new Save_Immunization_Referels_Dto();

                saveImmunizationReferelsDto1.setBabyNum(immunizationReferels.getBabyNum().getB_Reg_Num());
                saveImmunizationReferelsDto1.setB_Referel_Place(immunizationReferels.getB_Referel_Place());
                saveImmunizationReferelsDto1.setB_Referel_Reason(immunizationReferels.getB_Referel_Reason());
                saveImmunizationReferelsDto1.setB_Immunization_Name(immunizationReferels.getB_Immunization_Name());

                saveImmunizationReferelsDtos.add(saveImmunizationReferelsDto1);
            }


            return saveImmunizationReferelsDtos;
    }
}
