package group13.MaternaryAdvicerSystem.Model.Dto;

import group13.MaternaryAdvicerSystem.Model.Domain.B_Basic_Info;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Save_Immunization_Dto {
    private String babyNum;
    private String B_Immunization_Name;
    private int B_Age_For_Vaccine_Date;
    private Date B_Vaccine_Date;
    private String B_Batch_No;
    private String B_adverse_Effects;
}
