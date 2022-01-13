package com.spring.algorithm.kakao.programmers.stack;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

@Service("stack4")
public class Stack4 extends AbstractAlgorithm {

    private int[] prices;

    public Stack4() {
        this.prices = new int[]{1, 2, 3, 2, 3};
    }

    @Override
    public <T> void printResult(T object) {
    }

    public void test1() {
        int[] answer = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                answer[i]++;
                if (prices[i] > prices[j]) break;
            }
        }
        System.out.println(Arrays.stream(answer).boxed().collect(Collectors.toList()));
    }
}