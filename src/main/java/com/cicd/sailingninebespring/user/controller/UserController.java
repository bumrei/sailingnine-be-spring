package com.cicd.sailingninebespring.user.controller;

import com.cicd.sailingninebespring.user.domain.MemberDTO;
import com.cicd.sailingninebespring.user.entity.Member;
import com.cicd.sailingninebespring.user.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
public class UserController {

    private final MemberService memberService;

    // GET 유저 조회 - /api/
    @GetMapping("/hello/haha")
    public void hello() {
        System.out.println("hahaha");
    }
    // POST 유저 등록
    @PostMapping("/api/create/user")
    public Long createUser(@RequestBody MemberDTO member) {
        return memberService.createUser(member);
    }
}
