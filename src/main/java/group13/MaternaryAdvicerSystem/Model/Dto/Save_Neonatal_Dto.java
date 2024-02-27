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
public class Save_Neonatal_Dto {
    private String babynum;
    private boolean B_FemoralPulse;
    private boolean B_RespiratoryRate;
    private boolean B_Grunting;
    private boolean B_IntercostalRecession;
    private boolean B_Tone;
    private boolean B_OFC;
    private boolean B_Worm;
    private boolean B_Hydration;
    private boolean b_Response;
    private boolean B_Capillery_Filling;
    private boolean B_Pulse_Rate;
    private boolean B_HeartMurmers;
}
