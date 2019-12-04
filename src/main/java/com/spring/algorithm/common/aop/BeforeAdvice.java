package com.spring.algorithm.common.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class BeforeAdvice {

    @Before("PointcutCommon.printResultPointcut()")
    public void beforeLog(JoinPoint joinPoint) {
        String method = joinPoint.getSignature().getName();
        System.out.println("[Result]");
    }
}
