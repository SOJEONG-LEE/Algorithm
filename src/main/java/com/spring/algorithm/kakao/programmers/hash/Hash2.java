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
        this.phoneBook = new String[]{"12", "123", "1235", "567", "88"};
//        this.phoneBook = {"12","123","1235","567","88"};
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

    public void test2() {
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

}
