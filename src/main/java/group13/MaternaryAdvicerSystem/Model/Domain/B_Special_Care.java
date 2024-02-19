package group13.MaternaryAdvicerSystem.Model.Domain;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class B_Special_Care {
    @Id
    @OneToOne
    @JoinColumn(name="babynum",referencedColumnName = "B_Reg_Num")
    private  B_Basic_Info babynum;
    @Column(nullable = false)
    private boolean B_Premature;
    @Column(nullable = false)
    private boolean B_Feeding_Challenges;
    @Column(nullable = false)
    private boolean B_LowBirth_Weight;
    @Column(nullable = false)
    private boolean B_Inheruted_Diseases;
    @Column(nullable = false)
    private boolean B_Mother_Unstability;
    @Column(nullable = false)
    private boolean B_Development_Delays;
    @Column(nullable = false)
    private boolean B_Parent_Death;


}
