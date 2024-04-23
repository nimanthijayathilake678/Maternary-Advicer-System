package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.B_Nutritions;
import group13.MaternaryAdvicerSystem.Model.Dto.Save_BabyGrowth_Dto;

import java.util.List;
import group13.MaternaryAdvicerSystem.Model.Dto.Save_BabyGrowth_Dto;
import group13.MaternaryAdvicerSystem.Model.Domain.B_Basic_Info;
import group13.MaternaryAdvicerSystem.Model.Domain.B_Growth;
import group13.MaternaryAdvicerSystem.Model.Dto.Save_BabyNutrients_Dto;
import group13.MaternaryAdvicerSystem.Repository.Login.B_Basic_Info_Repository;
import group13.MaternaryAdvicerSystem.Repository.Login.B_Growth_Repository;
import group13.MaternaryAdvicerSystem.Repository.Login.B_Nutritions_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class B_Growth_Service_Impl implements B_Growth_Service{
    @Autowired
    private B_Basic_Info_Repository b_basic_info_repository;
    @Autowired
    private B_Growth_Repository b_growth_repository;
    @Override
    public void saveBabyGrowth(Save_BabyGrowth_Dto babyGrowth){

        B_Growth b_growth=new B_Growth();
        Optional<B_Basic_Info> basicInfo;
        basicInfo=b_basic_info_repository.findById(babyGrowth.getBabynum());

        if( basicInfo.isPresent()){
            b_growth.setBabyNum(basicInfo.get());
        }
        b_growth.setB_Weight(babyGrowth.getB_Weight());
        b_growth.setB_Age_For_Weight_Date(babyGrowth.getB_Age_For_Weight_Date());
        b_growth.setB_Weight(babyGrowth.getB_Weight());
        b_growth.setB_Weight_Date(babyGrowth.getB_Weight_Date());
        b_growth_repository.save(b_growth);

    }
    @Override
    public List<Save_BabyGrowth_Dto> getBabyGrowth(String babyNum){
        Optional<B_Basic_Info> b_basic_info=b_basic_info_repository.findById(babyNum);

        List<B_Growth> b_growths=null;

        List<Save_BabyGrowth_Dto> saveBabyGrowthDtos=new ArrayList<>();

        if(b_basic_info.isPresent()){

            b_growths=b_growth_repository.findByBabyNum(b_basic_info.get());
        }


        assert b_growths!=null;
        for(B_Growth growth :b_growths){
            Save_BabyGrowth_Dto saveBabyGrowthDto=new Save_BabyGrowth_Dto();
            saveBabyGrowthDto.setB_Weight(growth.getB_Weight());
            saveBabyGrowthDto.setBabynum(growth.getBabyNum().getB_Reg_Num());
            saveBabyGrowthDto.setB_Weight_Date(growth.getB_Weight_Date());
            saveBabyGrowthDto.setB_Age_For_Weight_Date(growth.getB_Age_For_Weight_Date());
            saveBabyGrowthDtos.add(saveBabyGrowthDto);
        }

        return saveBabyGrowthDtos;
    }
}
