package group13.MaternaryAdvicerSystem.Repository.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.B_Basic_Info;
import group13.MaternaryAdvicerSystem.Model.Domain.B_NewBorn_Health;
import group13.MaternaryAdvicerSystem.Model.Domain.B_Nutritions;
import org.springframework.data.jpa.repository.JpaRepository;
import group13.MaternaryAdvicerSystem.Model.Domain.SpecialMsg;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Special_Service_Repository  extends JpaRepository<SpecialMsg,Long>{
    List<SpecialMsg> findByBabyNum(B_Basic_Info babyBasicInfo);


}






