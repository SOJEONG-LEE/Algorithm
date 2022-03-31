package com.spring.algorithm.sw.expert.academy.problem;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service("스탬프찍기")
public class 스탬프찍기 extends AbstractAlgorithm {


    public 스탬프찍기() {
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        StringBuilder answer = new StringBuilder();
        for (int i = 1; i <= T; i++) {
            answer.append("#");
        }
        System.out.println(answer);
    }


}
