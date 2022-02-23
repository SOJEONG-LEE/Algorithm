package com.spring.algorithm.kakao.programmers.practice.level2;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;

@Service("최솟값만들기")
public class 최솟값만들기 extends AbstractAlgorithm {

    private int[] A;
    private int[] B;

    public 최솟값만들기() {
        this.A = new int[]{1, 4, 2};
        this.B = new int[]{5, 4, 4};
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        int answer = 0;
        int lenght = A.length;
        Arrays.sort(A);
        Arrays.sort(B);
        for (int i = 0; i < lenght; i++) {
            answer += A[i] * B[lenght - 1 - i];
        }

        System.out.println(answer);
    }

    public void test2() {
        int answer = 0;
        Arrays.sort(A);
        int[] Bsort = Arrays.stream(B).boxed().sorted(Collections.reverseOrder()).mapToInt(m -> m).toArray();
        for (int i = 0; i < A.length; i++) {
            answer += A[i] * Bsort[i];
        }

        System.out.println(answer);
    }
}
