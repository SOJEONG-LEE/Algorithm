package com.spring.algorithm.kakao.programmers.practice.level1;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.time.LocalDate;


@Service("2016년")
public class 연습문제2016년 extends AbstractAlgorithm {

    private int a;
    private int b;

    public 연습문제2016년() {
        this.a = 5;
        this.b = 24;
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        LocalDate date = LocalDate.of(2016, a, b);
        System.out.println(date.getDayOfWeek().name().substring(0, 3));
    }
}
