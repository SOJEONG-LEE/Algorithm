package com.spring.algorithm.kakao.programmers.practice.level1;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service("약수의합")
public class 약수의합 extends AbstractAlgorithm {

    private int n;

    public 약수의합() {
        this.n = 1;
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        int answer = 0;
        Set<Integer> num = new HashSet<>();

        if (n < 2) answer = n;

        for (int a = 1; a < n / 2; a++) {
            if (n % a == 0) {
                int b = n / a;
                if (!num.contains(a)) answer += a;
                num.add(a);
                if (!num.contains(b)) answer += b;
                num.add(b);
            }
        }

        System.out.println(answer);
    }
}