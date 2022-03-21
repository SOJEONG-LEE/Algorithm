package com.spring.algorithm.kakao.programmers.practice.level1;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

@Service("3진법뒤집기")
public class 삼진법뒤집기 extends AbstractAlgorithm {

    private int n;

    public 삼진법뒤집기() {
        this.n = 45;
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        int remainder = n;
        while (remainder >= 3) {
            sb.append(remainder % 3);
            remainder /= 3;
        }
        sb.append(remainder);

        char[] array = sb.toString().toCharArray();
        for (int i = 1; i <= sb.length(); i++) {
            answer += (Integer.valueOf(String.valueOf(array[i - 1])) * Math.pow(3, sb.length() - i));
        }
        System.out.println(answer);
    }
}
