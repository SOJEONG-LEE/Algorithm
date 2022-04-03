package com.spring.algorithm.sw.expert.academy.problem;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service("초심자의회문검사")
public class 초심자의회문검사 extends AbstractAlgorithm {

    public 초심자의회문검사() {
        /*
3
level
samsung
eye
         */
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            String word = sc.next();
            int length = word.length();
            int answer = 1;
            for (int index = 0; index <= length / 2; index++) {
                if (word.charAt(index) != word.charAt(length - index - 1)) {
                    answer = 0;
                    break;
                }
            }
            System.out.println("#" + test_case + " " + answer);
        }
    }

}
