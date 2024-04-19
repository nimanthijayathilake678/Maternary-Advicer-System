package group13.MaternaryAdvicerSystem.Repository.Login;
import group13.MaternaryAdvicerSystem.Model.Domain.B_Basic_Info;
import group13.MaternaryAdvicerSystem.Model.Domain.Chat_Forum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Chat_Forum_Repository extends JpaRepository<Chat_Forum,Long> {
}
