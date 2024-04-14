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
public class Save_NewBorn_Helath_Dto {
    private String babyNum;
    private String skinColor;

    private int temperature;

    private String naturePecan;

    private String breastFeeding;

    private String fecesColor;

    private Date examineDate;
}
