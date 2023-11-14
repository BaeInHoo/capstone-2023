package com.example.demo.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

/*
 * AccResult Table을 구성한다.
 * PK는 acc_no 이며
 * @param user 는 User 테이블과 식별자 관게를 가진다
 *
 * created on 2023/11/11
 * */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class AccidentResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String acc_no;

    @Id
    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    @NotNull
    private String accident;
}
