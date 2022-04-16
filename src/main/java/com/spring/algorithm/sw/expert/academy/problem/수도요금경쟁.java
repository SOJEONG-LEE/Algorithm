package com.spring.algorithm.sw.expert.academy.problem;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service("수도요금경쟁")
public class 수도요금경쟁 extends AbstractAlgorithm {

    public 수도요금경쟁() {
        /*
2
9 100 20 3 10
8 300 100 10 250
         */
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            // A사
            int P = sc.nextInt(); // 1리터 당 요금
            // B사
            int Q = sc.nextInt(); // 기본요금
            int R = sc.nextInt(); // 기본량
            int S = sc.nextInt(); // 1리터 당 초과요금

            int W = sc.nextInt(); // 사용량
            int chargeA = W * P;
            int chargeB = Q + ((W > R) ? (W - R) * S : 0);
            System.out.println("#" + test_case + " " + ((chargeA > chargeB) ? chargeB : chargeA));
        }

    }


}
