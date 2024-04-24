package group13.MaternaryAdvicerSystem.Model.Dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class P_Field_Clinic_Care_Dto {
    private Long id;
    private String Pregnancy_id;
    private String Couple_id;
    private LocalDate P_Visit_Date;
    private int P_Poa;
    private boolean P_Anemia;
    private float P_Fundal_Height;
    private String P_PresentingPart;
    private boolean P_FM;
    private boolean P_FHS;
    private boolean P_Oedema;
    private int P_Sugar;
    private int P_Albumin;
    private boolean P_Nutritional_Requirements;
    private boolean P_EDD_Informed;
    private boolean P_DangerousSituation_Informed;
    private boolean P_Conditions_ToAvoid;
    private boolean P_Importance_Of_Mindful;
    private boolean P_Personal_Safety;
    private boolean P_Onset_Informed;
    private boolean P_Hospital_Things;
    private boolean P_BabyCare;
    private boolean P_Risk_Characteristics;
    private boolean P_Exclusive_Breastfeeding;
    private boolean P_Breastfeeding_Posture;
    private boolean P_Confirm_Milk_Availability;
    private boolean P_Postpartum_RiskFactor;
    private boolean P_FamilyPlanning_Idea;
    private boolean P_FamilyPlanning_Methods;
    private LocalDate P_Date_To_Visit_Clinic;

}
