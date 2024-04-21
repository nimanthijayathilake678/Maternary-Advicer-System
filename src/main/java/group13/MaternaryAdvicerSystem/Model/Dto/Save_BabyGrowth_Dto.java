package group13.MaternaryAdvicerSystem.Model.Dto;
import java.util.Date;

import group13.MaternaryAdvicerSystem.Model.Domain.B_Basic_Info;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Save_BabyGrowth_Dto {
    private String babynum;
    private Date B_Weight_Date;
    private int B_Age_For_Weight_Date;
    private int B_Weight;
}
