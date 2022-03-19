package com.spring.algorithm.kakao.programmers.practice.level1;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service("정수제곱근판별")
public class 정수제곱근판별 extends AbstractAlgorithm {

    private long n;

    public 정수제곱근판별() {
        this.n = 121;
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        long answer = 0;
        double base = Math.sqrt(n);
        if (base % 1 > 0) {
            answer = -1;
        } else answer = (long) Math.pow(base + 1, 2);
        System.out.println(answer);
    }
}
