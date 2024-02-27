package group13.MaternaryAdvicerSystem.Repository.Login;
import group13.MaternaryAdvicerSystem.Model.Domain.B_Basic_Info;
import group13.MaternaryAdvicerSystem.Model.Domain.B_NeonatalExam;
import group13.MaternaryAdvicerSystem.Model.Domain.B_Nutritions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface B_Neonatal_Repository extends JpaRepository<B_NeonatalExam,Long>  {
    List<B_NeonatalExam> findByBabyNum(B_Basic_Info babyBasicInfo);
}
