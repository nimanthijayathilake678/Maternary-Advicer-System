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
public class B_Basic_Info {
    @Id
    private  String B_Reg_Num;
    @Column(nullable = false)
    private String B_MOH_Division;
    @Column(nullable = false)
    private String B_FSHO_Division;
    @ManyToOne
    @JoinColumn(name = "eligible_reg_num", referencedColumnName = "eligible_reg_num")
    private C_Basic_Info couple;
    @ManyToOne
    @JoinColumn(name = "p_reg_num", referencedColumnName = "p_reg_num")
    private P_Basic_Info pregnancy;
    @Column(nullable = false)
    private Date B_Reg_Date;
    @Column(nullable = false)
    private String B_Name;
    @Column(nullable = false)
    private int B_Mother_Age;




}
