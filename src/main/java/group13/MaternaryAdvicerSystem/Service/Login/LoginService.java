package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.User;
import group13.MaternaryAdvicerSystem.Model.Dto.LoginDto;
import group13.MaternaryAdvicerSystem.Repository.Login.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
@Service
public class LoginService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public boolean authenticateUser(LoginDto loginDto){
        User user = userRepository.findByUsername(loginDto.getUsername());
        return passwordEncoder.matches(loginDto.getPassword(), user.getPassword());
    }
}
