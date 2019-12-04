package com.spring.algorithm.common.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointcutCommon {

//    @Pointcut("execution(void com.spring.algorithm.*.*())")
    @Pointcut("execution(* start*(*))")
    public void allPointcut() {
    }

    @Pointcut("execution(* printResult*(*))")
    public void printResultPointcut() {
    }
}
