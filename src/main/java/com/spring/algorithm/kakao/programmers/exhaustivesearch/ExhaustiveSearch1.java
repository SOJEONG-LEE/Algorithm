package com.spring.algorithm.kakao.programmers.exhaustivesearch;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service("exhaustivesearch1")
public class ExhaustiveSearch1 extends AbstractAlgorithm {

    private int[] answers;

    public ExhaustiveSearch1() {
        this.answers = new int[]{1,2,3,4,5};
//        this.answers = new int[]{1, 3, 2, 4, 2};
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        List<Integer> answer = new ArrayList<>();
        int[] student1 = new int[]{1, 2, 3, 4, 5};
        int[] student2 = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[][] studentList = new int[3][];
        studentList[0] = student1;
        studentList[1] = student2;
        studentList[2] = student3;

        int maxScore = 0;

        for (int e = 1; e < 4; e++) {
            int[] student = studentList[e - 1];
            int length = student.length;
            int score = IntStream.range(0, answers.length).filter(index -> answers[index] == student[index % length]).toArray().length;
            if (score == maxScore) {
                answer.add(e);
            } else if (score > maxScore) {
                answer.clear();
                answer.add(e);
                maxScore = score;
            }
        }
        System.out.println(answer);
    }

    public void test2(){
        int[] student1 = new int[]{1, 2, 3, 4, 5};
        int[] student2 = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[][] studentList = new int[3][];
        studentList[0] = student1;
        studentList[1] = student2;
        studentList[2] = student3;

        List<Integer> correctAnswer = Arrays.stream(studentList).map(student -> {
            int size = student.length;
            return IntStream.range(0, answers.length).filter(index -> answers[index] == student[index % size]).toArray().length;
        }).collect(Collectors.toList());

        int maxScore = Collections.max(correctAnswer);

        int[] answer = IntStream.range(1, 4).filter(f -> correctAnswer.get(f - 1).equals(maxScore)).toArray();
        System.out.println(Arrays.stream(answer).boxed().collect(Collectors.toList()));
    }

}
