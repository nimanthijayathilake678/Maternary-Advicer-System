package group13.MaternaryAdvicerSystem.Service.Login;

import group13.MaternaryAdvicerSystem.Model.Domain.B_Nutritions;
import group13.MaternaryAdvicerSystem.Model.Dto.Chat_Forum_Dto;

import java.util.List;

import group13.MaternaryAdvicerSystem.Model.Dto.Chat_Forum_Dto;
import group13.MaternaryAdvicerSystem.Model.Domain.B_Basic_Info;
import group13.MaternaryAdvicerSystem.Model.Domain.Chat_Forum;
import group13.MaternaryAdvicerSystem.Model.Dto.Save_BabyNutrients_Dto;
import group13.MaternaryAdvicerSystem.Repository.Login.B_Basic_Info_Repository;
import group13.MaternaryAdvicerSystem.Repository.Login.B_Nutritions_Repository;
import group13.MaternaryAdvicerSystem.Repository.Login.Chat_Forum_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service

public class Chat_Forum_Service_Impl  implements Chat_Forum_Service{
    @Autowired
    private Chat_Forum_Repository chat_forum_repository;
    @Override
    public void savechat(Chat_Forum_Dto chat){

        Chat_Forum chat_forum=new Chat_Forum();

        chat_forum.setMsg_Date(chat.getMsg_Date());
        chat_forum.setRegNum(chat.getRegNum());
        chat_forum.setMsg_Content(chat.getMsg_Content());
        chat_forum_repository.save(chat_forum);

    }
    @Override
    public List<Chat_Forum_Dto> getchat(){

        List<Chat_Forum> chatForums = chat_forum_repository.findAll();


        List<Chat_Forum_Dto> chatForumDtos = new ArrayList<>();


        if (chatForums != null) {
            // Iterate over chatForums and convert to Chat_Forum_Dto
            for (Chat_Forum msg : chatForums) {
                Chat_Forum_Dto savechat = new Chat_Forum_Dto();
                savechat.setMsg_Content(msg.getMsg_Content());
                savechat.setMsg_Date(msg.getMsg_Date());
                savechat.setRegNum(msg.getRegNum());
                chatForumDtos.add(savechat);
            }
        }

        return chatForumDtos;

    }
}
