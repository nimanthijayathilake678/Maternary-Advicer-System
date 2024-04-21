package group13.MaternaryAdvicerSystem.Service.Login;
import group13.MaternaryAdvicerSystem.Model.Domain.*;
import group13.MaternaryAdvicerSystem.Model.Dto.UserRegisterDTO;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import group13.MaternaryAdvicerSystem.Repository.Login.UserRegisterRepository;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class U_Basic_Info_Service_Impl implements U_Basic_Info_Service{
    @Autowired
    private UserRegisterRepository U_Basic_Info_Repository;

    @Autowired
    private PasswordEncoder passwordEncoder;
    private String getEncodedPassword(String password) {
        return passwordEncoder.encode(password);
    }
    public void saveuser(UserRegisterDTO user){
        User user_basic_info=new User();
        //user_basic_info.setId(user.getId());
        user_basic_info.setNic(user.getNicNo());
        user_basic_info.setContactNo(user.getContactNo());
        user_basic_info.setMarriedStatus(user.getMarriedStatus());
        user_basic_info.setArea(user.getArea());
        user_basic_info.setEmail(user.getEmail());
        user_basic_info.setFirstName(user.getFirstName());
        user_basic_info.setLastName(user.getLastName());
        user_basic_info.setFullName(user.getFullName());
        user_basic_info.setUsername(user.getUsername());
        user_basic_info.setPassword(getEncodedPassword(user.getPassword()));
        user_basic_info.setPosition(user.getPosition());

//        Optional<User> uBasicInfo;
//        uBasicInfo = U_Basic_Info_Repository.findById(user.getNicNo());
//        uBasicInfo.ifPresent(user_basic_info::setNic);


        U_Basic_Info_Repository.save(user_basic_info);
    }

    @Override
    public List<User> getAllUserInformation() {
        return U_Basic_Info_Repository.findAll();
    }

    @Override
    public User getUserInfoById(Long id) {
        return U_Basic_Info_Repository.findById(id).orElse(null);
    }

    @Override
    public boolean updateUserInfo(User updateUserlInfoDetails, Long id) {
        Optional<User> user_optional =  U_Basic_Info_Repository.findById(id);
        if(user_optional.isPresent()){
            User user_To_Update = user_optional.get();
            user_To_Update.setNic(updateUserlInfoDetails.getNic());
            user_To_Update.setFullName(updateUserlInfoDetails.getFullName());
            user_To_Update.setFirstName(updateUserlInfoDetails.getFirstName());
            user_To_Update.setLastName(updateUserlInfoDetails.getLastName());
            user_To_Update.setContactNo(updateUserlInfoDetails.getContactNo());
            user_To_Update.setEmail(updateUserlInfoDetails.getEmail());
            user_To_Update.setGender(updateUserlInfoDetails.getGender());
            user_To_Update.setMarriedStatus(updateUserlInfoDetails.getMarriedStatus());
            user_To_Update.setArea(updateUserlInfoDetails.getArea());
            user_To_Update.setUsername(updateUserlInfoDetails.getUsername());
            user_To_Update.setPassword(updateUserlInfoDetails.getPassword());
            return true;
        }
        return false;
    }
}

