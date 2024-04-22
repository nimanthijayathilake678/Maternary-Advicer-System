package group13.MaternaryAdvicerSystem.Service.Login;


import group13.MaternaryAdvicerSystem.Model.Domain.PasswordResetToken;
import group13.MaternaryAdvicerSystem.Model.Domain.User;
import group13.MaternaryAdvicerSystem.Repository.Login.PasswordResetTokenRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PasswordResetTokenService {
    private final PasswordResetTokenRepository passwordResetTokenRepository;
    public void createPasswordResetTokenForUser(User user,String passwordToken){

        PasswordResetToken passwordResetToken=new PasswordResetToken(passwordToken,user);

        passwordResetTokenRepository.save(passwordResetToken);
    }
    public String validatePasswordResetToken(String theToken){
        PasswordResetToken token = passwordResetTokenRepository.findByToken(theToken);
        if(token == null){
            return "Invalid verification token";
        }
        User user = token.getUser();
        Calendar calendar = Calendar.getInstance();
        if ((token.getExpirationTime().getTime()-calendar.getTime().getTime())<= 0){
            return "link already expired,resend Link";
        }

        return "valid";
    }

    public Optional<User> findUserByPasswordToken(String passwordResetToken) {
        return Optional.ofNullable(passwordResetTokenRepository.findByToken(passwordResetToken).getUser());

    }

    public void findUserByPasswordTokenToDelete(String passwordResetToken) {
        PasswordResetToken token= passwordResetTokenRepository.findByToken(passwordResetToken);
        passwordResetTokenRepository.delete(token);

    }

}
