package com.example.demo.domain.mapping;

import com.example.demo.domain.AccidentResult;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.web.bind.annotation.Mapping;

/*
 * created on 2023/11/03
 * */
@Entity
public class AccidentLawMapping {

    @Id
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ACC_NO")
    private AccidentResult accResult;

    @Column(name = "LAW_NO")
    private String law_no;
}
