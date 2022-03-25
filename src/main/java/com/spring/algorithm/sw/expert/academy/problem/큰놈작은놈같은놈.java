package com.spring.algorithm.sw.expert.academy.problem;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service("큰놈작은놈같은놈")
public class 큰놈작은놈같은놈 extends AbstractAlgorithm {

    public 큰놈작은놈같은놈() {
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
            if(num1 > num2) System.out.println("#"+test_case+" >");
            else if(num1 < num2) System.out.println("#"+test_case+" <");
            else System.out.println("#"+test_case+" =");
        }
    }


}
