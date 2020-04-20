package com.birdge.common.example;

/**
 * 具体实现化角色
 */
public class ConcreteImplementor1 implements Implementor {
    public void doSomething() {
        System.out.println("业务逻辑处理 ConcreteImplementor1 doSomething");
    }

    public void doAnything() {

        System.out.println("业务逻辑层处理 ConcreteImplementor1 doAnything");

    }
}
