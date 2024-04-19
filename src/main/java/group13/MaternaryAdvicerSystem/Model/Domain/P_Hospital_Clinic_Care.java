package group13.MaternaryAdvicerSystem.Model.Domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "p_hospital_clinic_care")
public class P_Hospital_Clinic_Care {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String pregnancyId;
    private String eligibleId;
    private String poa;
    private String urine;
    private String oedema;
    private String bloodpressure;
    private String fundalheight;
    private String foetalLie;
    private String presentation;
    private String fM;
    private String fhs;
    private String ebw;
    private String crl;
    private String gestsac;
    private String bpd;
    private String hc;
    private String ac;
    private String fl;
    private String liqour;
    private String placenta;
    private String averagepoa;
    private String anyother;
    private LocalDate nextvisitdate;
    private String doctorid;
    private String designation;

}
