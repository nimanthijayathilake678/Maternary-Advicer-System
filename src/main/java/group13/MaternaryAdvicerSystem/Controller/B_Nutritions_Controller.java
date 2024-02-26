package group13.MaternaryAdvicerSystem.Controller;
import group13.MaternaryAdvicerSystem.Model.Domain.B_Nutritions;
import group13.MaternaryAdvicerSystem.Model.Dto.Save_BabyNutrients_Dto;

import group13.MaternaryAdvicerSystem.Model.Dto.Save_NewBorn_Helath_Dto;
import group13.MaternaryAdvicerSystem.Service.Login.B_NewBorn_Health_Service_Impl;
import group13.MaternaryAdvicerSystem.Service.Login.B_Nutritions_Service_Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/babyNutrients")
public class B_Nutritions_Controller {
    @Autowired
    private B_Nutritions_Service_Impl b_nutritions_service_impl;

    @PostMapping("/addnutrients")
    public String add(@RequestBody Save_BabyNutrients_Dto babyNutritions){
        b_nutritions_service_impl.saveBabyNutritions(babyNutritions);

        return "newborn nutritions record  is added";
    }
//    @PostMapping("/addnutrients")
//    public Save_BabyNutrients_Dto add(@RequestBody Save_BabyNutrients_Dto saveBabyNutrientsDto){
//        return saveBabyNutrientsDto;
//    }
}
