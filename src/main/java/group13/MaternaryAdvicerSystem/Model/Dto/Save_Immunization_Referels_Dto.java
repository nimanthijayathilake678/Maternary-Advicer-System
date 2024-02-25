package group13.MaternaryAdvicerSystem.Model.Dto;
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
public class Save_Immunization_Referels_Dto {
    private String babyNum;
    private String B_Immunization_Name;
    private String B_Referel_Reason;
    private String B_Referel_Place;
}
