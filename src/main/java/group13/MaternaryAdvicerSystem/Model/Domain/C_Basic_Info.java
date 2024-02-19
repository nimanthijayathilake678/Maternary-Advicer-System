package group13.MaternaryAdvicerSystem.Model.Domain;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class C_Basic_Info {
    @Id
    private String Eligible_Reg_Num;

    @Column(nullable = false)
    private Date Eligible_Reg_Date;
    private String C_MOH_Division;
    @Column(nullable = false)
    private String C_FSHO_Division;
    @Column(nullable = false)
    private String C_Mother_Name;
    @Column(nullable = false)
    private String C_Husband_Name;
    @Column(nullable = false)
    private String C_Address;
    @Column(nullable = false)
    private String C_Email;
    @Column(nullable = false)
    private String C_Telephone;

    @OneToMany(mappedBy = "couple", cascade = CascadeType.ALL)
    private List<P_Basic_Info> pregnancies;
    @OneToMany(mappedBy = "couple", cascade = CascadeType.ALL)
    private List<B_Basic_Info> babies;
}
