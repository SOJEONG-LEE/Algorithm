package com.spring.algorithm.sw.expert.academy.problem;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service("최대수구하기")
public class 최대수구하기 extends AbstractAlgorithm {

    public 최대수구하기() {
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
            int max = 0;
            for (int i = 1; i <= 10; i++) {
                int num = sc.nextInt();
                max = max > num ? max : num;
            }
            System.out.println("#" + test_case + " " + max);
        }
    }


}
