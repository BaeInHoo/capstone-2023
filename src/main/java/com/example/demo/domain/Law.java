package com.example.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.*;

/*
* Law Table을 구성한다
* PK는 law_no 이다
*
* created on 2023/11/11
* */
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Law {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String law_no;

    private String law_text;

    @NotNull
    private Integer law_views;

}
