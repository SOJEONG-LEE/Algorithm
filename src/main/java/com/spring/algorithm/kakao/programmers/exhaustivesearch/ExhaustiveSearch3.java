package com.spring.algorithm.kakao.programmers.exhaustivesearch;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service("exhaustivesearch3")
public class ExhaustiveSearch3 extends AbstractAlgorithm {

    private int brown;
    private int yellow;

    public ExhaustiveSearch3() {
        this.brown = 24;
        this.yellow = 24;
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        int[] answer = new int[2];
        int total = brown + yellow;
        for (int y = 3; y < total; y++) {
            if (total % y == 0) {
                int x = total / y;
                if ((x - 2) * (y - 2) == yellow) {
                    answer[0] = x;
                    answer[1] = y;
                    break;
                }
            }
        }
        System.out.println(Arrays.stream(answer).boxed().collect(Collectors.toList()));
    }
}