package com.spring.algorithm.kakao.programmers.practice;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

@Service("음양더하기")
public class 음양더하기 extends AbstractAlgorithm {

    private int[] absolutes;
    private boolean[] signs;

    public 음양더하기() {
        this.absolutes = new int[]{4, 7, 12};
        this.signs = new boolean[]{true, false, true};
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            answer += signs[i] ? absolutes[i] : -1 * absolutes[i];
        }
        System.out.println(answer);
    }
}
