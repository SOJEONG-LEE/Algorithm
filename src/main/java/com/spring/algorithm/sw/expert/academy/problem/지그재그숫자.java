package com.spring.algorithm.sw.expert.academy.problem;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service("지그재그숫자")
public class 지그재그숫자 extends AbstractAlgorithm {

    public 지그재그숫자() {
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int num = sc.nextInt();
            int sum = 0;
            for (int i = 1; i <= num; i++) {
                if (i % 2 == 0) sum -= i;
                else sum += i;
            }
            System.out.println("#" + test_case + " " + sum);
        }
    }


}
