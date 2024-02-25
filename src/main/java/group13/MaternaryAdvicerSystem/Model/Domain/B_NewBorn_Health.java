package group13.MaternaryAdvicerSystem.Model.Domain;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class B_NewBorn_Health {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    @OneToOne
    @JoinColumn(name="babynum",referencedColumnName = "B_Reg_Num")
    private  B_Basic_Info babyNum;
    @Column(nullable = false)
    private String B_SkinColor;
    @Column(nullable = false)
    private int B_Temperature;
    @Column(nullable = false)
    private String B_Nature_Pecan;
    @Column(nullable = false)
    private String B_Breast_Feeding;
    @Column(nullable = false)
    private String B_Feces_Color;
    @Column(nullable = false)
    private Date B_Examine_Date;

}
