package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.P_Add_Refferal;

import java.util.List;

public interface IP_Add_Refferal_Service {
    P_Add_Refferal addRefferal (P_Add_Refferal p_add_refferal);

    List<P_Add_Refferal> getRefferal();

}
