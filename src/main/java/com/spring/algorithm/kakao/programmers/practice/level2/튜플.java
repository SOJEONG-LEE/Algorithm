package com.spring.algorithm.kakao.programmers.practice.level2;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

@Service("튜플")
public class 튜플 extends AbstractAlgorithm {

    private String s;

    public 튜플() {
        this.s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        Map<Integer, Integer> tuple = new HashMap<>();
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>((a, b) -> Integer.compare(b[1], a[1]));
        String set = s.replaceAll("\\{", "").replaceAll("}", "");
        for (String num : set.split(",")) {
            tuple.put(Integer.valueOf(num), tuple.getOrDefault(Integer.valueOf(num), 0) + 1);
        }
        for (int num : tuple.keySet()) {
            priorityQueue.add(new int[]{num, tuple.get(num)});
        }
        int[] answer = new int[tuple.keySet().size()];
        for (int i = 0; i < tuple.keySet().size(); i++) {
            answer[i] = priorityQueue.poll()[0];
        }
        System.out.println(Arrays.stream(answer).boxed().collect(Collectors.toList()));

    }
}
