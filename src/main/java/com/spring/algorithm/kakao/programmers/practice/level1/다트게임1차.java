package com.spring.algorithm.kakao.programmers.practice.level1;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service("1차다트게임")
public class 다트게임1차 extends AbstractAlgorithm {

    private String dartResult;

    public 다트게임1차() {
        this.dartResult = "1D#2S*3S";
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        int[] score = new int[3];
        int check = 0;
        String[] dartArray = dartResult.split("");
        for (int i = 0; i < dartResult.length(); i++) {
            int num = Integer.valueOf(dartArray[i]);
            if (num == 1 && dartArray[i + 1].equals("0")) {
                num = 10; i++;
            }
            String letter = dartArray[++i];
            if (letter.equals("D")) num = (int) Math.pow(num, 2);
            else if (letter.equals("T")) num = (int) Math.pow(num, 3);

            if (dartResult.length() - 1 > i) {
                if (dartArray[i + 1].equals("*")) {
                    num *= 2;
                    if (check != 0) score[check - 1] *= 2;
                    i++;
                } else if (dartArray[i + 1].equals("#")) {
                    num *= -1;
                    i++;
                }
            }
            score[check] = num;
            check++;
        }

        System.out.println(Arrays.stream(score).sum());

    }
}
