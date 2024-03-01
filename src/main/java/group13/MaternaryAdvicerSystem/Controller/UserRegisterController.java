package group13.MaternaryAdvicerSystem.Controller;

import group13.MaternaryAdvicerSystem.Model.Domain.User;
import group13.MaternaryAdvicerSystem.Model.Domain.UserRegister;
import group13.MaternaryAdvicerSystem.Repository.Login.UserRegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserRegisterController {
    @Autowired
    private UserRegisterRepository userRegisterRepository;

    @PostMapping("/registerUser")
    UserRegister newUserRegister(@RequestBody UserRegister newUserRegister){
        return userRegisterRepository.save(newUserRegister);
    }

    @GetMapping("/viewUsers")
    List<UserRegister> getAllUsers(){
        return userRegisterRepository.findAll();
    }


}
