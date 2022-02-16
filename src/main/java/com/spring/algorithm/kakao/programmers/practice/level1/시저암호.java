package com.spring.algorithm.kakao.programmers.practice.level1;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.*;


@Service("시저암호")
public class 시저암호 extends AbstractAlgorithm {

    private String s;
    private int n;

    public 시저암호() {
        this.s = "a B z";
        this.n = 4;
    }


    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        StringBuilder answer = new StringBuilder();
        char[] words = s.toCharArray();
        for (char word : words) {
            char nextWord = word;
            if(Character.isLetter(word)) nextWord += n;
            if((word >= 'a' && nextWord > 'z') || (word >= 'A' && word <= 'Z' && nextWord > 'Z')) nextWord -= 26;
            answer.append(nextWord);
        }

        System.out.println(answer.toString());
    }
}
