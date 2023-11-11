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

    @Id
    @JoinColumn(name = "BOARD_NO")
    @ManyToOne
    public Community community;

    @Id
    @JoinColumn(name = "USER_ID")
    @ManyToOne
    private User user;

    @NotEmpty
    private String chat_text;
}
