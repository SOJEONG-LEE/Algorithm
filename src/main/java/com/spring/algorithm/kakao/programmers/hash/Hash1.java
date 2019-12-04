package com.spring.algorithm.kakao.programmers.hash;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Service("hash1")
public class Hash1 extends AbstractAlgorithm {

    private String[] participant;
    private String[] completion;

    public Hash1() {
        this.participant = new String[]{"mislav", "stanko", "mislav", "ana"};
        this.completion = new String[]{"stanko", "ana", "mislav"};
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {

        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                answer = participant[i];
            }
        }
        if (answer.length() == 0) {
            answer = participant[participant.length - 1];
        }
    }

    public static void test2() {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        String answer = "";

        Map<String, Integer> hParticipant = new HashMap<>();
        Map<String, Integer> hCompletion = new HashMap<>();

        for (int i = 0; i < participant.length; i++) {
            if (!hParticipant.containsKey(participant[i])) {
                hParticipant.put(participant[i], 1);
            } else {
                hParticipant.put(participant[i], hParticipant.get(participant[i]) + 1);
            }
        }

        for (int i = 0; i < completion.length; i++) {
            if (!hCompletion.containsKey(completion[i])) {
                hCompletion.put(completion[i], 1);
            } else {
                hCompletion.put(completion[i], hCompletion.get(completion[i]) + 1);
            }
        }

        for (int i = 0; i < participant.length; i++) {
            if (!hCompletion.containsKey(participant[i])) {
                answer = participant[i];
                break;
            } else if (hParticipant.get(participant[i]) - hCompletion.get(participant[i]) == 1) {
                answer = participant[i];
                break;
            }
        }

        System.out.println(answer);
    }

    public static void test3() {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion) hm.put(player, hm.get(player) - 1);

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0) {
                answer = key;
                break;
            }
        }

        System.out.println(answer);

    }
}
