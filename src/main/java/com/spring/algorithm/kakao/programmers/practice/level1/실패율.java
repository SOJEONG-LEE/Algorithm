package com.spring.algorithm.kakao.programmers.practice.level1;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

@Service("실패율")
public class 실패율 extends AbstractAlgorithm {

    private int N;
    private int[] stages;

    public 실패율() {
        this.N = 8;
        this.stages = new int[]{1, 2, 3, 4, 5, 6, 7};
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        int[] answer = new int[N];

        Map<Integer, Integer> stageMap = new HashMap<>();
        Map<Integer, Integer> clearStageMap = new HashMap<>();
        PriorityQueue<Stage> queue = new PriorityQueue<>((a, b) -> {
            if(a.getFailureLate() == b.getFailureLate()) return Integer.compare(a.getStage(), b.getStage());
            else return Float.compare(b.getFailureLate(), a.getFailureLate());
        });

        for (int stage : stages) {
            if (stage <= N) stageMap.put(stage, stageMap.getOrDefault(stage, 0) + 1);
            else stageMap.put(N + 1, stageMap.getOrDefault(N + 1, 0) + 1);
        }

        for (int i = N + 1; i >= 1; i--) {
            int stage = stageMap.getOrDefault(i, 0);
            int clearStage = clearStageMap.getOrDefault(i + 1, 0) + stage;
            clearStageMap.put(i, clearStage);
            float failureLate = clearStage != 0 ? 100f * stage / clearStage : 0;
            if (i <= N) queue.add(new Stage(i, failureLate));
        }

        for (int i = 0; i < N; i++) {
            System.out.println(queue.peek().getStage() + " / " + queue.peek().getFailureLate());
            answer[i] = queue.poll().getStage();
        }

        System.out.println(Arrays.stream(answer).boxed().collect(Collectors.toList()));

    }

    public class Stage{

        private int stage;
        private float failureLate;

        public Stage(int stage, float failureLate){
            this.stage = stage;
            this.failureLate = failureLate;
        }

        public int getStage() {
            return stage;
        }

        public void setStage(int stage) {
            this.stage = stage;
        }

        public float getFailureLate() {
            return failureLate;
        }

        public void setFailureLate(float failureLate) {
            this.failureLate = failureLate;
        }

    }
}
