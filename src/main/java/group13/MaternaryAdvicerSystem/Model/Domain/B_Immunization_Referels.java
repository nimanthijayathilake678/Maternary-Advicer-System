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
public class B_Immunization_Referels {
    @Id
    @OneToOne
    @JoinColumn(name="babynum",referencedColumnName = "B_Reg_Num")
    private  B_Basic_Info babynum;
    @Column(nullable = false)
    private String B_Immunization_Name;
    @Column(nullable = false)
    private String B_Referel_Reason;
    @Column(nullable = false)
    private String B_Referel_Place;
}
