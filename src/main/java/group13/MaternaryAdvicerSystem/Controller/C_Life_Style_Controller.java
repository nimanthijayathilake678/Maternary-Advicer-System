package group13.MaternaryAdvicerSystem.Controller;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Family_Nutrition;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Life_Style;
import group13.MaternaryAdvicerSystem.Service.Login.C_Family_Nutrition_Service;
import group13.MaternaryAdvicerSystem.Service.Login.C_Life_Style_Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lifeStyle")
@CrossOrigin
public class C_Life_Style_Controller {
    private final C_Life_Style_Service c_life_style_service;

    public C_Life_Style_Controller(C_Life_Style_Service c_life_style_service) {
        this.c_life_style_service = c_life_style_service;
    }

    @PostMapping
    public String saveLifeStyleInfo(@RequestBody C_Life_Style lifeStyle){
        c_life_style_service.saveLifeStyleDetails(lifeStyle);
        return "Add a life style details";
    }

    @GetMapping
    public List<C_Life_Style> getAllLifeStyleInfos(){
        return c_life_style_service.getAllCoupleLifeStyleDetails();
    }

    @GetMapping("/{id}")
    public C_Life_Style getLifeStyleInfoById(@PathVariable Long id){
        return  c_life_style_service.getLifeStyleDetailsById(id);
    }

    @PutMapping("/{id}")
    public String updateLifeStyleInfo(@RequestBody C_Life_Style updateLifeStyleInfo, @PathVariable Long id){
        c_life_style_service.updateLifeStyleDetails(updateLifeStyleInfo,id);
        return "Update life style details successfully";
    }

}
