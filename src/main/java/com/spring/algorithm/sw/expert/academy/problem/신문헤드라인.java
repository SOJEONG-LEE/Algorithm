package com.spring.algorithm.sw.expert.academy.problem;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service("신문헤드라인")
public class 신문헤드라인 extends AbstractAlgorithm {

    private String input;

    public 신문헤드라인() {
        this.input = "The_headline_is_the_text_indicating_the_nature_of_the_article_below_it.";
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        Scanner sc = new Scanner(System.in);
        String context = sc.next();
        System.out.println(context.toUpperCase());
    }


}
