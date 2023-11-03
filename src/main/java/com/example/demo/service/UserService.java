package com.example.demo.service;

import com.example.demo.controller.dto.UserDTO;
import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/*
* created on 2023/11/01
* */
@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;


    /* 유저 정보 유저 아이디 통해 받아오기 */
    @Transactional(readOnly = true)
    public User getUser(String id) {

        User user = userRepository.findById(id).orElse(null);

        log.info("user : {}", user);

        return user;
    }

    @Transactional
    public User getPassword(String pwd) {

        User user = (User) userRepository.findByPasswd(pwd).orElseThrow(() -> new RuntimeException("비밀번호가 존재하지 않습니다"));

        return user;
    }

    @Transactional
    public void put(User user) {
        userRepository.save(user);
    }

    @Transactional
    public void update(String id, UserDTO userDto) {
        User userAtDb = userRepository.findById(id).orElseThrow(() -> new RuntimeException("아이디가 존재하지 않습니다."));

        if (!userAtDb.getName().equals(userDto.getName())) {
            throw new RuntimeException("이름이 다릅니다");
        }

        userAtDb.setName(userDto.getName());
        userAtDb.setPh_no(userDto.getPh_no());
        userAtDb.setZip_code(userDto.getZip_code());
        userAtDb.setEmail(userDto.getEmail());
        /* 비밀 번호 넣을 자리 */

        userRepository.save(userAtDb);

    }

    @Transactional
    public void delete(String id) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("아이디가 존재하지 않습니다"));

        userRepository.deleteById(id);

        userRepository.save(user);
    }
}
