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
        for (int i = 0; i <= T; i++) {
            System.out.print((int) Math.pow(2, i) + " ");
        }

    }


}
