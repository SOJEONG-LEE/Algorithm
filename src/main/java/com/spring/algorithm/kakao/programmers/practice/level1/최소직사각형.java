package com.spring.algorithm.kakao.programmers.practice.level1;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service("최소직사각형")
public class 최소직사각형 extends AbstractAlgorithm {

    private int[][] sizes;

    public 최소직사각형() {
        this.sizes = new int[][]{{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        int x = 0;
        int y = 0;
        for (int[] size : sizes) {
            if (size[0] < size[1]) {
                if (x == 0 || x < size[0]) x = size[0];
                if (y == 0 || y < size[1]) y = size[1];
            } else {
                if (x == 0 || x < size[1]) x = size[1];
                if (y == 0 || y < size[0]) y = size[0];
            }
        }
        System.out.println(x*y);
    }
}
