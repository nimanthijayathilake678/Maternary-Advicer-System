package group13.MaternaryAdvicerSystem.Model.Domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "M_Couple_General_Info")
public class M_Couple_General_Info {
    @Column(nullable = false)
    private String Div_Reg_Min_H_Service;
    @Column(nullable = false)
    private String MOHArea;
    @Column(nullable = false)
    private String PHMArea;
    @Column(nullable = false)
    @Id
    private String EligibleRegNo;
    @Column(nullable = false)
    private String HusbandName ;
    @Column(nullable = false)
    private String Address;
    @Column(nullable = false)
    private String Email;
    @Column(nullable = false)
    private Integer TelephoneNo;


}
