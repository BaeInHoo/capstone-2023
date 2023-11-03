package com.example.demo.domain;

import com.example.demo.security.SecurityConfig;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    public void create() {

        User user = User.builder()
                .user_id("10004")
                .name("Bob")
                .ph_no("010-2222-3333")
                .zip_code("12345")
                .user_add("Seoul")
                .email("Bob@gmail.com")
                .pwd("1234")
                .kakao("#$@dsfsef")
                .build();

        assertThat(user.getUser_id());
        assertThat(user.getName());
        assertThat(user.getUser_add());

    }
}