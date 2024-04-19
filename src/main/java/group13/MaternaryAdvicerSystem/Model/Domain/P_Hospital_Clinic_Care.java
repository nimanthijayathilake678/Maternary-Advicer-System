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
public class P_Hospital_Clinic_Care {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String pregnancyRegNo;
    private String eligibilityRegNo;
    private String poa;
    private String urine;
    private String oedema;
    private String bloodPressure;
    private String fundalHeight;
    private String foetalLie;
    private String presentation;
    private String fM;
    private String fhs;
    private String ebw;
    private String crl;
    private String gestSac;
    private String bpd;
    private String hc;
    private String ac;
    private String fl;
    private String liqour;
    private String placenta;
    private String averagePOA;
    private String anyother;
    private LocalDate nextVisitDate;
    private String doctorId;
    private String designation;

}
