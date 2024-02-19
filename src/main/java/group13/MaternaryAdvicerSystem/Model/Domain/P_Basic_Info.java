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
public class P_Basic_Info {
    @Id
    private  String P_Reg_Num;
    @Column(nullable = false)
    private LocalDate P_Reg_Date;
    @Column(nullable = false)
    private String P_Reg_Location;
    @ManyToOne
    @JoinColumn(name = "eligible_reg_num", referencedColumnName = "eligible_reg_num")
    private C_Basic_Info couple;
    @Column(nullable = false)
    private Date Eligible_Reg_Date;
    private String P_MOH_Division;
    @Column(nullable = false)
    private String P_Hospital_Clinic_Name;
    @Column(nullable = false)
    private String P_Consultant_Obstetrician_Name;
    @Column(nullable = false)
    private String P_Feild_Clinic_Name;

}
