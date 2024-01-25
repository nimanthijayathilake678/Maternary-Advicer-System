package group13.MaternaryAdvicerSystem.Model.Dto;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class JwtRequest {
    private String username;
    private String password;

    public JwtRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
