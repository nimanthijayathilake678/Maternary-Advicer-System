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
    private String C_Reg_Num;

    @Column(nullable = false)
    private LocalDate C_Reg_Date;

    @Column(nullable = false)
    private String C_MOH_Division;

    @Column(nullable = false)
    private String C_FSHO_Division;

    @Column(nullable = false)
    private String C_Mother_Name;

    @Column(nullable = false)
    private String C_Husband_Name;

    @Column(nullable = true)
    private String C_Address;

    @Column(nullable = true)
    private String C_Email;

    @Column(nullable = true)
    private String C_Telephone;

    @Column(nullable = false)
    private String  C_PHM_Division;

    @OneToMany(mappedBy = "couple_id", cascade = CascadeType.ALL)
    private List<P_Basic_Info> pregnancies;

    @OneToMany(mappedBy = "couple_id", cascade = CascadeType.ALL)
    private List<B_Basic_Info> babies;
}