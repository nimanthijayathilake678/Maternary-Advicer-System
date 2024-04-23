package group13.MaternaryAdvicerSystem.Model.Dto;
import java.util.Date;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Save_Special_Msg_Dto {
    private Long id;
    private String babyNum;

    private String Msg_Priority;

    private String Msg_Topic;

    private String Msg_Content;

    private Date Msg_Date;
}
