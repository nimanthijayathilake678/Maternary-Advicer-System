package group13.MaternaryAdvicerSystem.Model.Dto;

import jakarta.persistence.Column;

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
public class Save_NewBorn_Helath_Dto {
    private String babyNum;
    private String B_SkinColor;

    private int B_Temperature;

    private String B_Nature_Pecan;

    private String B_Breast_Feeding;

    private String B_Feces_Color;

    private Date B_Examine_Date;
}
