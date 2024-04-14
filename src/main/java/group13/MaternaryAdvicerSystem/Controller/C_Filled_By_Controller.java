package group13.MaternaryAdvicerSystem.Controller;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Family_Nutrition;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Filled_By_Midwife;
import group13.MaternaryAdvicerSystem.Service.Login.C_Family_Nutrition_Service;
import group13.MaternaryAdvicerSystem.Service.Login.C_Filled_By_Midwife_Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/filledByMidwife")
@CrossOrigin
public class C_Filled_By_Controller {
    private final C_Filled_By_Midwife_Service c_filled_by_midwife_service;

    public C_Filled_By_Controller(C_Filled_By_Midwife_Service c_filled_by_midwife_service) {
        this.c_filled_by_midwife_service = c_filled_by_midwife_service;
    }

    @PostMapping
    public String saveFilledByMidwifeInfo(@RequestBody C_Filled_By_Midwife cFilledByMidwife){
        c_filled_by_midwife_service.saveFilledByMidwifeDetails(cFilledByMidwife);
        return "Save filled by midwife details";
    }

    @GetMapping
    public List<C_Filled_By_Midwife> getAllFilledByMidwifeInfo(){
        return c_filled_by_midwife_service.getAllFilledByMidwifeDetails();
    }

    @GetMapping("/{id}")
    public C_Filled_By_Midwife getFilledByMidwifeInfoById(@PathVariable Long id){
        return  c_filled_by_midwife_service.getFilledByMidwifeDetailsById(id);
    }

    @PutMapping("/{id}")
    public String updateFilledByMidwifeInfoInfos(@RequestBody C_Filled_By_Midwife updateFilledByMidwifeDetail, @PathVariable Long id){
        c_filled_by_midwife_service.updateFilledByMidwifeDetails(updateFilledByMidwifeDetail,id);
        return "Update filled by midwife details successfully";
    }
}
