package group13.MaternaryAdvicerSystem.Model.Dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class NewPwdDto {
    private String otp;

    private String newpassword;

    private String confirmpassword;
}
