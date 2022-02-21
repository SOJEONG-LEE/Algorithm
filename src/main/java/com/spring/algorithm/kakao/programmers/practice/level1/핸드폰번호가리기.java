package com.spring.algorithm.kakao.programmers.practice.level1;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

@Service("핸드폰번호가리기")
public class 핸드폰번호가리기 extends AbstractAlgorithm {

    private String phone_number;

    public 핸드폰번호가리기() {
        this.phone_number = "01033334444";
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        String answer = "********************";
        phone_number.substring(phone_number.length()-5);
    }
}
