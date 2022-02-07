package com.spring.algorithm.kakao.programmers.practice.level1;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

@Service("없는숫자더하기")
public class 없는숫자더하기 extends AbstractAlgorithm {

    private int[] numbers;

    public 없는숫자더하기() {
        this.numbers = new int[]{1,2,3,4,6,7,8,0};
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        int answer = (0+9)*(9-0+1)/2;
        for(int num : numbers){
            answer -= num;
        }
        System.out.println(answer);
    }
}
