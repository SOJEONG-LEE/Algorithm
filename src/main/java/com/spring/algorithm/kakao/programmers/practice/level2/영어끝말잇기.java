package com.spring.algorithm.kakao.programmers.practice.level2;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Service("영어끝말잇기")
public class 영어끝말잇기 extends AbstractAlgorithm {

    private int n;
    private String[] words;

    public 영어끝말잇기() {
        this.n = 2;
        this.words = new String[]{"hello", "one", "even", "never", "now", "world", "draw"};
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        int[] answer = new int[]{0, 0};
        Set<String> wordsHashSet = new HashSet<>();
        String beforeWord = words[0].substring(0, 1);
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (wordsHashSet.contains(word)) {
                answer[0] = (i + 1) % n == 0 ? n : (i + 1) % n;
                answer[1] = (int) Math.ceil((double) (i + 1) / n);
                break;
            } else if (!word.startsWith(beforeWord)) {
                answer[0] = (i + 1) % n == 0 ? n : (i + 1) % n;
                answer[1] = (int) Math.ceil((double) (i + 1) / n);
                break;
            }
            wordsHashSet.add(word);
            beforeWord = word.substring(word.length() - 1);
        }

        System.out.println(Arrays.stream(answer).boxed().collect(Collectors.toList()));
    }
}