package com.zhj.spring;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestGetBean {
    /**
     * Spring 对对象的生产来说一共两种
     *  1、单例 singleton-- ws-- request-- session--- application 生命周期绑定
     *  new出来的prototype
     * @param args
     */
    public static void main(String[] args) throws Exception {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car = new CarFactory().getCar("audi");
        System.out.println(car.getName());

    }
}
