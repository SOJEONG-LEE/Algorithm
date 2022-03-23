package com.spring.algorithm.kakao.programmers.practice.level1;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Stack;

@Service("크레인인형뽑기")
public class 크레인인형뽑기 extends AbstractAlgorithm {

    private int[][] board;
    private int[] moves;

    public 크레인인형뽑기() {
        this.board = new int[][]{{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        this.moves = new int[]{1, 5, 3, 5, 1, 2, 1, 4};
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int move : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][move - 1] != 0) {
                    if (!stack.empty() && stack.peek() == board[i][move - 1]) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(board[i][move - 1]);
                    }
                    board[i][move - 1] = 0;
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}
