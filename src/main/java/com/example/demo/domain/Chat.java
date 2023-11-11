package com.example.demo.domain;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;

/*
 * created on 2023/11/03
 * */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Chat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String chat_no;

    @NotNull
    @Column(name = "board_id")
    public String board_id;

    @NotNull
    @Column(name = "user_id")
    private String user_id;

    @NotEmpty
    private String chat_text;
}
