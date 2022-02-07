package com.spring.algorithm.kakao.programmers.practice.level2;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

@Service("행렬의곱셈")
public class 행렬의곱셈 extends AbstractAlgorithm {

    private int[][] arr1;
    private int[][] arr2;

    public 행렬의곱셈() {
        this.arr1 = new int[][]{{2, 3, 2}, {4, 2, 4}, {3, 1, 4}};
        this.arr2 = new int[][]{{5, 4, 3}, {2, 4, 1}, {3, 1, 1}};
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        int[][] answer = new int[arr1.length][arr2[0].length];
        for (int x = 0; x < arr1.length; x++) {
            for (int y = 0; y < arr2[0].length; y++) {
                for (int index = 0; index < arr1[0].length; index++) {
                    answer[x][y] += arr1[x][index] * arr2[index][y];
                }
            }
        }

        System.out.println(answer);
    }


}