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

    @OneToOne
    @JoinColumn(name = "user_id" , referencedColumnName ="id" )
    private User user;


    @Column(nullable = false)
    private Float w_weight;

    @Column(nullable = false)
    private Float w_height;

    @Column(nullable = false)
    private String w_bloodType;

    @Column(nullable = false)
    private float w_hemoglobinValue;

    @Column(nullable = false)
    private Float h_weight;

    @Column(nullable = false)
    private Float h_height;

    @Column(nullable = false)
    private String h_bloodType;

    @Column(nullable = false)
    private float h_hemoglobinValue;

    @Column(nullable = false)
    private String specialCases;



}

