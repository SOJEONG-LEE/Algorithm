package com.spring.algorithm.kakao.programmers.practice.level1;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Comparator;

@Service("문자열내림차순으로배치하기")
public class 문자열내림차순으로배치하기 extends AbstractAlgorithm {

    private String s;

    public 문자열내림차순으로배치하기() {
        this.s = "Zbcdefg";
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        StringBuilder answer = new StringBuilder();
        Arrays.stream(s.split("")).sorted(Comparator.reverseOrder()).forEach(letter -> answer.append(letter));

        System.out.println(answer.toString());
    }
}