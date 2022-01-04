package com.spring.algorithm.kakao.programmers.greedy;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service("greedy1")
public class Greedy1 extends AbstractAlgorithm {

    private int n;
    private int[] lost;
    private int[] reserve;

    public Greedy1() {
        this.n = 5;
        this.lost = new int[]{4,2};
        this.reserve = new int[]{5,3};
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        int count = 0;
        int[] clothes = new int[n+1];
        List<Integer> lostList  = Arrays.stream(lost).sorted().boxed().collect(Collectors.toList());
        for(int r : reserve) {
            if(lostList.remove((Object) r)) count++;
            else clothes[r] = 1;
        }

        for(int lostIndex : lostList){
            if(clothes[lostIndex-1] == 1) { clothes[lostIndex-1] = 0; count++; }
            else if(n >= lostIndex+1 && clothes[lostIndex+1] == 1) { clothes[lostIndex+1] = 0; count++; }
        }

        System.out.println(n-lost.length+count);
    }

}
