package com.spring.algorithm.kakao.programmers.practice.level1;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

@Service("자연수뒤집어배열로만들기")
public class 자연수뒤집어배열로만들기 extends AbstractAlgorithm {

    private long n;

    public 자연수뒤집어배열로만들기() {
        this.n = 12345;
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        String strNum = String.valueOf(n);
        int lenght = strNum.length();
        int[] answer = new int[lenght];
        for(char num : strNum.toCharArray()){
            answer[--lenght] = Integer.valueOf(String.valueOf(num));
        }

        System.out.println(answer);
    }
}
