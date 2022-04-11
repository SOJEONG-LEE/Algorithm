package com.spring.algorithm.sw.expert.academy.problem;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service("서랍의비밀번호")
public class 서랍의비밀번호 extends AbstractAlgorithm {

    public 서랍의비밀번호() {
        /*
123 100
         */
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        Scanner sc = new Scanner(System.in);
        int password = sc.nextInt();
        int num = sc.nextInt();

        System.out.println(password - num + 1);

    }


}
