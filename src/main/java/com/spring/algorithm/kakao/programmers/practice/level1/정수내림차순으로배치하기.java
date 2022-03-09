package com.spring.algorithm.kakao.programmers.practice.level1;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service("정수내림차순으로배치하기")
public class 정수내림차순으로배치하기 extends AbstractAlgorithm {

    private long n;

    public 정수내림차순으로배치하기() {
        this.n = 121;
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        long answer = 0;
        StringBuilder sb = new StringBuilder();
        int[] num = Arrays.stream(String.valueOf(n).split("")).mapToInt(m -> Integer.valueOf(m)).sorted().toArray();
        for (int i = num.length - 1; i >= 0; i--) {
            sb.append(num[i]);
        }
        System.out.println(answer);
    }
}
