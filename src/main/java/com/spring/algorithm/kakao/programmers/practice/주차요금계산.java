package com.spring.algorithm.kakao.programmers.practice;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service("주차요금계산")
public class 주차요금계산 extends AbstractAlgorithm {

    private int[] fees;
    private String[] records;

    public 주차요금계산() {
        this.fees = new int[]{120, 0, 60, 591};
        this.records = new String[]{"16:00 3961 IN","16:00 0202 IN","18:00 3961 OUT","18:00 0202 OUT","23:58 3961 IN"};
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        List<Integer> answer = new ArrayList<>();
        Map<Integer, Integer> feeMap = new HashMap<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (String record : records) {
            String[] recordArray = record.split(" ");
            int car = Integer.valueOf(recordArray[1]);
            int minutes = Integer.valueOf(recordArray[0].substring(0, 2)) * 60 + Integer.valueOf(recordArray[0].substring(3, 5));
            if (recordArray[2].equals("IN")) {
                map.put(car, minutes);
            } else {
                feeMap.put(car, feeMap.getOrDefault(car, 0) + minutes - map.remove(car));
            }
        }

        for (int car : map.keySet()) {
            feeMap.put(car, feeMap.getOrDefault(car, 0) + 1439 - map.get(car));
        }

        for(int car : feeMap.keySet().stream().sorted().collect(Collectors.toList())){
            answer.add(calculate(feeMap.get(car), fees));
        }

        System.out.println(answer);
    }

    public int calculate(int time, int[] fees) {
        if (time <= fees[0]) {
            return fees[1];
        } else {
            time = (int) Math.ceil((double) (time - fees[0]) / fees[2]);
            return fees[1] + time * fees[3];
        }
    }
}
