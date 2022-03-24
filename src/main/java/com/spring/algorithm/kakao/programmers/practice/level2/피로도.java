package com.spring.algorithm.kakao.programmers.practice.level2;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.PriorityQueue;

@Service("피로도")
public class 피로도 extends AbstractAlgorithm {

    private int k;
    private int[][] dungeons;

    public 피로도() {
        this.k = 80;
        this.dungeons = new int[][]{{80, 20}, {50, 40}, {30, 10}};
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        int answer = 0;
        int stamina = k;
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
        for (int[] fatigue : dungeons) {
            priorityQueue.add(fatigue);
        }
        while (!priorityQueue.isEmpty()) {
            int[] fatigue = priorityQueue.poll();
            if (stamina >= fatigue[0]) stamina -= fatigue[1];
            else break;
            answer++;
        }
        System.out.println(answer);
    }
}