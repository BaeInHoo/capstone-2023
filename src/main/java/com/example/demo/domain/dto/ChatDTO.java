package com.example.demo.domain.dto;

import com.example.demo.domain.Community;
import com.example.demo.domain.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

/*
 * created on 2023/11/01
 * */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ChatDTO {
    private String chat_no;
    private List<Community> communities;
    private List<User> users;
    private String chat_text;
}
