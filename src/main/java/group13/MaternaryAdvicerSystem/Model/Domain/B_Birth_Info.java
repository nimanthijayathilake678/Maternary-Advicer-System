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
public class B_Birth_Info {
    @Id
    @OneToOne
    @JoinColumn(name="babynum",referencedColumnName = "B_Reg_Num")
    private  B_Basic_Info babynum;
    @Column(nullable = false)
    private String B_Birth_Hospital;
    @Column(nullable = false)
    private String B_Birth_Way;
    @Column(nullable = false)
    private float B_Birth_Weight;
    @Column(nullable = false)
    private float B_Birth_HeadSize;
    @Column(nullable = false)
    private float B_Birth_Wegiht;
    @Column(nullable = false)
    private float B_Birth_Lenght;
    @Column(nullable = false)
    private float B_Appgar_1min;
    @Column(nullable = false)
    private float B_Appgar_5min;
    @Column(nullable = false)
    private float B_Appgar_10min;
    @Column(nullable = false)
    private boolean B_VitaminK;
    @Column(nullable = false)
    private boolean B_Thyroid;
    @Column(nullable = false)
    private boolean B_BreastFeeding;
    @Column(nullable = false)
    private boolean B_BreastConnection;
    @Column(nullable = false)
    private boolean B_BreastEstablished;

    private String B_Birth_Test;

}
