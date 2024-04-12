package group13.MaternaryAdvicerSystem.Model.Domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class B_Basic_Info {
    @Id
    @Column(nullable = false)
    private String B_Reg_Num;

    @Column(nullable = false)
    private LocalDate B_Reg_Date;

    @Column(nullable = false)
    private String B_MOH_Division;

    @Column(nullable = false)
    private String B_FSHO_Division;

    @ManyToOne
    @JoinColumn(name = "couple_id", referencedColumnName = "C_Reg_Num")
    private C_Basic_Info couple_id;

    @ManyToOne
    @JoinColumn(name = "pregnancy_id", referencedColumnName = "P_Reg_Num")
    private P_Basic_Info pregnancy_id;

    @Column(nullable = false)
    private String B_Name;

    @Column(nullable = false)
    private int B_Mother_Age;

    @OneToMany(mappedBy = "babyNum", cascade = CascadeType.ALL)
    private List<B_Immunization> immunizationRecords;

    @OneToMany(mappedBy = "babyNum", cascade = CascadeType.ALL)
    private List<B_Immunization_Referels> immunizationReferels;

    @OneToMany(mappedBy = "babyNum", cascade = CascadeType.ALL)
    private List<B_NewBorn_Health> newBornHealths;
}