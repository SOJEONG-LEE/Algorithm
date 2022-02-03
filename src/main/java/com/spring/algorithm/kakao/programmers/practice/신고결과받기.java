package com.spring.algorithm.kakao.programmers.practice;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service("신고결과받기")
public class 신고결과받기 extends AbstractAlgorithm {

    private String[] id_list;
    private String[] report;
    private int k;

    public 신고결과받기() {
        this.id_list = new String[]{"muzi", "frodo", "apeach", "neo"};
        this.report = new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        this.k = 2;
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        int[] answer = new int[id_list.length];
        HashMap<String, HashSet<String>> reportHashMap = new HashMap<>();
        HashMap<String, Integer> countHashMap = new HashMap<>();
        List<String> reportIdList = new ArrayList<>();
        for (String ids : Arrays.stream(report).collect(Collectors.toSet())) {
            String[] id = ids.split(" ");
            if (reportHashMap.containsKey(id[0])) reportHashMap.get(id[0]).add(id[1]);
            else reportHashMap.put(id[0], new HashSet<>(Arrays.asList(id[1])));

            int count = countHashMap.getOrDefault(id[1], 0);
            if (count == k - 1) reportIdList.add(id[1]);
            countHashMap.put(id[1], count + 1);
        }

        for (int i = 0; i < id_list.length; i++) {
            if (reportHashMap.containsKey(id_list[i])) {
                for (String reportId : reportHashMap.get(id_list[i])) {
                    if (reportIdList.contains(reportId)) answer[i]++;
                }
            }
        }

        System.out.println(Arrays.stream(answer).boxed().collect(Collectors.toList()));
    }
}
