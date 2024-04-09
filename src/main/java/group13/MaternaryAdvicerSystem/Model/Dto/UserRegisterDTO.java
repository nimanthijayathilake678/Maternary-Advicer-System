package group13.MaternaryAdvicerSystem.Model.Dto;


import group13.MaternaryAdvicerSystem.Model.UserRole;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserRegisterDTO {
    private Long id;
    private String nicNo;
    private String fullName;
    private String firstName;
    private String lastName;
    private String contactNo;
    private String email;
    private String gender;
    private String marriedStatus;
    private UserRole position;
    private String area;
    private String username;
    private String password;
}
