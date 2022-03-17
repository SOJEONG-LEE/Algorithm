package com.spring.algorithm.kakao.programmers.practice.level1;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        List<String> list = new ArrayList<>();
        for (String letter : s.split("")) {
            list.add(letter);
        }
        List<String> list2 = list.stream().sorted().collect(Collectors.toList());

        System.out.println(list2);
    }
}