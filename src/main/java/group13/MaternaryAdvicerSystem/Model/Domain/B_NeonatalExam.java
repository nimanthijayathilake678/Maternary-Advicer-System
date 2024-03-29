package group13.MaternaryAdvicerSystem.Model.Domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class B_NeonatalExam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    @OneToOne
    @JoinColumn(name="babynum",referencedColumnName = "B_Reg_Num")
    private  B_Basic_Info babyNum;
    @Column(nullable = false)
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
