package group13.MaternaryAdvicerSystem.Repository.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Midwife_Remark;
import org.springframework.data.jpa.repository.JpaRepository;

public interface C_Midwife_Remark_Repository extends JpaRepository<C_Midwife_Remark,Long> {
    C_Midwife_Remark findByUserId(Long userId);
}
