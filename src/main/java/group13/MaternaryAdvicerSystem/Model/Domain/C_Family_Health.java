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

    @OneToOne
    @JoinColumn(name = "user_id" , referencedColumnName ="id" )
    private User user;

    @Column(nullable = false)
    private boolean w_hypertension;


    @Column(nullable = false)
    private boolean w_diabetesMellitus;


    @Column(nullable = false)
    private boolean w_heartDiseases;


    @Column(nullable = false)
    private boolean w_nervousDisorders;


    @Column(nullable = false)
    private boolean w_hemophilia;


    @Column(nullable = false)
    private boolean w_thalassemia;


    @Column(nullable = false)
    private boolean w_mentalProblems;


    @Column(nullable = false)
    private boolean w_twins;

    @Column(nullable = false)
    private boolean h_hypertension;


    @Column(nullable = false)
    private boolean h_diabetesMellitus;


    @Column(nullable = false)
    private boolean h_heartDiseases;


    @Column(nullable = false)
    private boolean h_nervousDisorders;


    @Column(nullable = false)
    private boolean h_hemophilia;


    @Column(nullable = false)
    private boolean h_thalassemia;


    @Column(nullable = false)
    private boolean h_mentalProblems;


    @Column(nullable = false)
    private boolean h_twins;
}
