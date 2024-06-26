package group13.MaternaryAdvicerSystem.Service.Login;


import group13.MaternaryAdvicerSystem.Model.Domain.B_Basic_Info;
import group13.MaternaryAdvicerSystem.Model.Domain.B_NewBorn_Health;
import group13.MaternaryAdvicerSystem.Model.Dto.Save_NewBorn_Helath_Dto;
import group13.MaternaryAdvicerSystem.Repository.Login.B_Basic_Info_Repository;
import group13.MaternaryAdvicerSystem.Repository.Login.B_NewBorn_Health_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service

public class B_NewBorn_Health_Service_Impl implements B_NewBorn_Health_Service{
    @Autowired
    private B_Basic_Info_Repository b_basic_info_repository;
    @Autowired
    private B_NewBorn_Health_Repository newBorn_health_repository;
    @Override
    public void saveNewBornHealth(Save_NewBorn_Helath_Dto newBornHealth ){
        B_NewBorn_Health b_newBorn_health=new B_NewBorn_Health();
        Optional<B_Basic_Info> basicInfo;
        basicInfo = b_basic_info_repository.findById(newBornHealth.getBabyNum());

        if( basicInfo.isPresent()){
            b_newBorn_health.setBabyNum(basicInfo.get());
        }
       b_newBorn_health.setB_Breast_Feeding(newBornHealth.getBreastFeeding());
       b_newBorn_health.setB_Feces_Color(newBornHealth.getFecesColor());
       b_newBorn_health.setB_Examine_Date(newBornHealth.getExamineDate());
       b_newBorn_health.setB_Temperature(newBornHealth.getTemperature());
       b_newBorn_health.setB_Nature_Pecan(newBornHealth.getNaturePecan());
       b_newBorn_health.setB_SkinColor(newBornHealth.getSkinColor());

       newBorn_health_repository.save(b_newBorn_health);
    }
    public List<Save_NewBorn_Helath_Dto> getNewBornHealth(String babyNum){
        Optional<B_Basic_Info> b_basic_info=b_basic_info_repository.findById(babyNum);
        List<B_NewBorn_Health> b_newBorn_health=null;
        List<Save_NewBorn_Helath_Dto> saveNewBornHelathDtos=new ArrayList<>();
        if(b_basic_info.isPresent()){
            b_newBorn_health = newBorn_health_repository.findByBabyNum(b_basic_info.get());
        }

        assert b_newBorn_health !=null;
        for(B_NewBorn_Health newBornHealth:b_newBorn_health){

            Save_NewBorn_Helath_Dto saveNewBornHelathDto=new Save_NewBorn_Helath_Dto();
            saveNewBornHelathDto.setBabyNum(newBornHealth.getBabyNum().getB_Reg_Num());
            saveNewBornHelathDto.setTemperature(newBornHealth.getB_Temperature());
            saveNewBornHelathDto.setNaturePecan(newBornHealth.getB_Nature_Pecan());
            saveNewBornHelathDto.setFecesColor(newBornHealth.getB_Feces_Color());
            saveNewBornHelathDto.setExamineDate(newBornHealth.getB_Examine_Date());
            saveNewBornHelathDto.setBreastFeeding(newBornHealth.getB_Breast_Feeding());
            saveNewBornHelathDto.setSkinColor(newBornHealth.getB_SkinColor());
            saveNewBornHelathDtos.add(saveNewBornHelathDto);

        }


        return saveNewBornHelathDtos ;

    }
}
