package com.spring.algorithm.kakao.programmers.practice.level1;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service("x만큼간격이있는n개의숫자")
public class x만큼간격이있는n개의숫자 extends AbstractAlgorithm {

    private int x;
    private int n;

    public x만큼간격이있는n개의숫자() {
        this.x = 2;
        this.n = 5;
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        long[] answer = new long[n];
        answer[0] = x;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + x;
        }

        System.out.println(answer);
    }
}
