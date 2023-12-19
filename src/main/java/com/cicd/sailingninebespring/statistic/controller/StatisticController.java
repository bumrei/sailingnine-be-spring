package com.cicd.sailingninebespring.statistic.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/statistic")
@RequiredArgsConstructor
public class StatisticController {

    // GET 통계 매출
    @GetMapping("/api/sales")
    public void salesStatistic() {
        System.out.println("통계 매출");
    }

    // GET 통계 검색량
    @GetMapping("/api/search/amounts")
    public void searchStatistic() {
        System.out.println("통계 검색량");
    }

    // GET 통계 좋아요.
    @GetMapping("/api/like/amounts")
    public void likeStatistic() {
        System.out.println("통계 좋아요.");
    }

}
