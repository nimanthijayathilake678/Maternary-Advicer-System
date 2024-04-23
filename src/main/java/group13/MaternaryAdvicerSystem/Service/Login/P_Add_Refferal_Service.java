package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.P_Add_Refferal;
import group13.MaternaryAdvicerSystem.Repository.Login.P_Add_Refferal_Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class P_Add_Refferal_Service implements IP_Add_Refferal_Service{
    private final P_Add_Refferal_Repository p_add_refferal_repository;

    @Override
    public P_Add_Refferal addRefferal(P_Add_Refferal p_add_refferal){
        return p_add_refferal_repository.save(p_add_refferal);
    }
    @Override
    public List<P_Add_Refferal> getRefferal(){
        return p_add_refferal_repository.findAll();
    }
}
