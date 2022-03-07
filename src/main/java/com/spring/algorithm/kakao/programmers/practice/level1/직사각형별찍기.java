package com.spring.algorithm.kakao.programmers.practice.level1;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service("직사각형별찍기")
public class 직사각형별찍기 extends AbstractAlgorithm {


    public 직사각형별찍기() {
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        String answer = "";
        for (int i = 0; i < 10; i++) {
            sb.append("****************************************************************************************************");
        }
        answer = sb.substring(0, a);
        for (int i = 0; i < b; i++) {
            System.out.println(answer);
        }
    }
}
