package group13.MaternaryAdvicerSystem.Model.Domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class C_Filled_By_Midwife {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long filledByAreaNo;

    @ManyToOne
    private C_Eligible_Family_Account accountNo;

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false)
    private Float weight;

    @Column(nullable = false)
    private Float height;

    @Column(nullable = false)
    private String bloodType;

    @Column(nullable = false)
    private float hemoglobinValue;

    @OneToMany(mappedBy = "cFilledByMidwifeNo")
    private Set<C_Special_Cases_Identified_By_Midwife> specialCasesIdentifiedByMidwives  = new HashSet<>();

    @OneToMany(mappedBy = "cFilledByMidwifeNo")
    private Set<C_Counselling_Session_By_Midwife> cCounsellingSessionByMidwives  = new HashSet<>();

}

