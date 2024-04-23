package group13.MaternaryAdvicerSystem.Controller;

import group13.MaternaryAdvicerSystem.Model.Domain.P_Add_Refferal;
import group13.MaternaryAdvicerSystem.Service.Login.IP_Add_Refferal_Service;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/addRefferal")
@RequiredArgsConstructor
public class P_Add_Refferal_Controller {
    private final IP_Add_Refferal_Service ipAddRefferalService;

    @PostMapping
    public P_Add_Refferal addRefferal(@RequestBody P_Add_Refferal p_add_refferal){
        return ipAddRefferalService.addRefferal(p_add_refferal);
    }
}
