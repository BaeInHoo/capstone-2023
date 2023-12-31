package com.example.demo.domain.dto;

import lombok.*;

/*
 * created on 2023/11/01
 * */
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private String user_id;
    private String name;
    private String ph_no;
    private String zip_code;
    private String user_add;
    private String email;
    private String pwd;
}
