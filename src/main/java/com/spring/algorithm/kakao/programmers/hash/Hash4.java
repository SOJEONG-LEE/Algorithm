package com.spring.algorithm.kakao.programmers.hash;

import java.util.HashMap;
import java.util.Map;

public class Hash4 {

    public void test1(){
        String[] genres ={"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        int[] anwser;
//        Map<String, > playMapping = new HashMap<>();
        Map<String, Map<String, Integer>> genresSum = new HashMap<>();

        for(int i=0; i< genres.length; i++){
            String genresKey = genres[i];
            if(genresSum.containsKey(genresKey)) {
                genresSum.get(genresKey).put("sum", genresSum.get(genresKey).get("sum")+plays[i]);
            }else{
                Map<String, Integer> playMapping = new HashMap<>();
                playMapping.put("sum", plays[i]);
                playMapping.put(String.valueOf(plays[i]), i);
                genresSum.put(genresKey, playMapping);
            }
        }


    }
}
