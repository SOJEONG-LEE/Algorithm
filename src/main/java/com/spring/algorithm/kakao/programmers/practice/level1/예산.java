package com.spring.algorithm.kakao.programmers.practice.level1;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service("예산")
public class 예산 extends AbstractAlgorithm {

    private int[] d;
    private int budget;

    public 예산() {
        this.d = new int[]{1, 3, 2, 5, 4};
        this.budget = 9;
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        int answer = 0;
        Arrays.sort(d);
        for (int num : d) {
            budget -= num;
            if (budget < 0) break;
            answer++;
        }
        System.out.println(answer);
    }
}
