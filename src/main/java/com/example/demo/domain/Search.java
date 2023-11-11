package com.example.demo.domain;

import jakarta.persistence.*;
import lombok.*;

/*
* created on 2023/11/11
*  */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Search {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String search_no;

    @Id
    @Column(name = "LAW_NO")
    private

}
