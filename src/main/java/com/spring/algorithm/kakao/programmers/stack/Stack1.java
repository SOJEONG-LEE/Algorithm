package com.spring.algorithm.kakao.programmers.stack;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service("stack1")
public class Stack1 extends AbstractAlgorithm {

    private int[] progresses;
    private int[] speeds;

    public Stack1(){
        this.progresses = new int[]{93, 30, 55};
        this.speeds = new int[]{1, 30, 5};
    }

    public int[] test1() {
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
        return answer;
    }

    public int[] solution1() {
        int[] dayOfend = new int[100];
        int day = -1;
        for (int i = 0; i < progresses.length; i++) {
            while (progresses[i] + (day * speeds[i]) < 100) {
                day++;
            }
            dayOfend[day]++;
        }
        return Arrays.stream(dayOfend).filter(i -> i != 0).toArray();
    }

    @Override
    public <T> void printResult(T object){
        int[] answer = (int[]) object;
        for (int result : answer) {
            System.out.print(result+" ");
        }
    }

}
