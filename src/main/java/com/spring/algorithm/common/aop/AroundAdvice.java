package com.spring.algorithm.common.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

@Service
@Aspect
public class AroundAdvice {

    @Around("PointcutCommon.allPointcut()")
    public Object aroundLog(ProceedingJoinPoint joinPoint) throws Throwable {
        String method = joinPoint.getSignature().getName();
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Object returnObj = joinPoint.proceed();
        stopWatch.stop();
        System.out.println("실행시간 : " + stopWatch.getTotalTimeMillis() + "(ms)초");
        System.out.println();
        return returnObj;
    }

}
