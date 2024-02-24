package group13.MaternaryAdvicerSystem.Model.Dto;

import group13.MaternaryAdvicerSystem.Model.Domain.B_Basic_Info;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Basic_Info;
import group13.MaternaryAdvicerSystem.Model.Domain.P_Basic_Info;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class B_Basic_Info_Dto {

    private String B_Reg_Num;
    private LocalDate B_Reg_Date;
    private String B_MOH_Division;
    private String B_FSHO_Division;
    private String couple_id;
    private String pregnancy_id;
    private String B_Name;
    private int B_Mother_Age;
}
