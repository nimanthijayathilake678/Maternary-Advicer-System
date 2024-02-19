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
    @OneToOne
    @JoinColumn(name="babynum",referencedColumnName = "B_Reg_Num")
    private  B_Basic_Info babynum;
    @Column(nullable = false)
    private int B_Age;
    @Column(nullable = false)
    private String B_Blood_Group;
    @Column(nullable = false)
    private String B_Exam_Date;
    @Column(nullable = false)
    private String B_Growth;
    private boolean B_Worm;
    private boolean B_Hydration;
    private boolean B_Capillery_Filling;
    private boolean B_Pulse_Rate;
    private boolean B_HeartMurmers;
    private boolean B_FemoralPulse;
    private boolean B_RespiratoryRate;
    private boolean B_Grunting;
    private boolean B_IntercostalRecession;
    private boolean B_Tone;
    private boolean B_OFC;
    private boolean B_Frontenelle;
    private boolean B_Eyes;
    private boolean B_Scalp;
    private boolean B_Mouth;
    private boolean B_Palate;
    private boolean B_Ears;
    private boolean B_Abdomen;

}
