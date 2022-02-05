package com.spring.algorithm.kakao.programmers.practice;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service("숫자문자열과영단어")
public class 숫자문자열과영단어 extends AbstractAlgorithm {

    private String s;

    public 숫자문자열과영단어() {
        this.s = "one4seveneight";
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        StringBuilder answer = new StringBuilder();
        List<String> englishWordList = Arrays.asList("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine");
        StringBuilder sb = new StringBuilder();
        for (char word : s.toCharArray()) {
            if (Character.isDigit(word)) {
                answer.append(word);
            } else if (englishWordList.contains(sb.append(word).toString())) {
                answer.append(englishWordList.indexOf(sb.toString()));
                sb.delete(0, sb.length());
            }
        }
        System.out.println(Integer.valueOf(answer.toString()));
    }
}
