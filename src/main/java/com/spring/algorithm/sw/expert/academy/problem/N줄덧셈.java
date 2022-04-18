package com.spring.algorithm.sw.expert.academy.problem;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service("N줄덧셈")
public class N줄덧셈 extends AbstractAlgorithm {

    public N줄덧셈() {
        /*
10
         */
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println((1 + num) * num / 2);
    }


}
