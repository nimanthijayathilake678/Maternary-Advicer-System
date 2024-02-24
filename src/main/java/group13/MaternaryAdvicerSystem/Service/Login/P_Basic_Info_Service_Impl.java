package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.P_Basic_Info;
import group13.MaternaryAdvicerSystem.Repository.Login.P_Basic_Info_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class P_Basic_Info_Service_Impl implements P_Basic_Info_Service{
    @Autowired
    private P_Basic_Info_Repository p_basic_info_repository;
    @Override
    public P_Basic_Info savepregnancy(P_Basic_Info pregnancy){

        return p_basic_info_repository.save(pregnancy);
    }
}
