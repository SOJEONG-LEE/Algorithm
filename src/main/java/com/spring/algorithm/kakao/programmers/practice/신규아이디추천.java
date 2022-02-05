package com.spring.algorithm.kakao.programmers.practice;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service("신규아이디추천")
public class 신규아이디추천 extends AbstractAlgorithm {

    private String new_id;

    public 신규아이디추천() {
        //this.new_id = "...!@BaT#*..y.abcdefghijklm";
        this.new_id = "z-+.^.";
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        String answer;
        char[] newIdArray = new_id.toCharArray();
        //1단계, 2단계
        answer = new_id.toLowerCase();
        answer = answer.replaceAll("[^a-z0-9-_.]", "");
        //3단계
        answer = answer.replaceAll("\\.{2,}", ".");
        //4단계
        if (answer.startsWith(".")) answer = answer.substring(1);
        if (answer.endsWith(".")) answer = answer.substring(0, answer.length() - 1);
        //5단계
        if (answer.length() == 0) answer = "aaa";
        //6단계
        if (answer.length() > 15) answer = answer.substring(0, 15);
        if (answer.endsWith(".")) answer = answer.substring(0, answer.length() - 1);
        //7단계
        while (answer.length() < 3) {
            answer = answer.concat(answer.substring(answer.length() - 1));
        }
        System.out.println(answer);
    }
}
