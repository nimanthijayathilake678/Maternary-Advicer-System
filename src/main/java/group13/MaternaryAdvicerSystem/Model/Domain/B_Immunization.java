package group13.MaternaryAdvicerSystem.Model.Domain;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class B_Immunization implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    @ManyToOne
    @JoinColumn(name="babynum",referencedColumnName = "B_Reg_Num")
    private  B_Basic_Info babyNum;
    @Column(nullable = false)
    private String B_Immunization_Name;
    @Column(nullable = false)
    private int B_Age_For_Vaccine_Date;
    @Column(nullable = false)
    private Date B_Vaccine_Date;
    @Column(nullable = false)
    private String B_Batch_No;
    @Column(nullable = false)
    private String B_adverse_Effects;

}
