//package group13.MaternaryAdvicerSystem.Service.Login;
//
//import group13.MaternaryAdvicerSystem.Model.Domain.UserRegister;
//import group13.MaternaryAdvicerSystem.Model.Dto.UserRegisterDTO;
//import group13.MaternaryAdvicerSystem.Repository.Login.UserRegisterRepository;
//import jakarta.transaction.Transactional;
//import org.modelmapper.ModelMapper;
//import org.modelmapper.TypeToken;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//@Transactional
//public class UserRegisterService {
//    @Autowired
//    private UserRegisterRepository userRegisterRepository;
//    @Autowired
//    private ModelMapper modelMapper;
//    public UserRegisterDTO saveUserRegister(UserRegisterDTO userRegisterDTO){
//        userRegisterRepository.save(modelMapper.map(userRegisterDTO, UserRegister.class));
//        return userRegisterDTO;
//    }
//
//    public List<UserRegisterDTO> getAllUsers(){
//        List<UserRegister>userRegisterList=userRegisterRepository.findAll();
//        return modelMapper.map(userRegisterList,new TypeToken<List<UserRegisterDTO>>(){}.getType());
//    }
//
//    public UserRegisterDTO updateUserRegister(UserRegisterDTO userRegisterDTO){
//        userRegisterRepository.save(modelMapper.map(userRegisterDTO, UserRegister.class));
//        return userRegisterDTO;
//    }
//
//    public boolean deleteUserRegister(UserRegisterDTO userRegisterDTO){
//        userRegisterRepository.delete(modelMapper.map(userRegisterDTO, UserRegister.class));
//        return true;
//    }
//
//    public UserRegisterDTO getUserByID(String userID){
//        UserRegister userRegister = userRegisterRepository.getUserByID(userID);
//        return modelMapper.map(userRegister,UserRegisterDTO.class);
//    }
//
//    public UserRegisterDTO getUserByIDANDADDRESS(String userID, String address){
//        UserRegister userRegister = userRegisterRepository.getUserByIDANDADDRESS(userID ,address);
//        return modelMapper.map(userRegister,UserRegisterDTO.class);
//    }
//}
