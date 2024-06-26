package group13.MaternaryAdvicerSystem.Repository.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Family_Health;
import group13.MaternaryAdvicerSystem.Model.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface C_Family_Health_Repository extends JpaRepository<C_Family_Health, User> {
    C_Family_Health findByUserId(Long userId);
}
