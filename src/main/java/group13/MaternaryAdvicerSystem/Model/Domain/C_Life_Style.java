package group13.MaternaryAdvicerSystem.Model.Domain;

import jakarta.persistence.*;
import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class C_Life_Style {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lifeStyleId;

    @ManyToOne
    private C_Eligible_Family_Account accountNo;

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false)
    private boolean useCigarettesBetelLeavesTobaco;

    @Column(nullable = false)
    private boolean useLiquor;

    @Column(nullable = false)
    private boolean useDrugs;

    @Column(nullable = false)
    private boolean hangoutWithSmokingPeople;

    @Column(nullable = false)
    private boolean atmosphereNotPhysicallyMentalyAbusive;

    @Column(nullable = false)
    private boolean dailyReligiousRitual;

    @Column(nullable = false)
    private boolean regularExercise;

    @Column(nullable = false)
    private boolean timeForHobbies;

}
