package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.B_Basic_Info;
import group13.MaternaryAdvicerSystem.Model.Domain.B_Immunization;
import group13.MaternaryAdvicerSystem.Model.Dto.Save_Immunization_Dto;
import group13.MaternaryAdvicerSystem.Repository.Login.B_Basic_Info_Repository;
import group13.MaternaryAdvicerSystem.Repository.Login.B_Immunization_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class B_Immunization_Service_Impl implements B_Immunization_Service{

    @Autowired
    private B_Basic_Info_Repository b_basic_info_repository;
    @Autowired
    private B_Immunization_Repository b_immunization_repository;
    @Override
    public void saveBabyImmune(Save_Immunization_Dto babyImmune){
        B_Immunization b_immunization=new B_Immunization();
        Optional<B_Basic_Info> basicInfo;
        basicInfo = b_basic_info_repository.findById(babyImmune.getBabyNum());

        if( basicInfo.isPresent()){
            b_immunization.setBabyNum(basicInfo.get());
        }

        b_immunization.setB_Immunization_Name(babyImmune.getVaccineName());
        b_immunization.setB_Age_For_Vaccine_Date(babyImmune.getAgeForVaccine());
        b_immunization.setB_Vaccine_Date(babyImmune.getVaccineDate());
        b_immunization.setB_Batch_No(babyImmune.getBatchNo());
        b_immunization.setB_adverse_Effects(babyImmune.getAdverseEffects());

        b_immunization_repository.save(b_immunization);

    }



    @Override
    public List<Save_Immunization_Dto> getBabyImmune(String babyNum){
        Optional<B_Basic_Info> b_basic_info = b_basic_info_repository.findById(babyNum);

        List<B_Immunization> b_immunizations = null;
        List<Save_Immunization_Dto> saveImmunizationDtos = new ArrayList<>();
        if(b_basic_info.isPresent()){
            b_immunizations = b_immunization_repository.findByBabyNum(b_basic_info.get());
        }
        assert b_immunizations != null;
            for (B_Immunization immunization : b_immunizations) {
                Save_Immunization_Dto saveImmunizationDto = new Save_Immunization_Dto();
                saveImmunizationDto.setBabyNum(immunization.getBabyNum().getB_Reg_Num());
                saveImmunizationDto.setBatchNo(immunization.getB_Batch_No());
                saveImmunizationDto.setVaccineName(immunization.getB_Immunization_Name());
                saveImmunizationDto.setAdverseEffects(immunization.getB_adverse_Effects());
                saveImmunizationDto.setVaccineDate(immunization.getB_Vaccine_Date());

                saveImmunizationDtos.add(saveImmunizationDto);

            }
        return saveImmunizationDtos;
    }



    }




