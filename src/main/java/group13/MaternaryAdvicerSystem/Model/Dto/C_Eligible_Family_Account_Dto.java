package group13.MaternaryAdvicerSystem.Model.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class C_Eligible_Family_Account_Dto {
    private Long registrationNo;
    private String moh;
    private String phm;
    private String wifeName;
    private String husbandName;
    private String email;
    private String telephone;
    private String address;
}
