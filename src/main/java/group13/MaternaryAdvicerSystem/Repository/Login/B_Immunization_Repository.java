package group13.MaternaryAdvicerSystem.Repository.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.B_Basic_Info;
import group13.MaternaryAdvicerSystem.Model.Domain.B_Immunization;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface B_Immunization_Repository extends JpaRepository<B_Immunization,Long> {
    List<B_Immunization> findByBabyNum(B_Basic_Info babyBasicInfo);
}
