package group13.MaternaryAdvicerSystem.Repository.Login;
import group13.MaternaryAdvicerSystem.Model.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
    User findByUsername(String username);
}
