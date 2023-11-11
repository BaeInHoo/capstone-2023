package com.example.demo.service;

import com.example.demo.domain.Community;
import com.example.demo.repository.CommunityRepository;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/*
 * created on 2023/11/01
 * */
@Service
@Slf4j
public class CommunityService {

    @Autowired
    private CommunityRepository communityRepository;


    @Transactional(readOnly = true)
    public Community getCommunity(Long board_no) {

        Community community = communityRepository.findById(board_no).orElse(null);

        log.info("user : {}", community);

        return community;
    }

    @Transactional
    public void put(Community community) {
        communityRepository.save(community);
    }

    @Transactional
    public void bulkUpdate(Long board_no, @NotNull List<Community> communities) {
        for (Community community : communities) {
            update(board_no, community);
        }
    }

    private void update(Long board_no, Community community) {
        if (community.isDestroy()) {
            communityRepository.deleteById(community.getBoard_no());
            return;
        }
        community.setBoard_no(board_no);

    }

    @Transactional
    public void delete(Long board_no) {
        Community community = communityRepository.findById(board_no).orElseThrow(() -> new RuntimeException("아이디가 존재하지 않습니다"));

        communityRepository.deleteById(board_no);

        communityRepository.save(community);
    }
}
