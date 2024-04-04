package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.User;
import group13.MaternaryAdvicerSystem.Model.UserRole;
import group13.MaternaryAdvicerSystem.Repository.Login.UserRepository;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class RegistrationService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public void registerUser(User userdto) {
        User user = new User();
        user.setFirstName(userdto.getFirstName());
        user.setLastName(userdto.getLastName());
        user.setFullName(userdto.getFullName());
        user.setUsername(userdto.getUsername());
        user.setNic(userdto.getNic());
        user.setPassword(getEncodedPassword(userdto.getPassword()));
        user.setPosition(userdto.getPosition());

        userRepository.save(user);
    }
    public void initUser(){
//        User user1 = new User();
//        user1.setFullName("G Gunathilake");
//        user1.setFirstName("Gayani");
//        user1.setLastName("Gunathilake");
//        user1.setPosition(UserRole.Family);
//        user1.setNic("955922088");
//        user1.setUsername("Family123");
//        user1.setPassword(getEncodedPassword("Family@123"));
//
//        userRepository.save(user1);
        List<User> users = new ArrayList<>();

        //Add MOH


        //Add Family
        User family=new User();
        family.setFirstName("Family name");
        family.setFullName("Family fullname");
        family.setLastName("Family lastname");
        family.setPosition(UserRole.Family);
        family.setNic("999574383");
        family.setUsername("Family123");
        family.setPassword(getEncodedPassword("Family@123"));
        family.setArea("Mathara");
        family.setEmail("fam@gmail.com");
        family.setGender("Famale");
        family.setContactNo("0138393922");
        family.setMarriedStatus("yes");
        users.add(family);

        //Add VOGDR
//        User vogDr=new User();
//        vogDr.setFirstName("Vogdr name");
//        vogDr.setFullName("Vogdr fullname");
//        vogDr.setLastName("Vogdr lastname");
//        vogDr.setPosition(UserRole.VogDoctor);
//        vogDr.setNic("283849494");
//        vogDr.setUsername("Vog123");
//        vogDr.setPassword(getEncodedPassword("Vog@123"));
//        vogDr.setArea("Mathara");
//        users.add(vogDr);
//
//        User moh=new User();
//        moh.setFirstName("MOH name");
//        moh.setFullName("MOH fullname");
//        moh.setLastName("MOH lastname");
//        moh.setPosition(UserRole.MOH);
//        moh.setNic("283849494");
//        moh.setUsername("Moh123");
//        moh.setPassword(getEncodedPassword("Moh@123"));
//        moh.setArea("Mathara");
//        users.add(moh);

        // Save all users to the database
        userRepository.saveAll(users);


    }
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    public String getEncodedPassword(String password) {
        return passwordEncoder.encode(password);
    }
}
