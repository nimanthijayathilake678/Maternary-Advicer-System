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
@Table(name = "MarrriedCouplePersonalInfo")
public class MarrriedCouplePersonalInfo {
    @Id
    private String EligibleRegNo;
    @Column(nullable = false)
    private String Gender;
    @Column(nullable = false)
    private String DOB;
    @Column(nullable = false)
    private Date EducationalLevel;
    @Column(nullable = false)
    private String Occupation;
    @Column(nullable = false)
    private String MarriedDate;


}
