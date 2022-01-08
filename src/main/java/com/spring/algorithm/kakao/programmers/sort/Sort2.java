package com.spring.algorithm.kakao.programmers.sort;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service("sort2")
public class Sort2 extends AbstractAlgorithm {

    private int[] numbers;

    public Sort2() {
//        this.numbers = new int[]{3, 30, 34, 5, 9};
        this.numbers = new int[]{0,0,1000,0};
    }

    @Override
    public <T> void printResult(T answer) {

    }
    public void test1() {
        StringBuffer answer = new StringBuffer();
        List<String> sortNumbers = Arrays.stream(numbers).mapToObj(m -> String.valueOf(m)).sorted((s1, s2) -> s2.concat(s1).compareTo(s1.concat(s2))).collect(Collectors.toList());
        System.out.println(sortNumbers);
        for (String num : sortNumbers) answer.append(num);
        if (answer.substring(0,1).startsWith("0")) System.out.println("0");
        System.out.println(answer.toString());
    }

    public void test2() {
        StringBuffer answer = new StringBuffer();
        String[] strNumber = new String[]{"0000", "1111", "2222", "3333", "4444", "5555", "6666", "7777", "8888", "9999"};

        List<String> sortNumbers = Arrays.stream(numbers).mapToObj(m -> String.valueOf(m)).sorted((s1, s2) -> {
            if(maxNum(s2, strNumber).equals(maxNum(s1, strNumber))) return s2.length()-s1.length();
            else return maxNum(s2, strNumber).compareTo(maxNum(s1, strNumber));
        }).collect(Collectors.toList());
        System.out.println(sortNumbers);
        for (String num : sortNumbers) answer.append(num);
        if (answer.substring(0,1).startsWith("0")) System.out.println("0");
        System.out.println(answer.toString());
    }

    public String maxNum(String num, String[] strNumber) {
        return num.concat(strNumber[Integer.valueOf(num.substring(0, 1))].substring(0, 4-num.length()));
    }
}
