package com.example.demo.repository;

import com.example.demo.domain.Community;
import org.springframework.data.jpa.repository.JpaRepository;

/*
 * created on 2023/11/01
 * */
public interface CommunityRepository extends JpaRepository<Community, Long> {
}
