package group13.MaternaryAdvicerSystem.Controller;
import group13.MaternaryAdvicerSystem.Model.Domain.User;
import group13.MaternaryAdvicerSystem.Model.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import group13.MaternaryAdvicerSystem.Model.Dto.UserRegisterDTO;
import group13.MaternaryAdvicerSystem.Service.Login.U_Basic_Info_Service;
import java.util.List;

@RestController
@RequestMapping("/newuser")
public class U_Basic_Info_Controller {
    @Autowired
    private final U_Basic_Info_Service u_basic_info_service;
    @Autowired
    public U_Basic_Info_Controller(U_Basic_Info_Service u_basic_info_service){
        this.u_basic_info_service = u_basic_info_service;
    }

    @PostMapping("/add")
    public String adduser(@RequestBody UserRegisterDTO user){
        u_basic_info_service.saveuser(user);
        return "New user is added";
    }

    @GetMapping
    public List<User> getAllUserInfo(){
        return u_basic_info_service.getAllUserInformation();
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserInformationById(@PathVariable Long id){
        return new ResponseEntity<>(u_basic_info_service.getUserInfoById(id), HttpStatus.OK);
    }


    @PutMapping("/{id}")
    public String updateUserDetails(@RequestBody User updateUserDetail, @PathVariable Long id){
        u_basic_info_service.updateUserInfo( updateUserDetail,id);
        return "Update user details successfully";
    }

}
