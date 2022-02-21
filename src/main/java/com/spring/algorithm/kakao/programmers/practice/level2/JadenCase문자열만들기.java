package com.spring.algorithm.kakao.programmers.practice.level2;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.HashSet;

@Service("JadenCase문자열만들기")
public class JadenCase문자열만들기 extends AbstractAlgorithm {

    private String s;

    public JadenCase문자열만들기() {
        this.s = "aaaaa  aaa ";
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        StringBuilder answer = new StringBuilder();
        for (String word : s.split(" ")) {
            if (word.length() != 0 && Character.isLetter(word.charAt(0))) {
                answer.append(String.valueOf(word.charAt(0)).toUpperCase()).append(word.substring(1).toLowerCase());
            } else answer.append(word.toLowerCase());
            answer.append(" ");
        }

        System.out.println(answer.length() == s.length() ? answer.substring(0, answer.length()) : answer.substring(0, answer.length() - 1));
    }
}