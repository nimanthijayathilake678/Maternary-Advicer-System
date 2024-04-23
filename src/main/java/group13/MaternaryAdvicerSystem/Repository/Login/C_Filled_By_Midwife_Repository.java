package group13.MaternaryAdvicerSystem.Repository.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Filled_By_Midwife;
import org.springframework.data.jpa.repository.JpaRepository;

public interface C_Filled_By_Midwife_Repository extends JpaRepository<C_Filled_By_Midwife,Long> {
    C_Filled_By_Midwife findByUserId(Long userId);
}
