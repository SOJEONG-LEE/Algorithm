package com.spring.algorithm.kakao.programmers.practice.level1;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

@Service("수박수박수박수박수박수")
public class 수박수박수박수박수박수 extends AbstractAlgorithm {

    private int n;

    public 수박수박수박수박수박수() {
        this.n = 4;
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        StringBuilder sb = new StringBuilder();
        String answer = "";

        for (int i = 0; i <= n / 10; i++) {
            sb.append("수박수박수박수박수박");
        }

        answer = sb.substring(0, n);

        System.out.println(answer);

    }

}
