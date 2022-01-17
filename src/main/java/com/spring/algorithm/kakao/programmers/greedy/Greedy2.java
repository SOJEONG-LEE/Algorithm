package com.spring.algorithm.kakao.programmers.greedy;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

@Service("greedy2")
public class Greedy2 extends AbstractAlgorithm {

    private String number;
    private int k;

    public Greedy2() {
        this.number = "4177252841";
        this.k = 4;
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        Stack<Integer> answer = new Stack();
        List<Integer> list = Arrays.stream(number.split("")).mapToInt(m -> Integer.valueOf(m)).boxed().collect(Collectors.toList());
        while (!list.isEmpty()) {
            int num = list.remove(0);
            while (!answer.isEmpty() && answer.peek() < num && list.size() + answer.size() >= number.length() - k) {
                answer.pop();
            }
            if (answer.size() < number.length() - k) answer.push(num);
        }
        System.out.println(answer.stream().map(m -> String.valueOf(m)).collect(Collectors.joining()));
    }

    public void test2() {
        StringBuilder answer = new StringBuilder();
        int index = 0;
        // if (number.startsWith("0")) return "0";
        for (int i = 0; i < number.length() - k; i++) {
            int[] max = max(number, k + i, index);
            answer.append(max[0]);
            index = max[1];
        }
        System.out.println(answer.toString());
    }

    public int[] max(String number, int k, int index) {
        char max = '0';
        int maxIndex = index;
        for (int i = index; i <= k; i++) {
            char num = number.charAt(i);
            if (max < num) {
                max = num;
                maxIndex = i;
                if (num == '9') break;
            }
        }
        return new int[]{Integer.valueOf(String.valueOf(max)), maxIndex + 1};
    }
}