package group13.MaternaryAdvicerSystem.Repository.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Sexual_And_Reproductive_Health;
import group13.MaternaryAdvicerSystem.Model.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface C_Sexual_And_Reproductive_Health_Repository extends JpaRepository<C_Sexual_And_Reproductive_Health, Long> {
    C_Sexual_And_Reproductive_Health findByUserId(Long userId);
}
