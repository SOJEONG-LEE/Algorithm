package com.spring.algorithm.kakao.programmers.hash;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Service("hash3")
public class Hash3 extends AbstractAlgorithm {

    private String[][] clothes;

    public Hash3() {
        this.clothes = new String[][]{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        int answer = 1;

        Map<String, Integer> clothesMap = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            String key = clothes[i][1];
            if (clothesMap.containsKey(key)) {
                clothesMap.put(key, clothesMap.get(key) + 1);
            } else {
                clothesMap.put(key, 1);
            }
        }

        for (int num : clothesMap.values()) {
            answer *= (num + 1);
        }

        System.out.println(answer - 1);
    }

    public void test2() {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            String key = clothes[i][1];
            if (!map.containsKey(key)) {
                map.put(key, 1);
            } else {
                map.put(key, map.get(key) + 1);
            }
        }
        Iterator<Integer> it = map.values().iterator();
        while (it.hasNext()) {
            answer *= it.next().intValue() + 1;
        }
        System.out.println(answer-1);
    }

    public void test3() {
        int answer = 1;
        Map<String, Integer> clothesMap = new HashMap<>();
        for(String[] wear : clothes) clothesMap.put(wear[1], clothesMap.getOrDefault(wear[1], 1)+1);

        for(String key : clothesMap.keySet()) answer *= clothesMap.get(key);

        System.out.println(answer-1);

    }
}
