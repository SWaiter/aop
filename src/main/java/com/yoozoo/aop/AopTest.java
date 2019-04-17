package com.yoozoo.aop;

import java.io.InputStream;

/**
 * Created on 2019/4/16.
 */
public class AopTest {
    public static void main(String[] args) {
//        InputStream ips = AopTest.class.getResourceAsStream("resources/conf.properties");
        InputStream ips = AopTest.class.getResourceAsStream("/conf1.properties");
        Object bean = new BeanFactory(ips).getBean("aop");

        System.out.println(bean.getClass().getName());
        ((MyObjectInterface)bean).print();
    }
}
