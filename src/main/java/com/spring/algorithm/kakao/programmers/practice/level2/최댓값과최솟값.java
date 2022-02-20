package com.spring.algorithm.kakao.programmers.practice.level2;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service("최댓값과최솟값")
public class 최댓값과최솟값 extends AbstractAlgorithm {

    private String s;

    public 최댓값과최솟값() {
        this.s = "-1 -2 -3 -4";
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        StringBuilder answer = new StringBuilder();
        int[] num = Arrays.stream(s.split(" ")).mapToInt(m -> Integer.valueOf(m)).sorted().toArray();
        answer.append(num[0]).append(" ").append(num[num.length-1]);
        System.out.println(answer.toString());
    }
}
