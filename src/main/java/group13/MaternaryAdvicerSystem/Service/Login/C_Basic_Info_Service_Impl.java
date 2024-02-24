package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.C_Basic_Info;
import group13.MaternaryAdvicerSystem.Repository.Login.C_Basic_Info_Repository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class C_Basic_Info_Service_Impl implements C_Basic_Info_Service{
    @Autowired
    private C_Basic_Info_Repository c_basic_info_repository;
    @Override
    public void savecouple(C_Basic_Info cBasicInfo) {
        // Ensure that the identifier is set before saving
        if (cBasicInfo.getC_Reg_Num() == null || cBasicInfo.getC_Reg_Num().isEmpty()) {
            // You can generate the ID according to your requirements
            cBasicInfo.setC_Reg_Num(generateUniqueId());
        }

        // Call the repository method to persist the entity
        c_basic_info_repository.save(cBasicInfo);
    }

    // You can implement a method to generate unique IDs
    private String generateUniqueId() {
        // Implement your logic to generate a unique ID
        return "generated_id_value";
    }
}
