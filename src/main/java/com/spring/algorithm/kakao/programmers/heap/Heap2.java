package com.spring.algorithm.kakao.programmers.heap;

import com.spring.algorithm.common.AbstractAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

@Service("heap2")
public class Heap2 extends AbstractAlgorithm {

    private int[][] jobs;

    public Heap2() {
        this.jobs = new int[][]{{0, 5}, {1, 2}, {5, 5}};
    }

    @Override
    public <T> void printResult(T answer) {

    }

    public void test1() {
        PriorityQueue<Disk> jobQueue = new PriorityQueue<>(Comparator.comparing(Disk::getRequestTime));
        PriorityQueue<Disk> workQueue = new PriorityQueue<>(Comparator.comparing(Disk::getProgressTime));

        List<Disk> diskList = Arrays.stream(jobs).map(m -> new Disk(m[0], m[1])).collect(Collectors.toList());
        jobQueue.addAll(diskList);

        int currentTime = 0;
        int answer = 0;

        while (!jobQueue.isEmpty() || !workQueue.isEmpty()) {
            while (!jobQueue.isEmpty() && jobQueue.peek().getRequestTime() <= currentTime) {
                workQueue.add(jobQueue.poll());
            }

            if (!workQueue.isEmpty()) {
                Disk disk = workQueue.poll();
                // answer += (currentTime + disk.getMinusTime());
                currentTime += disk.getProgressTime();
                answer += (currentTime - disk.getRequestTime());
            } else {
                currentTime++;
            }
        }

        System.out.println(answer / jobs.length);
    }

    public void test2() {
        int answer = 0;
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<int[]>((a, b) -> Integer.compare(a[0] + a[1], b[0] + b[1]));
        for (int[] job : jobs) {
            priorityQueue.add(job);
        }
        int time = 0;
        while (!priorityQueue.isEmpty()) {
            int[] job = priorityQueue.poll();
            answer += time >= job[0] ? job[1] + time - job[0] : job[1];
            time = time >= job[0] ? time + job[1] : job[0] + job[1];
        }

        System.out.println(answer / jobs.length);
    }

    class Disk {
        private int requestTime;
        private int progressTime;
        private int minusTime;

        public Disk(int requestTime, int progressTime) {
            this.requestTime = requestTime;
            this.progressTime = progressTime;
            this.minusTime = progressTime - requestTime;
        }

        public int getRequestTime() {
            return requestTime;
        }

        public void setRequestTime(int requestTime) {
            this.requestTime = requestTime;
        }

        public int getProgressTime() {
            return progressTime;
        }

        public void setProgressTime(int progressTime) {
            this.progressTime = progressTime;
        }

        public int getMinusTime() {
            return minusTime;
        }

        public void setMinusTime(int minusTime) {
            this.minusTime = minusTime;
        }

        @Override
        public String toString() {
            return "Disk{" +
                    "requestTime=" + requestTime +
                    ", progressTime=" + progressTime +
                    ", minusTime=" + minusTime +
                    '}';
        }
    }


}
