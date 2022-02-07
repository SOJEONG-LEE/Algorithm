package com.spring.algorithm.kakao.programmers.practice.level1;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

@Service("문자열다루기기본")
public class 문자열다루기기본 extends AbstractAlgorithm {

    private String s;

    public 문자열다루기기본() {
        this.s = "1234";
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        boolean answer = Boolean.TRUE;
        if(s.length() != 4 && s.length() !=6 ) System.out.println(Boolean.FALSE);
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) System.out.println(Boolean.FALSE);
        }
        System.out.println(answer);
    }
}
