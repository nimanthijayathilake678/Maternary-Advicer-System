package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.B_Basic_Info;
import group13.MaternaryAdvicerSystem.Model.Domain.B_Nutritions;
import group13.MaternaryAdvicerSystem.Model.Dto.B_Basic_Info_Dto;
import group13.MaternaryAdvicerSystem.Model.Dto.Save_BabyNutrients_Dto;
import group13.MaternaryAdvicerSystem.Model.Dto.Save_Special_Msg_Dto;

import java.util.List;
import group13.MaternaryAdvicerSystem.Model.Domain.SpecialMsg;
import group13.MaternaryAdvicerSystem.Repository.Login.B_Basic_Info_Repository;
import group13.MaternaryAdvicerSystem.Repository.Login.B_Nutritions_Repository;
import group13.MaternaryAdvicerSystem.Repository.Login.Special_Service_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class Special_Msg_Service_Impl implements Special_Msg_Service {
    @Autowired
    private B_Basic_Info_Repository b_basic_info_repository;
    @Autowired
    private Special_Service_Repository special_service_repository;
    @Override
    public void saveSpecialMsg(Save_Special_Msg_Dto specialMsg){
        SpecialMsg specialMsg1=new SpecialMsg();
        Optional<B_Basic_Info> basicInfo;
        basicInfo=b_basic_info_repository.findById(specialMsg.getBabyNum());

        if( basicInfo.isPresent()){

            specialMsg1.setBabyNum(basicInfo.get());
        }
        specialMsg1.setMsg_Date(specialMsg.getMsg_Date());
        specialMsg1.setMsg_Topic(specialMsg.getMsg_Topic());
        specialMsg1.setMsg_Content(specialMsg.getMsg_Content());
        specialMsg1.setMsg_Priority(specialMsg.getMsg_Priority());
        special_service_repository.save(specialMsg1);

    }

    @Override
    public List<Save_Special_Msg_Dto> getSpecialMsg(String babyNum){

        Optional<B_Basic_Info> b_basic_info=b_basic_info_repository.findById(babyNum);
        List<SpecialMsg> specialMsgs=null;
        List<Save_Special_Msg_Dto> saveSpecialMsgDtos=new ArrayList<>();


        if(b_basic_info.isPresent()){
            specialMsgs= special_service_repository.findByBabyNum(b_basic_info.get());
        }

        assert  specialMsgs !=null;
        for(SpecialMsg specialMsg: specialMsgs){
            Save_Special_Msg_Dto save_special_msg_dto=new Save_Special_Msg_Dto();
            save_special_msg_dto.setMsg_Date(specialMsg.getMsg_Date());
            save_special_msg_dto.setBabyNum(specialMsg.getBabyNum().getB_Reg_Num());
            save_special_msg_dto.setMsg_Content(specialMsg.getMsg_Content());
            save_special_msg_dto.setMsg_Priority(specialMsg.getMsg_Priority());
            save_special_msg_dto.setMsg_Topic(specialMsg.getMsg_Topic());
            saveSpecialMsgDtos.add(save_special_msg_dto);
        }
        return saveSpecialMsgDtos;
    }
}
