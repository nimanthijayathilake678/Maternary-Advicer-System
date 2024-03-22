package group13.MaternaryAdvicerSystem.Repository.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.B_Basic_Info;
import group13.MaternaryAdvicerSystem.Model.Domain.B_Immunization;
import group13.MaternaryAdvicerSystem.Model.Domain.B_Immunization_Referels;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface   B_Immunization_Referels_Repository extends JpaRepository<B_Immunization_Referels,Long> {
    List<B_Immunization_Referels> findByBabyNum(B_Basic_Info b_basic_info);
}
