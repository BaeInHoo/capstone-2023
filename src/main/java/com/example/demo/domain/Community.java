package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;

/*
 * Community Table을 구성한다.
 * PK는 board_no 이며
 * @param user 는 User 테이블과 식별자 관게를 가지는 FK이다
 *
 * created on 2023/11/01
 * */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Community {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long board_no;

    @Id
    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "user_id")
//    public User user;

    private LocalDateTime up_date;

    private String cmt_text;

    @NotNull
    @NotEmpty
    private Integer views;

    private String at_file;

    @Transient
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    public boolean destroy;

}
