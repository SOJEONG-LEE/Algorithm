package com.spring.algorithm.kakao.programmers.practice.level1;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

@Service("짝수와홀수")
public class 짝수와홀수 extends AbstractAlgorithm {

    private int num;

    public 짝수와홀수() {
        this.num = 3;
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        if (num % 2 == 0) System.out.println("Even");
        else System.out.println("Odd");
    }
}