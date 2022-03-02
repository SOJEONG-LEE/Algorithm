package com.spring.algorithm.kakao.programmers.practice.level1;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

@Service("콜라츠추측")
public class 콜라츠추측 extends AbstractAlgorithm {

    private int num;

    public 콜라츠추측() {
        this.num = 6;
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        int answer = 0;
        long calculateNum = num;
        for (int i = 1; i <= 500; i++) {
            if (calculateNum == 1) break;
            if (calculateNum % 2 == 0) calculateNum /= 2;
            else calculateNum = calculateNum * 3 + 1;
            answer++;
        }
        if (calculateNum != 1) answer = -1;
        System.out.println(answer);
    }

    public void test2() {
        /*int answer = -1;
        long calculateNum = num;
        if (num == 1) return 0;
        for (int i = 1; i <= 500; i++) {
            if (calculateNum % 2 == 0) calculateNum /= 2;
            else calculateNum = calculateNum * 3 + 1;
            if (calculateNum == 1) return i;
        }
        if (calculateNum != 1) return answer;

        return answer;*/
    }
}
