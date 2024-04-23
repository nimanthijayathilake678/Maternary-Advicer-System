package group13.MaternaryAdvicerSystem.Model.Dto;
import lombok.Data;

@Data
public class PasswordResetRequestDto {

    private String email;

    private String newPassword;

    private String confirmPassword;

    private String otp;
}
