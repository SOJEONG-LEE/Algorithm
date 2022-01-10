package com.spring.algorithm.kakao.programmers.stack;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service("stack2")
public class Stack2 extends AbstractAlgorithm {

    private int[] priorities;
    private int location;

    public Stack2() {
        this.priorities = new int[]{1, 1, 9, 1, 1, 1, 1, 1, 1};
        this.location = 0;
    }

    public void test1() {
        int answer = 0;
        int max;
        int i;
        while (true) {
            for (i = 0; i < priorities.length; i++) {
                max = Arrays.stream(priorities).max().getAsInt();
                if (priorities[i] >= max) {
                    priorities[i] = 0;
                    answer++;
                    if (i == location) break;
                }
            }
            if (i == location) break;
        }
        System.out.println(answer);
    }

    public void solution1() {
        int answer = 0;
        int l = location;

        Queue<Integer> que = new LinkedList<Integer>();
        for (int i : priorities) {
            que.add(i);
        }

        Arrays.sort(priorities);
        int size = priorities.length - 1;

        while (!que.isEmpty()) {
            Integer i = que.poll();
            if (i == priorities[size - answer]) {
                answer++;
                l--;
                if (l < 0)
                    break;
            } else {
                que.add(i);
                l--;
                if (l < 0)
                    l = que.size() - 1;
            }
        }

        System.out.println(answer);
    }

    public void solution2() {
        List<Integer> list = new ArrayList<>();
        for (int priority : priorities) {
            list.add(priority);
        }

        int turn = 1;
        while (!list.isEmpty()) {
            final Integer j = list.get(0);
            if (list.stream().anyMatch(v -> j < v)) {
                list.add(list.remove(0));
            } else {
                if (location == 0) {
                    System.out.println(turn);
                }
                list.remove(0);
                turn++;
            }

            if (location > 0) {
                location--;
            } else {
                location = list.size() - 1;
            }
        }
        System.out.println(0);
    }

    public void test2(){
        int answer = 0;
        int index = location;
        List<Integer> queue = Arrays.stream(priorities).boxed().collect(Collectors.toList());
        List<Integer> print = Arrays.stream(priorities).boxed()
                .sorted(Collections.reverseOrder()).collect(Collectors.toList());

        while(!queue.isEmpty()){
            int num = queue.remove(0);
            if(num==print.get(0)){
                print.remove(0);
                answer++;
                if(index==0) System.out.println(answer);
            }else{
                queue.add(num);
            }
            index--;
            if (index == -1) index = print.size()-1;
        }

        System.out.println(answer);
    }

    @Override
    public <T> void printResult(T object) {

    }

}

