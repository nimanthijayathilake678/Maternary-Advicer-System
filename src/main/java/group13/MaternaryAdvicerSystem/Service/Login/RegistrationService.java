package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.User;
import group13.MaternaryAdvicerSystem.Model.UserRole;
import group13.MaternaryAdvicerSystem.Repository.Login.UserRepository;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class RegistrationService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public void registerUser(User userdto) {
        User user = new User();
        user.setFirstName(userdto.getFirstName());
        user.setLastName(userdto.getLastName());
        user.setFullName(userdto.getFullName());
        user.setUsername(userdto.getUsername());
        user.setNic(userdto.getNic());
        user.setPassword(getEncodedPassword(userdto.getPassword()));
        user.setPosition(userdto.getPosition());

        userRepository.save(user);
    }
    public void initUser(){
        User user = new User();
        user.setFullName("M M T N Jayathilake");
        user.setFirstName("Nimanthi");
        user.setLastName("Jayathilake");
        user.setPosition(UserRole.MOH);
        user.setNic("995922088");
        user.setUsername("Nimanthi123");
        user.setPassword(getEncodedPassword("Nimanthi@123"));

        userRepository.save(user);

    }
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    public String getEncodedPassword(String password) {
        return passwordEncoder.encode(password);
    }
}
