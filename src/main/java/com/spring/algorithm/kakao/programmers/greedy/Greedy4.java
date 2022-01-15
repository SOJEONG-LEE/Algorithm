package com.spring.algorithm.kakao.programmers.greedy;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service("greedy4")
public class Greedy4 extends AbstractAlgorithm {

    private int[] people;
    private int limit;

    public Greedy4() {
        this.people = new int[]{70, 50, 80, 50};
        this.limit = 100;
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        int answer = 0;
        List<Integer> peopleList = Arrays.stream(people).sorted().boxed().collect(Collectors.toList());

        while (!peopleList.isEmpty()) {
            int weight = 0;
            weight += peopleList.remove(peopleList.size() - 1);
            if (!peopleList.isEmpty() && weight + peopleList.get(0) <= limit) weight += peopleList.remove(0);
            answer++;
        }

        System.out.println(answer);

    }

    public void test2() {
        int answer = 0;
        Arrays.sort(people);
        int minIndex = 0;

        for (int i = people.length-1; i >= minIndex; i--) {
            int weight = 0;
            weight += people[i];
            if (weight + people[minIndex] <= limit) minIndex++;
            answer++;
        }

        System.out.println(answer);

    }

}
