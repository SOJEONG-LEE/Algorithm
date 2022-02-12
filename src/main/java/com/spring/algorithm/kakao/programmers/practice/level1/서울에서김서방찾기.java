package com.spring.algorithm.kakao.programmers.practice.level1;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

@Service("서울에서김서방찾기")
public class 서울에서김서방찾기 extends AbstractAlgorithm {

    private String[] seoul;

    public 서울에서김서방찾기() {
        this.seoul = new String[]{"Jane", "Kim"};
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        String answer = "김서방은 ";
        for (int i = 0; i < seoul.length; i++) {
            if(seoul[i].equals("Kim")) System.out.println(answer.concat(String.valueOf(i)).concat("에 있다"));
        }
    }
}