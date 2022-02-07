package com.spring.algorithm.kakao.programmers.practice.level1;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

@Service("두정수사이의합")
public class 두정수사이의합 extends AbstractAlgorithm {

    private int a;
    private int b;

    public 두정수사이의합() {
        this.a = 3;
        this.b = 5;
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        int min=0;
        int max=0;
        if(a == b) System.out.println(a);
        else if(a > b){
            max = a;
            min = b;
        }else{
            max = b;
            min =a;
        }
        int answer = 0;
        for(int i=min; i<=max; i++){
            answer += i;
        }
        System.out.println(answer);

    }


}
