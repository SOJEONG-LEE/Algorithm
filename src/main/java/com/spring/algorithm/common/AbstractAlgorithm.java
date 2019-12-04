package com.spring.algorithm.common;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public abstract class AbstractAlgorithm {

    public void start(String methodName) {
        invokeMethod(methodName);
    }

    abstract public <T> void printResult(T answer);

    public void invokeMethod(String methodName) {
        Method method = null;
        try {
            method = getClass().getMethod(methodName);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        startLog(methodName);
        try {
            System.out.print("결과 : ");
            printResult(method.invoke(getClass().newInstance()));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }

    public List<String> getMethodName() {
        return Arrays.stream(getClass().getDeclaredMethods())
                .map(m -> m.getName())
                .filter(f -> f.startsWith("test") || f.startsWith("solution"))
                .collect(Collectors.toList());
    }

    protected void startLog(String name) {
        System.out.println("[ " + name + " ]");
    }

}
