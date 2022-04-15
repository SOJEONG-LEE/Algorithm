package com.spring.algorithm.sw.expert.academy.problem;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service("쉬운거스름돈")
public class 쉬운거스름돈 extends AbstractAlgorithm {

    public 쉬운거스름돈() {
        /*
2
32850
160
         */
    }

    @Override
    public <T> void printResult(T answer) {

    }

    /*
    50,000 원 : 0개
    10,000 원 : 3개
    5,000 원 : 0개
    1,000 원 : 2개
    500 원 : 1개
    100 원 : 3개
    50 원 : 1개
    10 원 : 0개
     */
    public void test1() {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int money = sc.nextInt();
            int fiftythousand = money / 50000;
            money -= fiftythousand * 50000;
            int tenthousand = money / 10000;
            money -= tenthousand * 10000;
            int fivethousand = money / 5000;
            money -= fivethousand * 5000;
            int onethousand = money / 1000;
            money -= onethousand * 1000;
            int fivehundred = money / 500;
            money -= fivehundred * 500;
            int onehundred = money / 100;
            money -= onehundred * 100;
            int fifty = money / 50;
            money -= fifty * 50;
            int ten = money / 10;
            System.out.println("#" + test_case);
            System.out.println(fiftythousand + " " + tenthousand + " " + fivethousand + " " + onethousand + " " + fivehundred + " " + onehundred + " " + fifty + " " + ten);
        }

    }


}
