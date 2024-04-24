package group13.MaternaryAdvicerSystem.Model.Dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class P_Basic_Info_Dto {
    private String P_Reg_Num;
    private String P_Reg_Location;
    private LocalDate P_Reg_Date;
    private String couple_id;
    private LocalDate C_Reg_Date;
    private String P_Grama_Division;
    private String P_MOH_Division;
    private String P_PHM_Division;
    private String P_Hospital_Clinic_Name;
    private String P_Consultant_Name;
    private String P_Field_Clinic_Name;
    private String P_Mother_Name;
    private String P_Father_Name;
    private String P_Telephone;
    private String P_Address;


}
