package group13.MaternaryAdvicerSystem.Repository.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.B_Growth;
import group13.MaternaryAdvicerSystem.Model.Domain.B_Basic_Info;
import group13.MaternaryAdvicerSystem.Model.Domain.B_Growth;

import group13.MaternaryAdvicerSystem.Model.Domain.B_Nutritions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.List;
@Repository
public interface B_Growth_Repository extends JpaRepository <B_Growth,Long>{
    List<B_Growth> findByBabyNum(B_Basic_Info babyBasicInfo);


}


