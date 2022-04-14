package com.spring.algorithm.sw.expert.academy.problem;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service("시각덧셈")
public class 시각덧셈 extends AbstractAlgorithm {

    public 시각덧셈() {
        /*
3
3 17 1 39
8 22 5 10
6 53 2 12
         */
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int hour = sc.nextInt();
            int minute = sc.nextInt();
            hour += sc.nextInt();
            minute += sc.nextInt();
            hour += (minute / 60);
            if (hour > 12) hour -= 12;
            System.out.println("#" + test_case + " " + hour + " " + minute % 60);
        }

    }


}
