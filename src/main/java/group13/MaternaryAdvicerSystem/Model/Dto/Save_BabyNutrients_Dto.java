package group13.MaternaryAdvicerSystem.Model.Dto;

import group13.MaternaryAdvicerSystem.Model.Domain.B_Basic_Info;
import jakarta.persistence.Column;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Save_BabyNutrients_Dto {
    private String babynum;
    private Date B_Nutrient_Date;
    private String B_Nutrient_Batch_No;
    private int B_Age_For_Nutrient_Date;
    private String B_Nutrient_Name;
}
