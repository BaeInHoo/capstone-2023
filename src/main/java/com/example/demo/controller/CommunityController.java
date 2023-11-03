package com.example.demo.controller;

import com.example.demo.domain.Community;
import com.example.demo.repository.CommunityRepository;
import com.example.demo.service.CommunityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
 * created on 2023/11/01
 * */
@RestController
@RequestMapping(value = "/community")
@Slf4j
public class CommunityController {

    @Autowired
    private CommunityService communityService;

    @Autowired
    private CommunityRepository communityRepository;

    @GetMapping("/{id}")
    public String getCommunity(@RequestParam(required = false, defaultValue = "1") Long board_no) {
        return communityService.getCommunity(board_no).getUser_id();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void postCommunity(@RequestBody Community community) {
        communityService.put(community);

        log.info("person -> {}", communityRepository.findAll());
    }

    @PutMapping
    public void updateCommunity(@PathVariable Long board_no, @RequestBody List<Community> community) {
        communityService.bulkUpdate(board_no, community);

        log.info("user -> {}", communityRepository.findAll());
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long board_no) {
        communityService.delete(board_no);

        log.info("person -> {}", communityRepository.findAll());
    }
}
