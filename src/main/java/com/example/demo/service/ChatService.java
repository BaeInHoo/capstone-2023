package com.example.demo.service;

import com.example.demo.domain.Chat;
import com.example.demo.domain.Community;
import com.example.demo.domain.User;
import com.example.demo.repository.ChatRepository;
import com.example.demo.repository.CommunityRepository;
import com.example.demo.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/*
 * created on 2023/11/03
 * */
@Service
@Slf4j
public class ChatService {

    @Autowired
    private ChatRepository chatRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CommunityRepository communityRepository;

    @Transactional
    public Chat getChat(String user_id, Long board_no, String chat_no) {
        User user = userRepository.findById(user_id)
                .orElseThrow(() -> new RuntimeException("로그인하지 않았습니다."));
        Community community = communityRepository.findById(board_no)
                .orElseThrow(() -> new RuntimeException("게시글이 존재하지 않습니다"));
        Chat chat = chatRepository.findById(chat_no)
                .orElseThrow(() -> new RuntimeException("댓글이 존재하지 않습니다"));

        log.info("user -> {}", user);
        log.info("community -> {}", community);
        log.info("chat -> {}", chat);

        return chat;
    }

    @Transactional
    public Chat setChat(String chat_no) {

        List<Chat> chatList = new ArrayList<Chat>();

        return chatRepository.findAll(chatList);
    }

    @Transactional
    public void deleteChat(String chat_no) {
        Chat chat = chatRepository.findById(chat_no).orElseThrow(() -> new RuntimeException("이미 삭제된 댓글 입니다"));

        chatRepository.deleteById(chat_no);

        chatRepository.save(chat);
    }
}
