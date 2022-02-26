package com.spring.algorithm.kakao.programmers.practice.level1;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service("이상한문자만들기")
public class 이상한문자만들기 extends AbstractAlgorithm {

    private String s;

    public 이상한문자만들기() {
        this.s = "hello";
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        StringBuilder answer = new StringBuilder();
        for (String word : s.split(" ", -1)) {
            char[] letter = word.toCharArray();
            for (int i = 0; i < letter.length; i++) {
                if (i % 2 == 0) answer.append(Character.toUpperCase(letter[i]));
                else answer.append(Character.toLowerCase(letter[i]));
            }
            answer.append(" ");
        }
        System.out.println(answer.substring(0, answer.length() - 1));
    }
}
