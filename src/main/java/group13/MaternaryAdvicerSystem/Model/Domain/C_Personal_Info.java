package group13.MaternaryAdvicerSystem.Model.Domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class C_Personal_Info {
//    @EmbeddedId
//    private RegNo_Gender_Key id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long c_personal_info_id;

    @ManyToOne
    private C_Eligible_Family_Account accountNo;


    @Column(nullable = false)
    private String gender;

    @Column(nullable = false)
    private LocalDate dob;

    @Column(nullable = false)
    private String educationalLevel;

    @Column(nullable = false)
    private String occupation;

    @Column(nullable = false)
    private LocalDate marriedDate;

}
