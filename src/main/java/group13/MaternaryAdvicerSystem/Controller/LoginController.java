package group13.MaternaryAdvicerSystem.Controller;

import group13.MaternaryAdvicerSystem.Model.Domain.User;
import group13.MaternaryAdvicerSystem.Model.Dto.JwtRequest;
import group13.MaternaryAdvicerSystem.Model.Dto.JwtResponse;
import group13.MaternaryAdvicerSystem.Model.Dto.LoginDto;
import group13.MaternaryAdvicerSystem.Repository.Login.UserRepository;
import group13.MaternaryAdvicerSystem.Service.Login.JwtService;
import group13.MaternaryAdvicerSystem.Service.Login.LoginService;
import group13.MaternaryAdvicerSystem.Service.Login.RegistrationService;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;
@RestController
public class LoginController {


    @Autowired
    private JwtService jwtService;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private RegistrationService registrationService;
    @Autowired
    private UserRepository userRepository;


    @PostMapping("/authenticate")
    public JwtResponse createJwtToken(@RequestBody JwtRequest jwtRequest) throws Exception{
        Authentication authenticate = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(jwtRequest.getUsername(), jwtRequest.getPassword()));
        if(authenticate.isAuthenticated()){
            System.out.println("Here");
            String token =  jwtService.generateToken(jwtRequest.getUsername());
            User user =  userRepository.findByUsername(jwtRequest.getUsername());
            return new JwtResponse(user, token);
        }else {
            throw new UsernameNotFoundException("Invalid user request");
        }
    }

    @PostMapping("/registerNewUser")
    public String RegisterUser(){
        return "Correct";
    }
    @PostConstruct
    public void initAdmin(){
        registrationService.initUser();
    }

    @GetMapping("/send")
    public String Send(){
        return "Correct";
    }


}
