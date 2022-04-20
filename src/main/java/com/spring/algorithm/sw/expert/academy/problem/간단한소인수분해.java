package com.spring.algorithm.sw.expert.academy.problem;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service("간단한소인수분해")
public class 간단한소인수분해 extends AbstractAlgorithm {

    public 간단한소인수분해() {
        /*
10
6791400
1646400
1425600
8575
185625
6480
1185408
6561
25
330750
         */
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        int[] array = new int[]{2, 3, 5, 7, 11};
        for (int test_case = 1; test_case <= T; test_case++) {
            int num = sc.nextInt();
            System.out.print("#" + test_case + " ");
            for (int n : array) {
                int cnt = 0;
                while (num % n == 0) {
                    num /= n;
                    cnt++;
                }
                System.out.print(cnt + " ");
            }
            System.out.println();
        }
    }


}
