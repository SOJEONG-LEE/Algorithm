package com.spring.algorithm.sw.expert.academy.problem;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service("간단한369게임")
public class 간단한369게임 extends AbstractAlgorithm {

    public 간단한369게임() {
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            String strNum = String.valueOf(i);
            if (strNum.contains("3") || strNum.contains("6") || strNum.contains("9")) {
                StringBuilder sb = new StringBuilder();
                for (char array : strNum.toCharArray()) {
                    if (array == '3' || array == '6' || array =='9') sb.append("-");
                }
                strNum = sb.toString();
            }
            System.out.print(strNum);
            if (i != num) System.out.print(" ");
        }
    }


}
