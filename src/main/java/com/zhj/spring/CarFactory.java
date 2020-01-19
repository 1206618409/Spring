package com.zhj.spring;

public class CarFactory {
    public Car getCar(String name) throws Exception{
        if (name.equals("audi")){
            return new Audi();

        }else {
            throw  new Exception("暂时没法生产这款车");
        }
    }
}
