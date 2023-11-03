package com.example.demo.repository;

import com.example.demo.domain.Chat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/*
 * created on 2023/11/03
 * */
public interface ChatRepository extends JpaRepository<Chat, String> {
    Chat findAll(List<Chat> chatList);
}
