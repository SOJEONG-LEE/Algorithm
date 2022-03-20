package com.spring.algorithm.kakao.programmers.practice.level1;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service("소수찾기")
public class 소수찾기 extends AbstractAlgorithm {

    private int n;

    public 소수찾기() {
        this.n = 10;
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        int answer = 0;
        Set<Integer> hashSet = new HashSet<>();
        for (int i = 2; i <= n; i++) hashSet.add(i);
        for (int i = 2; i <= Math.sqrt(n); i++) {
            for (int j = 2; j <= n / i; j++) hashSet.remove(i * j);
        }
        answer = hashSet.size();
        System.out.println(answer);
    }
}
