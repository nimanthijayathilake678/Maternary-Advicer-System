package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.B_NewBorn_Health;
import group13.MaternaryAdvicerSystem.Model.Dto.Save_BabyNutrients_Dto;
import group13.MaternaryAdvicerSystem.Model.Dto.Save_Immunization_Dto;
import group13.MaternaryAdvicerSystem.Model.Domain.B_Basic_Info;
import group13.MaternaryAdvicerSystem.Model.Domain.B_Nutritions;
import group13.MaternaryAdvicerSystem.Model.Dto.Save_BabyNutrients_Dto;
import group13.MaternaryAdvicerSystem.Model.Dto.Save_NewBorn_Helath_Dto;
import group13.MaternaryAdvicerSystem.Repository.Login.B_Basic_Info_Repository;
import group13.MaternaryAdvicerSystem.Repository.Login.B_NewBorn_Health_Repository;
import group13.MaternaryAdvicerSystem.Repository.Login.B_Nutritions_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service

public class B_Nutritions_Service_Impl implements B_Nutritions_Service{
    @Autowired
    private B_Basic_Info_Repository b_basic_info_repository;
    @Autowired
    private B_Nutritions_Repository b_nutritions_repository;
    @Override
    public void saveBabyNutritions(Save_BabyNutrients_Dto babyNutritions){
            B_Nutritions b_nutritions=new B_Nutritions();
            Optional<B_Basic_Info> basicInfo;
            basicInfo=b_basic_info_repository.findById(babyNutritions.getBabynum());

            if( basicInfo.isPresent()){
                b_nutritions.setBabyNum(basicInfo.get());
            }
            b_nutritions.setB_Nutrient_Date(babyNutritions.getB_Nutrient_Date());
            b_nutritions.setB_Nutrient_Batch_No(babyNutritions.getB_Nutrient_Batch_No());
            b_nutritions.setB_Nutrient_Name(babyNutritions.getB_Nutrient_Name());
            b_nutritions.setB_Age_For_Nutrient_Date(b_nutritions.getB_Age_For_Nutrient_Date());
            b_nutritions_repository.save(b_nutritions);
    }
    @Override
    public List<Save_BabyNutrients_Dto> getBabyNutritions(String babyNum){
        return null;
    }
}
