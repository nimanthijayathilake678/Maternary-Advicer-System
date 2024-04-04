package group13.MaternaryAdvicerSystem.Model.Domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
    @Column(nullable = false)
    private String ID;
    
    @Column(nullable = false)
    private String POA;
    private String Urine;
    private String Oedema;
    private String BloodPressure;
    private String FundalHeight;
    private String FoetalLie;
    private String Presentation;
    private String FM;
    private String FHS;
    private String EBW;
    private String CRL;
    private String GestSac;
    private String BPD;
    private String HC;
    private String AC;
    private String FL;
    private String Liqour;
    private LocalDate Placenta;
    private String AveragePOA;
    private String AnyOther;
    private LocalDate NextVisitDate;
    private String DoctorId;
    private String Designation;

}
