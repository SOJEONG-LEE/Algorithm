package com.spring.algorithm.kakao.programmers.practice.level1;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.*;


@Service("두개뽑아서더하기")
public class 두개뽑아서더하기 extends AbstractAlgorithm {

    private int[] arr;

    public 두개뽑아서더하기() {
        this.arr = new int[]{1, 1, 3, 3, 0, 1, 1};
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1(int[] numbers) {
        Set<Integer> hashset = new HashSet<Integer>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                hashset.add(numbers[i] + numbers[j]);
            }
        }
        hashset.stream().mapToInt(m -> m).sorted().toArray();

    }
}
