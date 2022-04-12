package com.spring.algorithm.sw.expert.academy.problem;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service("더블더블")
public class 더블더블 extends AbstractAlgorithm {

    public 더블더블() {
        /*
8
         */
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int num = 1;
        for (int i = 1; i <= T; i++) {
            if (i != 1) num *= 2;
            System.out.print(num + " ");
        }

    }


}
