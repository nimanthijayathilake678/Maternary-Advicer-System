package group13.MaternaryAdvicerSystem.Model.Domain;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class C_Family_Health {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long familyHealthId;

    @ManyToOne
    private C_Eligible_Family_Account accountNo;

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false)
    private boolean hypertension;


    @Column(nullable = false)
    private boolean diabetesMellitus;


    @Column(nullable = false)
    private boolean heartDiseases;


    @Column(nullable = false)
    private boolean nervousDisorders;


    @Column(nullable = false)
    private boolean hemophilia;


    @Column(nullable = false)
    private boolean thalassemia;


    @Column(nullable = false)
    private boolean mentalProblems;


    @Column(nullable = false)
    private boolean twins;
}
