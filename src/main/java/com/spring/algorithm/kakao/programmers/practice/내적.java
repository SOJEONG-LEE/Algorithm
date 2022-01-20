package com.spring.algorithm.kakao.programmers.practice;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

@Service("내적")
public class 내적 extends AbstractAlgorithm {

    private int[] a;
    private int[] b;

    public 내적() {
        this.a = new int[]{-1 , 0, 1};
        this.b = new int[]{1, 0, -1};
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        int answer = 0;
        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }
        System.out.println(answer);
    }
}
