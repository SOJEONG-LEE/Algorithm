package com.spring.algorithm.kakao.programmers.practice;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service("나누어떨어지는숫자배열")
public class 나누어떨어지는숫자배열 extends AbstractAlgorithm {

    private int[] arr;
    private int divisor;

    public 나누어떨어지는숫자배열() {
        this.arr = new int[]{-5, 9, 7, 10};
        this.divisor = 5;
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        int[] answer = Arrays.stream(arr).sorted().filter(f -> f % divisor == 0).toArray();
        answer = answer.length != 0 ? answer : new int[]{-1};
        System.out.println(answer);
    }
}
