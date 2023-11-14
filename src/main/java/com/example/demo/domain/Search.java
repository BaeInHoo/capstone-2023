package com.example.demo.domain;

import jakarta.persistence.*;
import lombok.*;

/*
* Search Table을 구성한다
* PK는 @param search_no 이다
* @param law_no 와 @param user_id 는
* 각각 Law 테이블, User 테이블과 비식별자 관게를 가진다
*
* created on 2023/11/11
*  */
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Search {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String search_no;

    @Column(name = "LAW_NO")
    private String law_no;

    @Column(name = "USER_ID")
    private String user_id;

    private String law_search;
}
