package com.example.demo.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

/*
 * Keyword Table을 구성한다.
 * PK는 key_no 이며 최대 4자리까지 입력가능하다
 *
 * created on 2023/11/11
 * */
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Keyword {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Size(max = 4)
    private String key_no;

    /*
     * @param keyword_text는 Column이 keyword이나
     * 추후에 Keyword class를 이용시에 중복되어 개발자가 혼동할 수 있어
     * keyward -> keyword_text로 사용한다
    *  */
    @NotNull
    @Column(name = "KEYWORD")
    private String keyword_text;
}
