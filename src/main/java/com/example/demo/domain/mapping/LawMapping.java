package com.example.demo.domain.mapping;

import com.example.demo.domain.Keyword;
import com.example.demo.domain.Law;
import jakarta.persistence.*;
import lombok.*;

/*
 * created on 2023/11/03
 * */
@Entity
public class LawMapping {

    @Id
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "LAW_NO")
    private Law law;

    @Id
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "KEY_NO")
    private Keyword keyword;

}
