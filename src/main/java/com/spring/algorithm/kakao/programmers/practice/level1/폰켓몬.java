package com.spring.algorithm.kakao.programmers.practice.level1;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

@Service("폰켓몬")
public class 폰켓몬 extends AbstractAlgorithm {

    private int[] nums;

    public 폰켓몬() {
        this.nums = new int[]{3, 3, 3, 2, 2, 2};
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        int answer = nums.length / 2;
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        if (set.size() < answer) answer = set.size();

        System.out.println(answer);
    }
}
