package group13.MaternaryAdvicerSystem.Repository.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.B_Basic_Info;
import group13.MaternaryAdvicerSystem.Model.Domain.C_Basic_Info;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface B_Basic_Info_Repository extends JpaRepository<B_Basic_Info,String> {
}
