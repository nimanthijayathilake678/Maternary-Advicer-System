package group13.MaternaryAdvicerSystem.Controller;

import group13.MaternaryAdvicerSystem.Model.Domain.User;
import group13.MaternaryAdvicerSystem.Model.Domain.UserRegister;
import group13.MaternaryAdvicerSystem.Model.Dto.UserRegisterDTO;
import group13.MaternaryAdvicerSystem.Repository.Login.UserRegisterRepository;
import group13.MaternaryAdvicerSystem.Service.Login.UserRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin
public class UserRegisterController {
    @Autowired
    private UserRegisterService userRegisterService;

    @PostMapping("/saveUser")
    public UserRegisterDTO saveUserRegister(@RequestBody UserRegisterDTO userRegisterDTO){
        return userRegisterService.saveUserRegister(userRegisterDTO);
    }

    @GetMapping("/getUsers")
    public List<UserRegisterDTO> getUsers(){
        return userRegisterService.getAllUsers();
    }

    @PutMapping("/updateUser")
    public UserRegisterDTO updateUserRegister(@RequestBody UserRegisterDTO userRegisterDTO){
        return userRegisterService.updateUserRegister(userRegisterDTO);
    }

    @DeleteMapping("/deleteUser")
    public boolean deleteUserRegister(@RequestBody UserRegisterDTO userRegisterDTO){
        return userRegisterService.deleteUserRegister(userRegisterDTO);
    }

    @GetMapping("/getUserByID/{userID}")
    public UserRegisterDTO getUserByID(@PathVariable String userID){
        return userRegisterService.getUserByID(userID);
    }

    @GetMapping("/getUserByID/{userID}/{address}")
    public UserRegisterDTO getUserByIDANDADDRESS(@PathVariable String userID, @PathVariable String address){
        return userRegisterService.getUserByIDANDADDRESS(userID,address);
    }

}
