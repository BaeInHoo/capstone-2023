package com.example.demo.controller;

import com.example.demo.domain.dto.UserDTO;
import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/*
 * created on 2023/11/01
 * */
@RestController
@RequestMapping(value = "/users")
@Slf4j
@Controller
public class UserController {

    private final UserService userService;

    private final UserRepository userRepository;

    BCryptPasswordEncoder passwordEncoder;

    @Autowired
    public UserController(UserService userService, UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }

    @GetMapping("/{id}")
    public User getUser(@RequestParam(required = false) String id) {
        return userService.getUser(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void postUser(@RequestBody User user) {
        userService.put(user);

        log.info("person -> {}", userRepository.findAll());
    }

    @PutMapping
    public void updateUser(@PathVariable String id, @RequestBody UserDTO user) {
        userService.update(id, user);

        log.info("user -> {}", userRepository.findAll());
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id) {
        userService.delete(id);

        log.info("person -> {}", userRepository.findAll());
    }

    @RequestMapping(value = "/secu", method = RequestMethod.GET)
    public void secu() {
        User user = new User();

        String rawPassword = String.valueOf(userService.getPassword(user.getPwd()));                //인코딩 전 메서드
        String encodePassword;                        // 똑같은 비밀번호 데이터를 encdoe()메서드를 사용했을 때 동일한 인코딩된 값이 나오는지 확인하기 위해 추가

        encodePassword = passwordEncoder.encode(rawPassword);

        // 인코딩된 패스워드 출력
        log.info("encodePassword : {}" ,encodePassword);

    }

}
