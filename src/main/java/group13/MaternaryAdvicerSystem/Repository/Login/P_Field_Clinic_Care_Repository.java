package group13.MaternaryAdvicerSystem.Repository.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.P_Field_Clinic_Care;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface P_Field_Clinic_Care_Repository extends JpaRepository<P_Field_Clinic_Care,Long> {
}
