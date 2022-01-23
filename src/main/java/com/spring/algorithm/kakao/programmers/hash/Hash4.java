package com.spring.algorithm.kakao.programmers.hash;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.*;

@Service("hash4")
public class Hash4 extends AbstractAlgorithm {

    private String[] genres;
    private int[] plays;

    public Hash4() {
        this.genres = new String[]{"classic", "pop", "classic", "classic", "pop"};
        this.plays = new int[]{500, 600, 150, 800, 2500};
    }

    public void test1() {
        List<Integer> answer = new ArrayList<>();
        PriorityQueue<Map<String, Integer>> genreQueue = new PriorityQueue<>((a, b) -> Integer.compare(b.values().stream().findFirst().get(), a.values().stream().findFirst().get()));
        Map<String, Integer> sumQueue = new HashMap<>();
        Map<String, PriorityQueue<int[]>> queueMap = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            if (!queueMap.containsKey(genres[i])) queueMap.put(genres[i], new PriorityQueue<int[]>((a, b) -> Integer.compare(b[1], a[1])));
            queueMap.get(genres[i]).add(new int[]{i, plays[i]});
            sumQueue.put(genres[i], sumQueue.getOrDefault(genres[i], 0) + plays[i]);
        }

        for(String genre : sumQueue.keySet()){
            genreQueue.add(new HashMap<String,Integer>(){{put(genre, sumQueue.get(genre));}});
        }

        while (!genreQueue.isEmpty()){
            String genre = genreQueue.poll().keySet().stream().findFirst().get();
            answer.add(queueMap.get(genre).poll()[0]);
            if(! queueMap.get(genre).isEmpty()) answer.add(queueMap.get(genre).poll()[0]);
        }
        System.out.println(answer);
    }

    public void test2() {
        int[] anwser;
//        Map<String, > playMapping = new HashMap<>();
        Map<String, Map<String, Integer>> genresSum = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            String genresKey = genres[i];
            if (genresSum.containsKey(genresKey)) {
                genresSum.get(genresKey).put("sum", genresSum.get(genresKey).get("sum") + plays[i]);
            } else {
                Map<String, Integer> playMapping = new HashMap<>();
                playMapping.put("sum", plays[i]);
                playMapping.put(String.valueOf(plays[i]), i);
                genresSum.put(genresKey, playMapping);
            }
        }


    }

    @Override
    public <T> void printResult(T answer) {

    }
}
