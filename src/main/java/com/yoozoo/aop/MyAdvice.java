package com.yoozoo.aop;

/**
 * Created on 2019/4/16.
 */
public class MyAdvice implements Advice {
    @Override
    public void beforeMethod() {
        System.out.println("beforeMethod!!!");
    }

    @Override
    public void afterMethod() {
        System.out.println("afterMethod!!!");
    }
}
