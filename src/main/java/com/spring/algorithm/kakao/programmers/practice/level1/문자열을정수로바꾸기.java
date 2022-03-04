package com.spring.algorithm.kakao.programmers.practice.level1;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

@Service("문자열을정수로바꾸기")
public class 문자열을정수로바꾸기 extends AbstractAlgorithm {

    private String s;

    public 문자열을정수로바꾸기() {
        this.s = "-1234";
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        int answer = 0;
        if (s.startsWith("-")) {
            answer = Integer.valueOf(s.substring(1)) * -1;
        } else {
            answer = Integer.valueOf(s.startsWith("+") ? s.substring(1) : s);
        }

        System.out.println(answer);
    }
}
