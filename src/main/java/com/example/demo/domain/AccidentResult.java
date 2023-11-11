package com.example.demo.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
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
