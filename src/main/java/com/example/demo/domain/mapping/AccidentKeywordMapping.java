package com.example.demo.domain.mapping;

import com.example.demo.domain.AccidentResult;
import com.example.demo.domain.Keyword;
import jakarta.persistence.*;

/*
 * created on 2023/11/11
 * */
@Entity
public class AccidentKeywordMapping {

    @Id
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ACC_NO")
    private AccidentResult accResult;

    @Id
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "KEY_NO")
    private Keyword keyword;
}
