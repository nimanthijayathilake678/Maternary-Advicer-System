package group13.MaternaryAdvicerSystem.Model.Domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class C_Special_Cases_Identified_By_Midwife {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long specialCaseId;

    @ManyToOne
    private C_Filled_By_Midwife cFilledByMidwifeNo;

    @Column(nullable = false)
    private String specialCase;
}
