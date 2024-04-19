package group13.MaternaryAdvicerSystem.Controller;
import group13.MaternaryAdvicerSystem.Model.Dto.Save_BabyGrowth_Dto;
import group13.MaternaryAdvicerSystem.Model.Dto.Save_BabyNutrients_Dto;
import group13.MaternaryAdvicerSystem.Service.Login.B_Growth_Service_Impl;
import group13.MaternaryAdvicerSystem.Service.Login.B_Nutritions_Service_Impl;
import group13.MaternaryAdvicerSystem.Service.Login.B_Nutritions_Service_Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/babyGrowth")
public class B_Growth_Controller {

    @Autowired
    private B_Growth_Service_Impl bGrowthService;

    @PostMapping("/addgrowth")
    public String add(@RequestBody Save_BabyGrowth_Dto saveBabyGrowthDto){
        bGrowthService.saveBabyGrowth(saveBabyGrowthDto);

        return "newborn nutritions record  is added";
    }
    @GetMapping("/getgrowth/{babyNum}")
    private List<Save_BabyGrowth_Dto> getBabyGrowth(@PathVariable String babyNum){
        return bGrowthService.getBabyGrowth(babyNum);
    }
}
