package group13.MaternaryAdvicerSystem.Model.Domain;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "P_Basic_Info")
public class P_Basic_Info {
    @Id
    @Column(nullable = false)
    private String P_Reg_Num;

    @Column(nullable = false)
    private String P_Reg_Location;

    @Column(nullable = false)
    private LocalDate P_Reg_Date;

    @ManyToOne
    @JoinColumn(name = "couple_id", referencedColumnName = "C_Reg_Num")
    private C_Basic_Info couple_id;

    @Column(nullable = false)
    private LocalDate C_Reg_Date;

    @Column(nullable = false)
    private String P_Grama_Division;

    @Column(nullable = false)
    private String P_MOH_Division;

    @Column(nullable = false)
    private String P_PHM_Division;


    @Column(nullable = false)
    private String P_Hospital_Clinic_Name;

    @Column(nullable = false)
    private String P_Consultant_Name;

    @Column(nullable = false)
    private String P_Field_Clinic_Name;

    @Column(nullable = false)
    private String P_Mother_Name;

    @Column(nullable = false)
    private String P_Father_Name;

    @Column(nullable = false)
    private String P_Telephone;

    @Column(nullable = false)
    private String P_Address;


}
