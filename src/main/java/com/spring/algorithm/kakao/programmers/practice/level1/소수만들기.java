package com.spring.algorithm.kakao.programmers.practice.level1;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

@Service("소수만들기")
public class 소수만들기 extends AbstractAlgorithm {

    private int[] nums;

    public 소수만들기() {
        this.nums = new int[]{1, 2, 3, 4};
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (isPrime(sum)) answer++;
                }
            }
        }
        System.out.println(answer);
    }

    public boolean isPrime(int n) {
        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
