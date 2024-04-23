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
    private Long personalInfoId;

    @OneToOne
    @JoinColumn(name = "user_id" , referencedColumnName ="id" )
    private User user;

    @Column(nullable = false)
    private LocalDate w_dob;

    @Column(nullable = false)
    private String w_educationalLevel;

    @Column(nullable = false)
    private String w_occupation;

    @Column(nullable = false)
    private String h_name;

    @Column(nullable = false)
    private LocalDate h_dob;

    @Column(nullable = false)
    private String h_educationalLevel;

    @Column(nullable = false)
    private String h_occupation;

    @Column(nullable = false)
    private LocalDate marriedDate;

    @Column(nullable = false)
    private String address;

}
