package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.B_Basic_Info;
import group13.MaternaryAdvicerSystem.Model.Domain.B_NeonatalExam;
import group13.MaternaryAdvicerSystem.Model.Dto.Save_Neonatal_Dto;
import group13.MaternaryAdvicerSystem.Repository.Login.B_Basic_Info_Repository;
import group13.MaternaryAdvicerSystem.Repository.Login.B_Neonatal_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
@Service
public class B_Neonatal_Service_Impl implements B_Neonatal_Service{
    @Autowired
    private B_Basic_Info_Repository b_basic_info_repository;
    @Autowired
    private B_Neonatal_Repository b_neonatal_repository;
    @Override
    public void saveBabyNeonatal(Save_Neonatal_Dto babyNeonatal){
        B_NeonatalExam b_neonatalExam=new B_NeonatalExam();
        Optional<B_Basic_Info> basicInfo;
        basicInfo = b_basic_info_repository.findById(babyNeonatal.getBabynum());



        if( basicInfo.isPresent()){
            b_neonatalExam.setBabyNum(basicInfo.get());
        }
        b_neonatalExam.setB_Grunting(babyNeonatal.isB_Grunting());
        b_neonatalExam.setB_OFC(babyNeonatal.isB_OFC());
        b_neonatalExam.setB_Hydration(babyNeonatal.isB_Hydration());
        b_neonatalExam.setB_HeartMurmers(babyNeonatal.isB_HeartMurmers());
        b_neonatalExam.setB_FemoralPulse(babyNeonatal.isB_FemoralPulse());
        b_neonatalExam.setB_Capillery_Filling(babyNeonatal.isB_Capillery_Filling());
        b_neonatalExam.setB_Tone(babyNeonatal.isB_Tone());
        b_neonatalExam.setB_IntercostalRecession(babyNeonatal.isB_IntercostalRecession());
        b_neonatalExam.setB_Pulse_Rate(babyNeonatal.isB_Pulse_Rate());
        b_neonatalExam.setB_RespiratoryRate(babyNeonatal.isB_RespiratoryRate());
        b_neonatalExam.setB_Worm(babyNeonatal.isB_Worm());
        b_neonatalExam.setB_Response(babyNeonatal.isB_Response());
        b_neonatal_repository.save(b_neonatalExam);
    }
    public List<Save_Neonatal_Dto> getBabyNeonatal(String babyNum){
        return null;
    }
}
