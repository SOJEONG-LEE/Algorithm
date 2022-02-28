package com.spring.algorithm.kakao.programmers.practice.level1;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.PriorityQueue;

@Service("문자열내마음대로정렬하기")
public class 문자열내마음대로정렬하기 extends AbstractAlgorithm {

    private String[] strings;
    private int n;

    public 문자열내마음대로정렬하기() {
        this.strings = new String[]{"abce", "abcd", "cdx"};
//        this.strings= new String[]{"sun", "bed", "car"};
        this.n = 1;
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        String[] answer = new String[strings.length];
        PriorityQueue<String> queue = new PriorityQueue<>((a, b) -> {
            char letterA = a.toCharArray()[n];
            char letterB = b.toCharArray()[n];
            if (letterA == letterB) return -1;
            else return Character.compare(letterA, letterB);
        });
        for (String word : strings) {
            queue.add(word);
        }

        for (int i = 0; i < strings.length; i++) {
            answer[i] = queue.poll();
        }
    }
}
