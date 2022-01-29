package com.spring.algorithm.kakao.programmers.controller;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Controller;

@Controller
public class StartController {

    public static void main(String[] args) {
        AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
        // 알고리즘 클래스 선택
        String className = "최소직사각형";

        AbstractAlgorithm algorithm = (AbstractAlgorithm) container.getBean(className);
        algorithm.getMethodName().stream().sorted().forEach(name -> {
            algorithm.start(name);
        });

    }
}
