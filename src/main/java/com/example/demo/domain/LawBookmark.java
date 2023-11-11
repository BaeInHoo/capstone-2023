package com.example.demo.domain;

import jakarta.persistence.*;
import lombok.*;

/*
 * created on 2023/11/11
 * */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class LawBookmark {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long l_like_id;

    @Id
    @Column(name = "USER_ID")
    private String user_id;

    @Id
    @Column(name = "LAW_NO")
    private String law_no;
}
