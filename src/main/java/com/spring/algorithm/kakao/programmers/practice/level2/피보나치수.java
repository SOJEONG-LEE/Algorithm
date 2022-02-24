package com.spring.algorithm.kakao.programmers.practice.level2;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service("피보나치수")
public class 피보나치수 extends AbstractAlgorithm {

    private int n;

    public 피보나치수() {
        this.n = 5;
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        List<Integer> answer = new ArrayList<>(Arrays.asList(0, 1));
        for (int i = 2; i <= n; i++) {
            answer.add((answer.get(i - 2) + answer.get(i - 1)) % 1234567);
        }

        System.out.println(answer.get(n));
    }
}