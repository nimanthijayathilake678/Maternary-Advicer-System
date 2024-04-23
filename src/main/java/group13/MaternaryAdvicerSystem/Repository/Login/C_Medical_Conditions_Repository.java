package group13.MaternaryAdvicerSystem.Repository.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Medical_Conditions;
import group13.MaternaryAdvicerSystem.Model.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface C_Medical_Conditions_Repository extends JpaRepository<C_Medical_Conditions, Long> {
    C_Medical_Conditions findByUserId(Long userId);
}
