package com.spring.algorithm.kakao.programmers.practice;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service("제일작은수제거하기")
public class 제일작은수제거하기 extends AbstractAlgorithm {

    private int[] arr;

    public 제일작은수제거하기() {
        this.arr = new int[]{4, 3, 2, 1};
    }

    @Override
    public <T> void printResult(T answer) {
    }

    public void test1() {
        List<Integer> answer = new ArrayList<>();
        int min = Arrays.stream(arr).min().getAsInt();
        answer.addAll(Arrays.stream(arr).filter(f -> f != min).boxed().collect(Collectors.toList()));
        if(answer.isEmpty()) answer = new ArrayList<>(Arrays.asList(-1));
        answer.stream().mapToInt(m -> m).toArray();
        System.out.println(answer);
    }
}
