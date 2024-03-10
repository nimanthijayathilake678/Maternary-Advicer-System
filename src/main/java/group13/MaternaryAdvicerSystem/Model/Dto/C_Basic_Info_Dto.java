package group13.MaternaryAdvicerSystem.Model.Dto;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class C_Basic_Info_Dto {

    private String C_Reg_Num;
    private LocalDate C_Reg_Date;
    private String C_MOH_Division;
    private String C_Mother_Name;
    private String C_Husband_Name;
    private String C_Address;
    private String C_Email;
    private String C_Telephone;
    private String C_PHM_Division;
}
