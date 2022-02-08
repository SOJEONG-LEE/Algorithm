package com.spring.algorithm.kakao.programmers.practice.level2;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service("뉴스클러스터링")
public class 뉴스클러스터링 extends AbstractAlgorithm {

    private String str1;
    private String str2;

    public 뉴스클러스터링() {
        this.str1 = "aa1+aa2";
        this.str2 = "AAAA12";
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        HashMap<String, Integer> str1HashMap = new HashMap<>();
        HashMap<String, Integer> str2HashMap = new HashMap<>();
        HashSet<String> intersectionHashSet = new HashSet<>();
        HashSet<String> unionHashSet = new HashSet<>();

        String str1toLower = str1.toLowerCase();
        String str2toLower = str2.toLowerCase();

        for (int i = 0; i < str1toLower.length() - 1; i++) {
            String splitWord = str1toLower.substring(i, i + 2);
            if (splitWord.matches("[a-zA-Z]*")) {
                str1HashMap.put(splitWord, str1HashMap.getOrDefault(splitWord, 0) + 1);
                unionHashSet.add(splitWord);
            }
        }
        for (int i = 0; i < str2toLower.length() - 1; i++) {
            String splitWord = str2toLower.substring(i, i + 2);
            if (splitWord.matches("[a-zA-Z]*")) {
                str2HashMap.put(splitWord, str2HashMap.getOrDefault(splitWord, 0) + 1);
                unionHashSet.add(splitWord);
                if (str1HashMap.containsKey(splitWord)) intersectionHashSet.add(splitWord);
            }
        }

        int intersection = 0;
        int union = 0;

        for (String key : unionHashSet) {
            int num1 = (str1HashMap.containsKey(key)) ? str1HashMap.get(key) : 0;
            int num2 = (str2HashMap.containsKey(key)) ? str2HashMap.get(key) : 0;
            union += (num1 > num2) ? num1 : num2;
            if(intersectionHashSet.contains(key)) intersection += (num1 > num2) ? num2 : num1;
        }
        double answer = ((double) intersection / union) * 65536;
        System.out.println((intersection==0 && union==0) ? 65536 : (int) (((double) intersection / union) * 65536));
    }

    public String makeWord() {
        return null;
    }
}
