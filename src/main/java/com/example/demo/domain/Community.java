package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;

/*
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

    @Column(name = "user_id")
    public String user_id;

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
