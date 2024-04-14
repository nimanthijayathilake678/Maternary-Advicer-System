package group13.MaternaryAdvicerSystem.Model.Dto;

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
    private String vaccineName;
    private int ageForVaccine;
    private Date vaccineDate;
    private String batchNo;
    private String adverseEffects;

}
