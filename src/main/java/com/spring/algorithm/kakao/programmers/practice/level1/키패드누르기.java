package com.spring.algorithm.kakao.programmers.practice.level1;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;

@Service("키패드누르기")
public class 키패드누르기 extends AbstractAlgorithm {

    private int[] numbers;
    private String hand;

    public 키패드누르기() {
        this.numbers = new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        this.hand = "right";
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        StringBuilder answer = new StringBuilder();
        HashSet<Integer> leftSet = new HashSet<>(Arrays.asList(1, 4, 7));
        HashSet<Integer> rightSet = new HashSet<>(Arrays.asList(3, 6, 9));
        String handLetter = hand.substring(0, 1).toUpperCase();
        int left = 10;
        int right = 12;
        for (int num : numbers) {
            if (leftSet.contains(num)) {
                answer.append("L");
                left = num;
            } else if (rightSet.contains(num)) {
                answer.append("R");
                right = num;
            } else {
                int distance = getdistance(num, left) - getdistance(num, right);
                if(distance > 0) answer.append("R");
                else if(distance <0) answer.append("L");
                else answer.append(handLetter);
            }
        }
        System.out.println(answer);
    }

    public int getdistance(int num, int beforeNum) {
        int distance = 0;
        if (num == 0) num = 11;
        int line = (int) (Math.ceil(num / 3d) - Math.ceil(beforeNum / 3d));
        beforeNum = beforeNum + 3 * line;
        distance = Math.abs(line) + Math.abs(num - beforeNum);

        return distance;
    }
}
