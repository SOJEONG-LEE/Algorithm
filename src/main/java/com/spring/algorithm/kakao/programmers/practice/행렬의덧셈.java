package com.spring.algorithm.kakao.programmers.practice;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

@Service("행렬의덧셈")
public class 행렬의덧셈 extends AbstractAlgorithm {

    private int[][] arr1;
    private int[][] arr2;

    public 행렬의덧셈() {
        this.arr1 = new int[][]{{1, 2}, {2, 3}};
        this.arr2 = new int[][]{{3, 4}, {5, 6}};
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        int[][] answer = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                answer[i][j] =arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println(answer);
    }


}
