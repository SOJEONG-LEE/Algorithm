package com.spring.algorithm.kakao.programmers.practice.level1;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service("약수의개수와덧셈")
public class 약수의개수와덧셈 extends AbstractAlgorithm {

    private int left;
    private int right;

    public 약수의개수와덧셈() {
        this.left = 13;
        this.right = 17;
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        int answer = 0;
        for (int num = left; num <= right; num++) {
            if (getDivisor(num) % 2 == 0) answer += num;
            else answer -= num;
        }
        System.out.println(answer);
    }

    public int getDivisor(int num) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 1; i <= num / 2 + 1; i++) {
            if (num % i == 0) {
                set.add(i);
                set.add(num / i);
            }
        }
        return set.size();
    }
}
