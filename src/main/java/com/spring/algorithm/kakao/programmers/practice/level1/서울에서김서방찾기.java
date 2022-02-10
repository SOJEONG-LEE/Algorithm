package com.spring.algorithm.kakao.programmers.practice.level1;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service("같은숫자는싫어")
public class 같은숫자는싫어 extends AbstractAlgorithm {

    private int[] arr;

    public 같은숫자는싫어() {
        this.arr = new int[]{1, 1, 3, 3, 0, 1, 1};
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        List<Integer> answer = new ArrayList<>(Arrays.asList(arr[0]));
        for (int num : arr) {
            if(answer.get(answer.size()-1) != num) answer.add(num);
        }
        System.out.println(answer);
    }
}
