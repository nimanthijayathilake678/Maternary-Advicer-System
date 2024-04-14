package group13.MaternaryAdvicerSystem.Model.Dto;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Save_BabyNutrients_Dto {
    private String babynum;
    private Date nutrientDate;
    private String nutrientBatchNo;
    private int ageForNutrientDate;
    private String nutrientName;
}
