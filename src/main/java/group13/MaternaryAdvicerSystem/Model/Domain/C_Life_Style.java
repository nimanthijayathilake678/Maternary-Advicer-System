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

    @OneToOne
    @PrimaryKeyJoinColumn
    private User user;


    @Column(nullable = false)
    private boolean w_useCigarettesBetelLeavesTobaco;

    @Column(nullable = false)
    private boolean w_useLiquor;

    @Column(nullable = false)
    private boolean w_useDrugs;

    @Column(nullable = false)
    private boolean w_hangoutWithSmokingPeople;

    @Column(nullable = false)
    private boolean w_atmosphereNotPhysicallyMentalyAbusive;

    @Column(nullable = false)
    private boolean w_dailyReligiousRitual;

    @Column(nullable = false)
    private boolean w_regularExercise;

    @Column(nullable = false)
    private boolean w_timeForHobbies;

    @Column(nullable = false)
    private boolean h_useCigarettesBetelLeavesTobaco;

    @Column(nullable = false)
    private boolean h_useLiquor;

    @Column(nullable = false)
    private boolean h_useDrugs;

    @Column(nullable = false)
    private boolean h_hangoutWithSmokingPeople;

    @Column(nullable = false)
    private boolean h_atmosphereNotPhysicallyMentalyAbusive;

    @Column(nullable = false)
    private boolean h_dailyReligiousRitual;

    @Column(nullable = false)
    private boolean h_regularExercise;

    @Column(nullable = false)
    private boolean h_timeForHobbies;

}
