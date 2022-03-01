package com.spring.algorithm.kakao.programmers.practice.level1;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

@Service("문자열내p와y의개수")
public class 문자열내p와y의개수 extends AbstractAlgorithm {

    private String s;

    public 문자열내p와y의개수() {
        this.s = "pPoooyY";
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        boolean answer = Boolean.FALSE;
        int countP = 0;
        int countY = 0;
        for (char letter : s.toLowerCase().toCharArray()) {
            if (letter == 'p') countP++;
            else if (letter == 'y') countY++;
        }

        if (countP == countY) answer = Boolean.TRUE;

            System.out.println(answer);
    }
}