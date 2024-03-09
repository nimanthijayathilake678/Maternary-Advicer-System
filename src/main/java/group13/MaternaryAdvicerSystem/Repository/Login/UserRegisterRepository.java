package group13.MaternaryAdvicerSystem.Repository.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.UserRegister;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRegisterRepository extends JpaRepository <UserRegister,String> {
    @Query(value= "SELECT * FROM user_register WHERE id = ?1",nativeQuery = true)
    UserRegister getUserByID(String userID);

    @Query(value= "SELECT * FROM user_register WHERE id = ?1 AND address = ?2",nativeQuery = true)
    UserRegister getUserByIDANDADDRESS(String userID , String address);
}
