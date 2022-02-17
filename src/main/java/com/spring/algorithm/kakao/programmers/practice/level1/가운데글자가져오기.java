package com.spring.algorithm.kakao.programmers.practice.level1;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

@Service("가운데글자가져오기")
public class 가운데글자가져오기 extends AbstractAlgorithm {

    private String s;

    public 가운데글자가져오기() {
        this.s = "abcde";
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        String answer = "";
        int length = s.length();
        if (length % 2 == 0) answer = s.substring(length/2-1, length/2+1);
        else answer = s.substring(length/2, length/2+1);
        System.out.println(answer);
    }
}
