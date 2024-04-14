package group13.MaternaryAdvicerSystem.Model.Domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class C_Counselling_Session_By_Midwife {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sessionId;

    @ManyToOne
    private C_Filled_By_Midwife cFilledByMidwifeNo;

    @Column(nullable = false)
    private LocalDate counsellingDate;

}
