package com.spring.algorithm.kakao.programmers.practice.level2;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.PriorityQueue;

@Service("다음큰숫자")
public class 다음큰숫자 extends AbstractAlgorithm {

    private int n;

    public 다음큰숫자() {
        this.n = 78;
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        int answer = n + 1;
        int nCount = toBinary(n);
        while (true) {
            if (nCount == toBinary(answer)) break;
            else answer++;
        }
        System.out.println(answer);
    }

    public void test2() {
        int answer = n + 1;
        int nCount = Integer.toBinaryString(n).replaceAll("0", "").length();
        while (true) {
            if (nCount == Integer.toBinaryString(answer).replaceAll("0", "").length()) break;
            else answer++;
        }
        System.out.println(answer);
    }

    public int toBinary(int num) {
        int count = 0;
        String binary = Integer.toBinaryString(num);
        for(char c : binary.toCharArray()){
            if(c == '1') count++;
        }
        return count;
    }
}
