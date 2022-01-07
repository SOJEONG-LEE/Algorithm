package com.spring.algorithm.kakao.programmers.heap;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

@Service("heap1")
public class Heap1 extends AbstractAlgorithm {

    private int[] scoville;
    private int K;

    public Heap1() {
        this.scoville = new int[]{1, 2, 3, 9, 10, 12};
        this.K = 7;
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.addAll(Arrays.stream(scoville).boxed().collect(Collectors.toList()));

        while (queue.size() > 1) {
            queue.add(queue.poll() + queue.poll() * 2);
            answer++;
            if (queue.peek() >= K){
                System.out.println(answer); break;
            }
        }

        System.out.println(-1);

    }

}
