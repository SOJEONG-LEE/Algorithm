package com.spring.algorithm.sw.expert.academy.problem;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service("자릿수더하기")
public class 자릿수더하기 extends AbstractAlgorithm {


    public 자릿수더하기() {
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int answer = 0;
        for (String num : String.valueOf(T).split("")) {
            answer += Integer.valueOf(num);
        }
        System.out.println(answer);
    }


}
