package group13.MaternaryAdvicerSystem.Controller;
import group13.MaternaryAdvicerSystem.Model.Domain.Chat_Forum;
import group13.MaternaryAdvicerSystem.Model.Dto.Chat_Forum_Dto;

import group13.MaternaryAdvicerSystem.Model.Dto.Save_NewBorn_Helath_Dto;
import group13.MaternaryAdvicerSystem.Service.Login.Chat_Forum_Service_Impl;
import group13.MaternaryAdvicerSystem.Service.Login.B_Nutritions_Service_Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chatforum")
public class Chat_Forum_Controller {

    @Autowired
    private Chat_Forum_Service_Impl chatForumService;


    @PostMapping("/addchat")
    public String add(@RequestBody Chat_Forum_Dto chat){

        chatForumService.savechat(chat);
        return "new chat  is added";
    }

    @GetMapping("/getmsg")
    public List<Chat_Forum_Dto> getchat(){
        return chatForumService.getchat();
    }
}
