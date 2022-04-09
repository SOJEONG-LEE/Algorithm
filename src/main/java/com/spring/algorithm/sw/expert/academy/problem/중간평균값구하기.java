package com.spring.algorithm.sw.expert.academy.problem;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service("중간평균값구하기")
public class 중간평균값구하기 extends AbstractAlgorithm {

    public 중간평균값구하기() {
        /*
3
3 17 1 39 8 41 2 32 99 2
22 8 5 123 7 2 63 7 3 46
6 63 2 3 58 76 21 33 8 1
         */
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int avg = 0;
            int max = 0;
            int min = 10000;
            for (int i = 1; i <= 10; i++) {
                int num = sc.nextInt();
                avg += num;
                if (num > max) max = num;
                if (num < min) min = num;
            }
            avg -= (max + min);
            System.out.println("#" + test_case + " " + (int) Math.round(avg / 8d));
        }
    }


}
