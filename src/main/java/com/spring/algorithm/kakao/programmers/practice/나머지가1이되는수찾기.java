package com.spring.algorithm.kakao.programmers.practice;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

@Service("나머지가1이되는수찾기")
public class 나머지가1이되는수찾기 extends AbstractAlgorithm {

    private int n;

    public 나머지가1이되는수찾기() {
        this.n = 12;
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        int answer = 0;
        for(int i=2; i<n; i++){
            if(n%i==1) System.out.println(i);
        }
        System.out.println(answer);
    }
}
