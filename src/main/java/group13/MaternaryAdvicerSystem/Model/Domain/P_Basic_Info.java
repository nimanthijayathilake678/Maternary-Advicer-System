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
    @Column(nullable = false)
    private String P_Reg_Num;

    @Column(nullable = false)
    private LocalDate P_Reg_Date;

    @Column(nullable = false)
    private String P_Reg_Location;

    @ManyToOne
    @JoinColumn(name = "couple_id", referencedColumnName = "C_Reg_Num")
    private C_Basic_Info couple_id;

    private String P_MOH_Division;

    @Column(nullable = false)
    private String P_Hospital_Clinic_Name;

    @Column(nullable = false)
    private String P_Consultant_Name;

    @Column(nullable = false)
    private String P_Clinic_Name;
}
