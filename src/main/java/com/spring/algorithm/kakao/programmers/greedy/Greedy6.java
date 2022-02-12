package com.spring.algorithm.kakao.programmers.greedy;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.*;

@Service("greedy6")
public class Greedy6 extends AbstractAlgorithm {

    private int[][] routes;

    public Greedy6() {
        this.routes = new int[][]{{-20, -15}, {-14, -5}, {-18, -13}, {-5, -3}};
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        int answer = 1;
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        for (int[] route : routes) {
            priorityQueue.add(route);
        }
        int x = priorityQueue.peek()[0];
        int y = priorityQueue.peek()[1];
        while (!priorityQueue.isEmpty()) {
            int[] route = priorityQueue.poll();
            if (x <= route[0] && route[0] <= y) {
                x = route[0];
                y = (y < route[1]) ? y : route[1];
            } else {
                x = route[0];
                y = route[1];
                answer++;
            }
        }
        System.out.println(answer);
    }

}
