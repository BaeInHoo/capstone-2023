package com.example.demo.domain.mapping;

import jakarta.persistence.*;
import lombok.*;

/*
 * created on 2023/11/11
 * */
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class BoardBookmark {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long b_like_id;

    @Id
    @Column(name = "USER_ID")
    private String user_id;

    @Id
    @Column(name = "BOARD_NO")
    private Long board_no;
}
