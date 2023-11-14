package com.example.demo.domain.dto;

import lombok.*;

import java.time.LocalDateTime;

/*
 * created on 2023/11/01
 * */
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CommunityDTO {

    private LocalDateTime up_date;
    private String cmt_text;
    private Integer views;
    private String at_file;
}
