package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.User;
import group13.MaternaryAdvicerSystem.Model.UserRole;
import group13.MaternaryAdvicerSystem.Repository.Login.UserRepository;
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
       // user.setRegNum(userdto.getNicNo());
        user.setRegNum(userdto.getRegNum());
        user.setPassword(getEncodedPassword(userdto.getPassword()));
        user.setPosition(userdto.getPosition());
        user.setId(userdto.getId());
        user.setEmail(userdto.getEmail());
        user.setArea(userdto.getArea());
        user.setGender(user.getGender());
        user.setMarriedStatus(userdto.getMarriedStatus());
        user.setContactNo(userdto.getContactNo());
        userRepository.save(user);
    }
    public void initUser(){

        List<User> users = new ArrayList<>();
        //Add Family
        User family=new User();
        family.setId(92020202020L);
        family.setFirstName("Family name");
        family.setFullName("Family fullname");
        family.setLastName("Family lastname");
        family.setPosition(UserRole.Family);
        family.setRegNum("C123456");
        family.setUsername("Family123");
        family.setPassword(getEncodedPassword("Family@123"));
        family.setArea("Mathara");
        family.setEmail("fam@gmail.com");
        family.setGender("Famale");
        family.setContactNo("0138393922");
        family.setMarriedStatus("yes");
        users.add(family);

        //Add Moh
        User moh=new User();
        moh.setId(92020202020L);
        moh.setFirstName("moh name");
        moh.setFullName("moh fullname");
        moh.setLastName("moh lastname");
        moh.setPosition(UserRole.MOH);
        moh.setRegNum("MO001");
        moh.setUsername("Moh123");
        moh.setPassword(getEncodedPassword("Moh@123"));
        moh.setArea("Mathara");
        moh.setEmail("moh@gmail.com");
        moh.setGender("Male");
        moh.setContactNo("0922023922");
        moh.setMarriedStatus("yes");
        users.add(moh);

        //Add Vog
        User vog=new User();
        vog.setId(92020302020L);
        vog.setFirstName("vog name");
        vog.setFullName("vog fullname");
        vog.setLastName("vog lastname");
        vog.setPosition(UserRole.VogDoctor);
        vog.setRegNum("VO001");
        vog.setUsername("Vog123");
        vog.setPassword(getEncodedPassword("Vog@123"));
        vog.setArea("Mathara");
        vog.setEmail("vog@gmail.com");
        vog.setGender("Male");
        vog.setContactNo("0922023922");
        vog.setMarriedStatus("yes");
        users.add(vog);


        //Add Midwife
        User midwife=new User();
        midwife.setId(92020202020L);
        midwife.setFirstName("mifwife name");
        midwife.setFullName("midwife fullname");
        midwife.setLastName("midwife lastname");
        midwife.setPosition(UserRole.Midwife);
        midwife.setRegNum("MD00001");
        midwife.setUsername("Midwife123");
        midwife.setPassword(getEncodedPassword("Midwife@123"));
        midwife.setArea("Akurassa");
        midwife.setEmail("midwife@gmail.com");
        midwife.setGender("Female");
        midwife.setContactNo("076023922");
        midwife.setMarriedStatus("yes");
        users.add(midwife);

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
