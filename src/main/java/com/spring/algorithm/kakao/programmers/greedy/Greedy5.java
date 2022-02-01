package com.spring.algorithm.kakao.programmers.greedy;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service("greedy5")
public class Greedy5 extends AbstractAlgorithm {

    private int n;
    private int[][] costs;

    public Greedy5() {
        this.n = 5;
        this.costs = new int[][]{{0, 1, 5}, {1, 2, 3}, {2, 3, 3}, {3, 1, 2}, {3, 0, 4}, {2, 4, 6}, {4, 0, 7}};
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        int answer = 0;
        HashSet<List<Integer>> hashSet = new HashSet<>();
        PriorityQueue<int[]> costQueue = new PriorityQueue<>((a, b) -> Integer.compare(a[2], b[2]));

        for (int[] cost : costs) {
            costQueue.add(cost);
            hashSet.add(new ArrayList<>(Arrays.asList(cost[0])));
            hashSet.add(new ArrayList<>(Arrays.asList(cost[1])));
        }

        while (hashSet.size() > 1) {
            int[] island = costQueue.poll();
            List<Integer> island1 = hashSet.stream().filter(f -> f.contains(island[0])).findFirst().get();
            List<Integer> island2 = hashSet.stream().filter(f -> f.contains(island[1])).findFirst().get();
            if (!island1.equals(island2)) {
                answer += island[2];
                hashSet.remove(island1);
                hashSet.remove(island2);
                island1.addAll(island2);
                hashSet.add(island1);
            }
        }

        System.out.println(answer);
    }

}
