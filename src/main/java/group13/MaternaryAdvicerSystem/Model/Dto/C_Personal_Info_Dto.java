package group13.MaternaryAdvicerSystem.Model.Dto;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Eligible_Family_Account;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class C_Personal_Info_Dto {

    private Long c_personal_info_id;



    private String gender;


    private LocalDate dob;


    private String educationalLevel;


    private String occupation;


    private LocalDate marriedDate;


    private C_Eligible_Family_Account couple_id;
}
