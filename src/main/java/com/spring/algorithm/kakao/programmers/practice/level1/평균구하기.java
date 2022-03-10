package com.spring.algorithm.kakao.programmers.practice.level1;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

@Service("평균구하기")
public class 평균구하기 extends AbstractAlgorithm {

    private int[] arr;

    public 평균구하기() {
        this.arr = new int[]{1, 2, 3, 4};
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        double answer = 0;
        for(int num : arr){
            answer += num;
        }
        answer /= arr.length;

        System.out.println(answer);
    }
}
