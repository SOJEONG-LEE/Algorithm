package com.spring.algorithm.kakao.programmers.sort;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service("sort1")
public class Sort1 extends AbstractAlgorithm {

    private int[] array;
    private int[][] commands;

    public Sort1() {
        this.array = new int[]{1, 5, 2, 6, 3, 7, 4};
        this.commands = new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        int[] answer = new int[commands.length];
        List<Integer> arrayList = Arrays.stream(array).boxed().collect(Collectors.toList());
        for(int i = 0; i < commands.length; i++){
            answer[i] = (new ArrayList<>(arrayList).subList(commands[i][0]-1, commands[i][1]).stream().sorted().collect(Collectors.toList()).get(commands[i][2]-1));
        }
        System.out.println(Arrays.stream(answer).boxed().collect(Collectors.toList()));
    }

    public void test2() {
        int[] answer = new int[commands.length];
        answer = Arrays.stream(commands).mapToInt(m -> {
            int[] slice = Arrays.copyOfRange(array, m[0] - 1, m[1]);
            return Arrays.stream(slice).sorted().toArray()[m[2] - 1];
        }).toArray();
        System.out.println(Arrays.stream(answer).boxed().collect(Collectors.toList()));
    }

    public void test3() {
        for(int[] command : commands){
            int answer = (Arrays.stream(Arrays.copyOfRange(array, command[0]-1, command[1])).sorted().toArray())[command[2]-1];
            System.out.println(answer);
        }
    }
}
