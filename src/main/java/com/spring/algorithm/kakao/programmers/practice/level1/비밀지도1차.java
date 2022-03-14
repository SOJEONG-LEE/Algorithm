package com.spring.algorithm.kakao.programmers.practice.level1;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

@Service("1차비밀지도")
public class 비밀지도1차 extends AbstractAlgorithm {

    private int n;
    private int[] arr1;
    private int[] arr2;

    public 비밀지도1차() {
        this.n = 5;
        this.arr1 = new int[]{9, 20, 28, 18, 11};
        this.arr2 = new int[]{30, 1, 21, 17, 28};
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            char[] binary1 = String.format("%" + n + "s", Integer.toBinaryString(arr1[i])).toCharArray();
            char[] binary2 = String.format("%" + n + "s", Integer.toBinaryString(arr2[i])).toCharArray();
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (binary1[j] == '1') sb.append("#");
                else if (binary2[j] == '1') sb.append("#");
                else sb.append(" ");
            }
            answer[i] = sb.toString();
        }

        System.out.println(answer);
    }
}