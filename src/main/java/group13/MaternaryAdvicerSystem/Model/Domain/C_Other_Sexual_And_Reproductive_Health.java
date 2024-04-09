package group13.MaternaryAdvicerSystem.Model.Domain;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data

public class C_Other_Sexual_And_Reproductive_Health {
    @Id
    @GeneratedValue
    private Long OtherSexualAndReproductiveid;

    @ManyToOne
    private C_Eligible_Family_Account accountNo;

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false)
    private boolean familyPlanning;

    @Column(nullable = false)
    private String familyPlanningDetails;

    @Column(nullable = false)
    private boolean delayingFirstChild;

    @Column(nullable = false)
    private int delayingTimePeriod;
}
