package group13.MaternaryAdvicerSystem.Repository.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.B_Immunization_Referels;
import group13.MaternaryAdvicerSystem.Model.Domain.B_NewBorn_Health;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface B_NewBorn_Health_Repository  extends JpaRepository<B_NewBorn_Health,Long> {
    List<B_NewBorn_Health> findByBabyNum(B_NewBorn_Health newBornHealth);
}
