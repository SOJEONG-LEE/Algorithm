package com.spring.algorithm.sw.expert.academy.problem;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service("몫과나머지출력하기")
public class 몫과나머지출력하기 extends AbstractAlgorithm {

    public 몫과나머지출력하기() {
        /*
3
9 2
15 6
369 15
         */
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int x = num1 / num2;
            int y = num1 % num2;
            System.out.println("#"+test_case+" "+x+" "+y);
        }
    }


}
