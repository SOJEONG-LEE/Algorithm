package com.spring.algorithm.kakao.programmers.stack;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

@Service("stack1")
public class Stack1 extends AbstractAlgorithm {

    private int[] progresses;
    private int[] speeds;

    public Stack1() {
        this.progresses = new int[]{96,94};
        this.speeds = new int[]{3,3};
    }

    @Override
    public <T> void printResult(T object) {
    }

    public void test1() {
        int[] answer;
        List<Integer> result = new ArrayList<>();
        int[] day = new int[progresses.length];

        for (int i = 0; i < progresses.length; i++) {
            day[i] = (int) Math.ceil((100 - progresses[i]) / speeds[i]);
            if (result.isEmpty()) {
                result.add(1);
            } else {
                if (day[i - 1] >= day[i]) {
                    day[i] = day[i - 1];
                    result.add(result.remove(result.size() - 1) + 1);
                } else {
                    result.add(1);
                }
            }
        }
        answer = result.stream().mapToInt(i -> i).toArray();
    }

    public void test2() {
        Stack<Integer> answer = new Stack<>();
        double beforeDay = 0;
        for (int i = 0; i < progresses.length; i++){
            double day = Math.ceil((double) (100-progresses[i])/speeds[i]);
            if(!answer.isEmpty() && beforeDay >= day) answer.push(answer.pop()+1);
            else { answer.push(1); beforeDay = day; }
        }
        System.out.println(answer);
        int[] a = answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public void solution1() {
        int[] dayOfend = new int[100];
        int day = -1;
        for (int i = 0; i < progresses.length; i++) {
            while (progresses[i] + (day * speeds[i]) < 100) {
                day++;
            }
            dayOfend[day]++;
        }
        Arrays.stream(dayOfend).filter(i -> i != 0).toArray();
    }

}
