package com.spring.algorithm.kakao.programmers.practice.level1;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

@Service("자릿수더하기")
public class 자릿수더하기 extends AbstractAlgorithm {

    private int n;

    public 자릿수더하기() {
        this.n = 123;
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        int answer = 0;
        for (char num : String.valueOf(n).toCharArray()) {
            answer += Integer.valueOf(Character.toString(num));
        }
        System.out.println(answer);
    }
}
