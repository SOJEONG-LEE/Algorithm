package com.spring.algorithm.kakao.programmers.practice.level1;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.stream.Collectors;


@Service("최대공약수와최소공배수")
public class 최대공약수와최소공배수 extends AbstractAlgorithm {

    private int n;
    private int m;

    public 최대공약수와최소공배수() {
        this.n = 3;
        this.m = 12;
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        int[] answer = new int[2];
        if (n >= m) answer[0] = getGCD(n, m);
        else answer[0] = getGCD(m, n);

        answer[1] = n * m / answer[0];

        System.out.println(Arrays.stream(answer).boxed().collect(Collectors.toList()));

    }

    public int getGCD(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }

        return getGCD(num2, num1 % num2);
    }
}
