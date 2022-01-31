package com.spring.algorithm.kakao.programmers.practice;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

@Service("부족한금액계산하기")
public class 부족한금액계산하기 extends AbstractAlgorithm {

    private int price;
    private int money;
    private int count;

    public 부족한금액계산하기() {
        this.price = 3;
        this.money = 20;
        this.count = 4;
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        long answer = ((long) (1+count)*count/2*price) - money;
        answer = answer>=0 ? answer : 0;

        System.out.println(answer);
    }
}
