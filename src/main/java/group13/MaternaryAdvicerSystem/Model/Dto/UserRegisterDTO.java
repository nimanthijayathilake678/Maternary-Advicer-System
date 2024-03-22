package group13.MaternaryAdvicerSystem.Model.Dto;


import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserRegisterDTO {
    @Id
    private String id;
    private String fullName;
    private String nicNo;
    private Date birthday;
    private String contactNo;
    private String email;
    private String gender;
    private String marriedStatus;
    private String occupation;
    private String area;
    private String username;
    private String password;
}
