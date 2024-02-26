package group13.MaternaryAdvicerSystem.Repository.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.B_Basic_Info;
import group13.MaternaryAdvicerSystem.Model.Domain.B_Immunization;
import group13.MaternaryAdvicerSystem.Model.Domain.B_Nutritions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface B_Nutritions_Repository extends JpaRepository<B_Nutritions,Long> {
    List<B_Nutritions> findByBabyNum(B_Nutritions babyNutritions);
}
