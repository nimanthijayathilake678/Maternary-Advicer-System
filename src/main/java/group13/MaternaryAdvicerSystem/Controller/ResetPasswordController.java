package group13.MaternaryAdvicerSystem.Controller;


import  group13.MaternaryAdvicerSystem.Model.Domain.User;
import  group13.MaternaryAdvicerSystem.Model.Dto.NewPwdDto;
import  group13.MaternaryAdvicerSystem.Model.Dto.PasswordResetRequestDto;
import  group13.MaternaryAdvicerSystem.Service.Login.PasswordGenerateService;
import  group13.MaternaryAdvicerSystem.Service.Login.PasswordResetTokenService;
import  group13.MaternaryAdvicerSystem.Service.Login.MailService;
import group13.MaternaryAdvicerSystem.Service.Login.UserService;


import jakarta.mail.MessagingException;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.util.Optional;
import java.util.UUID;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/register")
public class ResetPasswordController {
    @Autowired
    private UserService userService;

    @Autowired
    private MailService mailService;

    @Autowired
    private PasswordResetTokenService passwordResetTokenService;

    @Autowired
    private PasswordGenerateService passwordGenerateService;

    @Autowired
    private NewPwdDto newPwdDto;

    @PostMapping("/password-reset-request")
    public String resetPasswordRequest(@RequestBody PasswordResetRequestDto passwordResetRequestDto,
                                       final HttpServletRequest request) throws MessagingException, UnsupportedEncodingException {
        Optional<User> user=userService.findByEmail(passwordResetRequestDto.getEmail());
        String passwordResetURL="";

        //String passwordResetToken= UUID.randomUUID().toString();
        String passwordResetToken=passwordGenerateService.passwordGenerate();

        if(user.isPresent()){

            userService.createPasswordResetTokenForUser(user.get(),passwordResetToken);
            passwordResetURL=passwordResetEmailLink(user.get(),applicationURL(request),passwordResetToken);
            return passwordResetURL;
        }else {
            userService.findUserByPasswordTokenToDelete(passwordResetToken);
            return "Enter your correct recovery email";
        }
    }

    private String passwordResetEmailLink(User user, String applicationURL, String passwordResetToken) throws MessagingException, UnsupportedEncodingException {
        String url = applicationURL+"/register/reset-password?token="+passwordResetToken;
        mailService.sendPasswordResetVerificationEmail(passwordResetToken,user);
        log.info("Click the link to reset your password :  {}", url);
        return  url;
    }

    public String applicationURL(HttpServletRequest request){
        return "http://"+request.getServerName()+":"+
                request.getServerPort()+request.getContextPath();
    }

    @PostMapping("/reset-password")
    public String resetPassword(@RequestBody NewPwdDto newPwdDto
    ){
        String passwordResetToken=newPwdDto.getOtp();
        String validatePasswordResetTokenResult=passwordResetTokenService.validatePasswordResetToken(passwordResetToken);

        if(validatePasswordResetTokenResult.equalsIgnoreCase("valid")){
            Optional<User> theUser = Optional.ofNullable(userService.findUserByPasswordToken(passwordResetToken));
            userService.findUserByPasswordTokenToDelete(passwordResetToken);
            if(theUser.isPresent()){
                userService.changePassword(theUser.get(), newPwdDto.getNewpassword());

                return "Password has reset successfully!";
            }else{
                return "Token Expired";
            }
        }



        return "Invalid Password reset token";
    }


}
