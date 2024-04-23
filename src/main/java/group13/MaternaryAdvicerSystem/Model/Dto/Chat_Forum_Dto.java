package group13.MaternaryAdvicerSystem.Model.Dto;
import java.util.Date;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Chat_Forum_Dto {
    private  String regNum;

    private Date msg_Date;

    private String msg_Content;
}
