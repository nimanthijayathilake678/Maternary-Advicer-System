package group13.MaternaryAdvicerSystem.Controller;

import group13.MaternaryAdvicerSystem.Model.Domain.User;
import group13.MaternaryAdvicerSystem.Model.Dto.JwtRequest;
import group13.MaternaryAdvicerSystem.Model.Dto.JwtResponse;
import group13.MaternaryAdvicerSystem.Model.Dto.LoginDto;
import group13.MaternaryAdvicerSystem.Service.Login.JwtService;
import group13.MaternaryAdvicerSystem.Service.Login.LoginService;
import group13.MaternaryAdvicerSystem.Service.Login.RegistrationService;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
public class LoginController {
    @Autowired
    private JwtService jwtService;

    @Autowired
    private RegistrationService registrationService;

    @PostMapping("/authenticate")
    public JwtResponse createJwtToken(@RequestBody JwtRequest jwtRequest) throws Exception{
        return jwtService.CreateJwtToken(jwtRequest);
    }

    @PostMapping("/registerNewUser")
    public String RegisterUser(){
        return "Correct";
    }
    @PostConstruct
    public void initAdmin(){
        registrationService.initUser();
    }
}
