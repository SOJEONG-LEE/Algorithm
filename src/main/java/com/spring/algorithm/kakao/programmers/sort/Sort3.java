package com.spring.algorithm.kakao.programmers.sort;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service("sort3")
public class Sort3 extends AbstractAlgorithm {

    private int[] citations;

    public Sort3() {
        this.citations = new int[]{9, 9, 9, 12};
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        int answer = 0;
        Arrays.sort(citations);
        for (int i = 0; i <= citations.length; i++) {
            for (int k = 0; k < citations.length; k++) {
                if (i <= citations[k] && i <= citations.length - k) {
                    answer = i;
                    break;
                }
            }
        }
        System.out.println(answer);
    }

    public void test2() {
        int answer = 0;
        Arrays.sort(citations);
        for (int i = citations.length - 1; i >= 0; i--) {
            if (citations.length - i >= citations[i]) break;
            answer++;
        }
        System.out.println(answer);
    }
}
