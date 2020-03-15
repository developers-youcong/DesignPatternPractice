package com.observer.common.example;

/**
 * 具体观察者
 */
public class ConcreteObserver implements Observer {


    public void update() {
        System.out.println("接收到信息，并进行处理");
    }


}
