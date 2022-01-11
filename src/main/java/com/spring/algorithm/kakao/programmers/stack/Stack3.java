package com.spring.algorithm.kakao.programmers.stack;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 다리를 지나는 트럭
 */

@Service("stack3")
public class Stack3 extends AbstractAlgorithm {

    private int bridgeLength;
    private int weight;
    private int[] truckWeights;


    public Stack3() {
//        this.bridgeLength = 11;
//        this.weight = 20;
////        this.truckWeights = new int[]{1,5,10,18,5,2,4,6,7,8,9,11,15,4,5,4,5,7,7,1,1,1,6,8,10};
//        this.truckWeights = new int[]{1, 5, 10, 5, 2, 5, 7, 7, 1, 1, 1, 6, 8, 10};
        this.bridgeLength = 100;
        this.weight = 100;
        this.truckWeights = new int[]{10,10,10,10,10,10,10,10,10,10};
    }

    public void test1() {
        int sumWeight = 0;
        int nextTruckWeight = 0;
        int startIndex = 0;
        List<Integer> bridge = new ArrayList<>();
        for (int i = 0; i < truckWeights.length; i++) {

            for (int j = 0; j < bridgeLength; j++) {

                if (j == 0) {
                    bridge.add(truckWeights[i]);
                } else {
                    bridge.add(0);
                }

                if (bridge.size() - bridgeLength < 0) {
                    startIndex = 0;
                } else {
                    startIndex = bridge.size() - bridgeLength + 1;
                }

                // 현재무게
                sumWeight = bridge.subList(startIndex, bridge.size())
                        .stream().reduce(0, Integer::sum);
                // 다음무게
                if (i == truckWeights.length - 1) {
                    nextTruckWeight = sumWeight;
                } else {
                    nextTruckWeight = sumWeight + truckWeights[i + 1];
                }

                if (nextTruckWeight <= weight && (i != truckWeights.length - 1)) break;
            }
        }
        System.out.println(bridge.size() + 1);
    }

    public void solution1() {
        int answer = 0;

        //다리를 건너기 전에 대기 트럭 리스트
        Queue<Truck> q_wait = new LinkedList<>();

        //다리를 건너는 트럭 리스트
        Queue<Truck> q_onBridge = new LinkedList<>();

        int onBridgeWeight = 0;

        for (int w : truckWeights) {
            q_wait.add(new Truck(w, 0));
        }

        onBridgeWeight += q_wait.peek().weight;
        q_onBridge.add(q_wait.poll());

        int time = 0;

        while (!q_onBridge.isEmpty()) {
            time++;

            for (Truck t : q_onBridge) {
                //다리위 트럭들을 움직임
                t.index++;
            }

            //트럭이 다리 끝에 다다름
            if (q_onBridge.peek().index > bridgeLength) {
                onBridgeWeight -= q_onBridge.poll().weight;
            }

            //대기 중 트럭을 다리에 올림 (무게 고려해야함 )
            if (!q_wait.isEmpty() && q_wait.peek().weight + onBridgeWeight <= weight) {
                onBridgeWeight += q_wait.peek().weight;
                q_wait.peek().index++;
                q_onBridge.add(q_wait.poll());
            }
        } //while 끝

        answer = time;

        System.out.println(answer);
    }

    static class Truck {
        int weight;
        int index;

        public Truck(int weight, int index) {
            this.weight = weight;
            this.index = index;
        }
    }

    public void solution2() {
        Stack<Integer> truckStack = new Stack<>();
        Map<Integer, Integer> bridgeMap = new HashMap<>();

        for (int i = truckWeights.length - 1; i >= 0; i--)
            truckStack.push(truckWeights[i]);

        int answer = 0;
        int sum = 0;
        while (true) {
            answer++;

            if (bridgeMap.containsKey(answer))
                bridgeMap.remove(answer);

            sum = bridgeMap.values().stream().mapToInt(Number::intValue).sum();

            if (!truckStack.isEmpty())
                if (sum + truckStack.peek() <= weight)
                    bridgeMap.put(answer + bridgeLength, truckStack.pop());

            if (bridgeMap.isEmpty() && truckStack.isEmpty()) break;
        }
        System.out.println(answer);
    }

    public void solution3() {
        Queue<Integer> truckQueue = new LinkedList<>();
        int currentWeight = weight;
        int idx = 0;
        int totalTime = 0;
        boolean flagWhile = true;
        int[] enterBridgeTime = new int[truckWeights.length];
        int outIdx = 0;

        while (flagWhile) {
            totalTime += 1;
            if (truckQueue.isEmpty()) {
                if (idx < truckWeights.length && currentWeight >= truckWeights[idx]) {
                    truckQueue.add(truckWeights[idx]);
                    currentWeight -= truckWeights[idx];
                    enterBridgeTime[idx] = totalTime;
                    idx += 1;
                }
            } else {

                if ((totalTime - enterBridgeTime[outIdx]) == bridgeLength) {
                    outIdx += 1;
                    currentWeight += truckQueue.poll();
                }

                if ((idx < truckWeights.length) && (currentWeight >= truckWeights[idx])) {
                    enterBridgeTime[idx] = totalTime;
                    truckQueue.add(truckWeights[idx]);
                    currentWeight -= truckWeights[idx];
                    idx += 1;
                }
            }
            if (idx == truckWeights.length && truckQueue.isEmpty()) {
                flagWhile = false;
            }
        }
        System.out.println(totalTime);
    }

    public void test2() {
        int answer = 0;
        int bridgeWeight = 0;
        Queue<Integer> truckQueue = new LinkedList<>(Arrays.stream(truckWeights).boxed().collect(Collectors.toList()));
        Queue<Integer> bridgeQueue = new LinkedList<>();
        while (!truckQueue.isEmpty()) {
            if (bridgeLength == bridgeQueue.size()) {
                bridgeWeight -= bridgeQueue.poll();
            }
            if (weight >= bridgeWeight + truckQueue.peek()) {
                bridgeWeight += truckQueue.peek();
                bridgeQueue.add(truckQueue.poll());
            } else {
                bridgeQueue.add(0);
            }
            answer++;
        }

        System.out.println(answer + bridgeLength);
    }


    @Override
    public <T> void printResult(T object) {
    }


}
