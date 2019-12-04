package com.spring.algorithm.kakao.programmers.stack;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * 다리를 지나는 트럭
 */

@Service("stack3")
public class Stack3 extends AbstractAlgorithm {

    private int bridge_length;
    private int weight;
    private int[] truck_weights;


    public Stack3() {
        this.bridge_length = 11;
        this.weight = 20;
//        this.truck_weights = new int[]{1,5,10,18,5,2,4,6,7,8,9,11,15,4,5,4,5,7,7,1,1,1,6,8,10};
        this.truck_weights = new int[]{1, 5, 10, 5, 2, 5, 7, 7, 1, 1, 1, 6, 8, 10};
    }

    public int test1() {
        int sumWeight = 0;
        int nextTruckWeight = 0;
        int startIndex = 0;
        List<Integer> bridge = new ArrayList<>();
        for (int i = 0; i < truck_weights.length; i++) {

            for (int j = 0; j < bridge_length; j++) {

                if (j == 0) {
                    bridge.add(truck_weights[i]);
                } else {
                    bridge.add(0);
                }

                if (bridge.size() - bridge_length < 0) {
                    startIndex = 0;
                } else {
                    startIndex = bridge.size() - bridge_length + 1;
                }

                // 현재무게
                sumWeight = bridge.subList(startIndex, bridge.size())
                        .stream().reduce(0, Integer::sum);
                // 다음무게
                if (i == truck_weights.length - 1) {
                    nextTruckWeight = sumWeight;
                } else {
                    nextTruckWeight = sumWeight + truck_weights[i + 1];
                }

                if (nextTruckWeight <= weight && (i != truck_weights.length - 1)) break;
            }
        }
        return bridge.size() + 1;
    }

    public int solution1() {
        int answer = 0;

        //다리를 건너기 전에 대기 트럭 리스트
        Queue<Truck> q_wait = new LinkedList<>();

        //다리를 건너는 트럭 리스트
        Queue<Truck> q_onBridge = new LinkedList<>();

        int onBridgeWeight = 0;

        for (int w : truck_weights) {
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
            if (q_onBridge.peek().index > bridge_length) {
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

        return answer;
    }

    public int solution2() {
        Stack<Integer> truckStack = new Stack<>();
        Map<Integer, Integer> bridgeMap = new HashMap<>();

        for (int i = truck_weights.length - 1; i >= 0; i--)
            truckStack.push(truck_weights[i]);

        int answer = 0;
        int sum = 0;
        while (true) {
            answer++;

            if (bridgeMap.containsKey(answer))
                bridgeMap.remove(answer);

            sum = bridgeMap.values().stream().mapToInt(Number::intValue).sum();

            if (!truckStack.isEmpty())
                if (sum + truckStack.peek() <= weight)
                    bridgeMap.put(answer + bridge_length, truckStack.pop());

            if (bridgeMap.isEmpty() && truckStack.isEmpty()) break;
        }
        return answer;
    }


    @Override
    public <T> void printResult(T object) {
        T answer = object;
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
}
