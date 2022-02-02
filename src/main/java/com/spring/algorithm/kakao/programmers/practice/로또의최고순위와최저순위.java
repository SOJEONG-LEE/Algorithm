package com.spring.algorithm.kakao.programmers.practice;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

@Service("로또의최고순위와최저순위")
public class 로또의최고순위와최저순위 extends AbstractAlgorithm {

    private int[] lottos;
    private int[] win_nums;

    public 로또의최고순위와최저순위() {
        this.lottos = new int[]{44, 1, 0, 0, 31, 25};
        this.win_nums = new int[]{31, 10, 45, 1, 6, 19};
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        int[] answer = new int[2];
        int count = 0;
        HashSet<Integer> hashSet = new HashSet(Arrays.stream(lottos).boxed().collect(Collectors.toList()));
        for (int num : win_nums) {
            if (hashSet.contains(num)) count++;
        }
        answer[1] = count == 0 ? 6 : 7 - count;
        count += (int) Arrays.stream(lottos).filter(f -> f == 0).count();
        answer[0] = count == 0 ? 6 : 7 - count;
        System.out.println(answer[0] + "," + answer[1]);
    }
}
