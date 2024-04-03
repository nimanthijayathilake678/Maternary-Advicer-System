package group13.MaternaryAdvicerSystem.Model.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class P_Hospital_Care_DTO {
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
    private LocalDate placenta;
    private String averagepoa;
    private String anyother;
    private LocalDate nextvisitdate;
    private String doctorid;
    private String designation;
}
