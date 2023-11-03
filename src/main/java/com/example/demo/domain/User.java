package com.example.demo.domain;

import com.example.demo.security.SecurityConfig;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/*
 * created on 2023/11/01
 * */
@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String user_id;

    @NotEmpty
    @Column(nullable = false)
    private String name;

    @NotNull
    private String ph_no;

    @NotEmpty
    @Max(5)
    private String zip_code;

    private String user_add;

    @NotNull
    private String email;

    @NotEmpty
    private String pwd;

    private String kakao;

}
