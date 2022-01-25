package com.spring.algorithm.kakao.programmers.heap;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

@Service("heap3")
public class Heap3 extends AbstractAlgorithm {

    private String[] operations;

    public Heap3() {
        this.operations = new String[]{"I 16","I -5643","D -1","D 1","I 123","D -1"};
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        int[] answer = new int[]{0, 0};
        PriorityQueue<Integer> minQueue = new PriorityQueue<>();
        PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Comparator.reverseOrder());
        for (String operation : operations) {
            String[] command = operation.split(" ");
            if (command[0].equals("I")) {
                minQueue.add(Integer.valueOf(command[1]));
                maxQueue.add(Integer.valueOf(command[1]));
            } else if(!minQueue.isEmpty()) {
                if (command[1].equals("-1")) {
                    int min = minQueue.poll();
                    maxQueue.remove(min);
                } else {
                    int max = maxQueue.poll();
                    minQueue.remove(max);
                }
            }
        }
        if(!minQueue.isEmpty()){
            answer[0] = maxQueue.poll();
            answer[1] = minQueue.poll();
        }
        System.out.println(Arrays.stream(answer).boxed().collect(Collectors.toList()));
    }


}
