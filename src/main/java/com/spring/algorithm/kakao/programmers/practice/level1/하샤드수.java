package com.spring.algorithm.kakao.programmers.practice.level1;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service("하샤드수")
public class 하샤드수 extends AbstractAlgorithm {

    private int x;

    public 하샤드수() {
        this.x = 12;
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        boolean answer = Boolean.TRUE;
        int sum = 0;

        for (String num : String.valueOf(x).split("")) {
            sum += Integer.valueOf(num);
        }

        if (x % sum != 0) answer = Boolean.FALSE;

        System.out.println(answer);
    }
}
