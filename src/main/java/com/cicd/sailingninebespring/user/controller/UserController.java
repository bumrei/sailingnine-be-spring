package com.cicd.sailingninebespring.user.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {
    // GET 유저 조회 - /api/
    @GetMapping("/hello/haha")
    public void hello() {
        System.out.println("hahaha");
    }
    // POST 유저 등록
}
