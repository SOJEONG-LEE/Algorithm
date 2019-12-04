package com.spring.algorithm.kakao.programmers.hash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hash3 {

    public static void main(String[] args){
        test1();
    }

    public static void test1(){

        int answer = 1;

        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

        Map<String, Integer> clothesMap = new HashMap<>();

        for(int i=0; i<clothes.length; i++){
            String key = clothes[i][1];
            if(clothesMap.containsKey(key)){
                clothesMap.put(key, clothesMap.get(key)+1);
            }else{
                clothesMap.put(key, 1);
            }
        }

        for(int num : clothesMap.values()){
            answer *= (num+1);
        }

        System.out.println(answer-1);
    }

    public int test2(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<clothes.length; i++){
            String key = clothes[i][1];
            if(!map.containsKey(key)) {
                map.put(key, 1);
            } else {
                map.put(key, map.get(key) + 1);
            }
        }
        Iterator<Integer> it = map.values().iterator();
        while(it.hasNext()) {
            answer *= it.next().intValue()+1;
        }
        return answer-1;
    }
}
