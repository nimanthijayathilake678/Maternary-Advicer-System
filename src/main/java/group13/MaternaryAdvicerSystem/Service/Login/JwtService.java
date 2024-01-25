package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Config.JwtUtil;
import group13.MaternaryAdvicerSystem.Model.Domain.User;
import group13.MaternaryAdvicerSystem.Model.Dto.JwtRequest;
import group13.MaternaryAdvicerSystem.Model.Dto.JwtResponse;
import group13.MaternaryAdvicerSystem.Repository.Login.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Collection;
import java.util.Collections;

@Service
public class JwtService  implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JwtUtil jwtUtil;
    @Autowired
    private AuthenticationManager authenticationManager;

    public JwtResponse CreateJwtToken(JwtRequest jwtRequest) throws Exception{
        String username = jwtRequest.getUsername();
        String password = jwtRequest.getPassword();
        authenticate(username, password);

        final UserDetails userDetails =  loadUserByUsername(username);

        String newGeneratedToken = jwtUtil.generateToken(userDetails);

        User user = userRepository.findByUsername(username);
        return new JwtResponse(user, newGeneratedToken);


    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if (user != null) {
            return new org.springframework.security.core.userdetails.User(
                    user.getUsername(),
                    user.getPassword(),
                    getAuthority(user)
            );
        } else {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
    }


    private Collection<? extends GrantedAuthority> getAuthority(User user) {
        String roleName = String.valueOf(user.getPosition());
        if (StringUtils.hasText(roleName)) {
            // Assuming roleName is not empty or null
            return Collections.singleton(new SimpleGrantedAuthority("ROLE_" + roleName));
        } else {
            // Handle the case where user.getPosition() is null or empty
            // You might want to throw an exception or return a default role
            throw new IllegalStateException("User role not specified.");
        }
    }

    private void authenticate(String username, String password) throws Exception{
        try{
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        }catch(DisabledException e){
            throw new Exception("User is Disable");
        }catch (BadCredentialsException e){
            throw new Exception("Bad user crediencial!");
        }
    }
}
