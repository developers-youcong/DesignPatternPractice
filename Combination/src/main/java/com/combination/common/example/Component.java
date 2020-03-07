package com.combination.common.example;


/**
 * 抽象构件
 */
public abstract class Component {


    //个体和整体都具有的共享
    public void doSomething() {

        //编写业务逻辑
        System.out.println("执行业务逻辑");
    }


}
