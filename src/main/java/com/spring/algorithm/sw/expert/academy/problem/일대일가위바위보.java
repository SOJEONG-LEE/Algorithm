package com.spring.algorithm.sw.expert.academy.problem;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service("1대1가위바위보")
public class 일대일가위바위보 extends AbstractAlgorithm {

    public 일대일가위바위보() {
        /*
3 2
         */
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        /*
        1: 가위, 2: 바위, 3: 보
         */
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 == 1) {
            if(num2 == 3) System.out.println("A");
            else System.out.println("B");
        } else if (num1 == 2) {
            if(num2 == 1) System.out.println("A");
            else System.out.println("B");
        } else {
            if(num2 == 2) System.out.println("A");
            else System.out.println("B");
        }

    }


}
