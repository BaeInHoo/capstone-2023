package com.example.demo.repository;

import com.example.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/*
 * created on 2023/11/01
 * */
@Repository
public interface UserRepository extends JpaRepository<User, String> {
    <T> Optional<T> findByPasswd(String pwd);
}
