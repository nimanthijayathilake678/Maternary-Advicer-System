package group13.MaternaryAdvicerSystem.Service.Login;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class PasswordGenerateService {
    public String passwordGenerate(){
        String upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower="abcdefghijklmnopqrstuvwxyz";
        String num="0123456789";
        String specialChars="<>,/?}{][*%^#@&";
        String combination=upper+lower+num+specialChars;
        int len=8;

        char[] password=new char[len];

        Random r=new Random();

        for (int i=0;i<8;i++){
            password[i]=combination.charAt(r.nextInt(combination.length()));
        }

        return new String(password);
    }
}
