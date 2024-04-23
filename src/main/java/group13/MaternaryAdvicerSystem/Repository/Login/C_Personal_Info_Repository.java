package group13.MaternaryAdvicerSystem.Repository.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Personal_Info;
import group13.MaternaryAdvicerSystem.Model.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface C_Personal_Info_Repository extends JpaRepository<C_Personal_Info, Long> {
    C_Personal_Info findByUserId(Long userId);
}
