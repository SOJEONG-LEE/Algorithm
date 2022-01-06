package com.spring.algorithm.kakao.programmers.hash;

import com.spring.algorithm.common.AbstractAlgorithm;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service("hash2")
public class Hash2 extends AbstractAlgorithm {

    private String[] phoneBook;

    public Hash2() {
//        this.phoneBook = new String[]{"119", "97674223", "1195524421"};
        this.phoneBook = new String[]{"12","143","1235","567","88"};
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        Boolean answer = true;

        Arrays.sort(phoneBook, (s1, s2) -> Integer.compare(s1.length(), s2.length()));

        String phone;
        for (int i = 0; i < phoneBook.length; i++) {
            phone = phoneBook[i];
            for (int j = i + 1; j < phoneBook.length; j++) {
                if (phone.equals(phoneBook[j].substring(0, phone.length()))) {
                    answer = false;
                    break;
                }
            }
            if (answer == false) break;
        }

        System.out.println(answer);
    }

    public void TEST2() {
        Boolean answer = true;

        Arrays.sort(phoneBook, (s1, s2) -> Integer.compare(s1.length(), s2.length()));

        String phone;
        for (int i = 0; i < phoneBook.length; i++) {
            phone = phoneBook[i];
            for (int j = i + 1; j < phoneBook.length; j++) {
                if (phoneBook[j].startsWith(phone)) {
                    answer = false;
                    break;
                }
            }
            if (answer == false) break;
        }

        System.out.println(answer);
    }

    public void test3() {
        Boolean answer = true;

        for (int i = 0; i < phoneBook.length - 1; i++) {
            for (int j = i + 1; j < phoneBook.length; j++) {
                if (phoneBook[i].startsWith(phoneBook[j])) {
                    answer = false;
                }
                if (phoneBook[j].startsWith(phoneBook[i])) {
                    answer = false;
                }
            }
        }

    }

    public void test4() {
        Arrays.sort(phoneBook);
        System.out.println(Arrays.stream(phoneBook).collect(Collectors.toList()));
        Map<String, List<String>> phoneBookMap = new HashMap<>();

        for (String phoneNumber : phoneBook) {
            String key = phoneNumber.substring(0, 1);
            if (phoneBookMap.containsKey(key)) phoneBookMap.get(key).add(phoneNumber);
            else phoneBookMap.put(key, new ArrayList<>(Collections.singleton(phoneNumber)));
        }

        for (String key : phoneBookMap.keySet()) {
            String[] value = phoneBookMap.get(key).toArray(new String[]{});
            System.out.println(Arrays.stream(value).collect(Collectors.toList()));
            for (int i = 0; i < value.length; i++) {
                for (int j = i + 1; j < value.length; j++) {
                    if (value[j].startsWith(value[i])){
                        System.out.println(Boolean.FALSE);
                        break;
                    }
                }
            }
        }
        System.out.println(Boolean.TRUE);
    }

    public void test5(){
        Arrays.sort(phoneBook);
        boolean result = Boolean.TRUE;
        for (int i=0; i<phoneBook.length-1; i++) {
            if (phoneBook[i+1].startsWith(phoneBook[i])) {
                result = Boolean.FALSE; break;
            }
        }
        System.out.println(result);
    }

}
