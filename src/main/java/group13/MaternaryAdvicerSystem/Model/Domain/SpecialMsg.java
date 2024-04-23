package group13.MaternaryAdvicerSystem.Model.Domain;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SpecialMsg {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    @ManyToOne
    @JoinColumn(name="babyNum",referencedColumnName = "B_Reg_Num")
    private  B_Basic_Info babyNum;
    @Column(nullable = false)
    private String Msg_Priority;
    @Column(nullable = false)
    private String Msg_Topic;
    @Column(nullable = false)
    private String Msg_Content;
    @Column(nullable = false)
    private Date Msg_Date;
}

