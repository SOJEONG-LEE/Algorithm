package com.spring.algorithm.sw.expert.academy.problem;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service("간단한N의약수")
public class 간단한N의약수 extends AbstractAlgorithm {

    public 간단한N의약수() {
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

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) System.out.print(i + " ");
        }
    }


}
