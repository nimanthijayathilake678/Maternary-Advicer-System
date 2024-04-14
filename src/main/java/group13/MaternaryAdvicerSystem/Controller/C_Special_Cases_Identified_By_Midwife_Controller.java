package group13.MaternaryAdvicerSystem.Controller;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Family_Nutrition;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Special_Cases_Identified_By_Midwife;
import group13.MaternaryAdvicerSystem.Service.Login.C_Family_Nutrition_Service;
import group13.MaternaryAdvicerSystem.Service.Login.C_Special_Cases_Identified_By_Midwife_Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("/specialCase")
public class C_Special_Cases_Identified_By_Midwife_Controller {
    private final C_Special_Cases_Identified_By_Midwife_Service c_special_cases_identified_by_midwife_service;

    public C_Special_Cases_Identified_By_Midwife_Controller(C_Special_Cases_Identified_By_Midwife_Service c_special_cases_identified_by_midwife_service) {
        this.c_special_cases_identified_by_midwife_service = c_special_cases_identified_by_midwife_service;
    }

    @PostMapping
    public String saveSpecialCasesDetails(@RequestBody C_Special_Cases_Identified_By_Midwife SpecialCasesDetails){
        c_special_cases_identified_by_midwife_service.saveSpecialCasesIdentifiedByMidwifeInfo(SpecialCasesDetails);
        return "Add a special cases  details";
    }

    @GetMapping
    public List<C_Special_Cases_Identified_By_Midwife> getAllSpecialCasesDetails(){
        return c_special_cases_identified_by_midwife_service.getAllSpecialCasesIdentifiedByMidwifeInfo();
    }

    @GetMapping("/{id}")
    public C_Special_Cases_Identified_By_Midwife getSpecialCasesDetailsById(@PathVariable Long id){
        return  c_special_cases_identified_by_midwife_service.getSpecialCasesIdentifiedByMidwifeInfoById(id);
    }

    @PutMapping("/{id}")
    public String updateSpecialCasesDetails(@RequestBody C_Special_Cases_Identified_By_Midwife updateSpecialCases, @PathVariable Long id){
        c_special_cases_identified_by_midwife_service.updateSpecialCasesIdentifiedByMidwifeInfo(updateSpecialCases,id);
        return "Update special cases  details successfully";
    }
}
