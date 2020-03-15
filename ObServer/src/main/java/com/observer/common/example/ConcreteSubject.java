package com.observer.common.example;


/**
 * 具体被观察者
 */
public class ConcreteSubject extends Subject {


    //具体业务
    public void doSomething() {


        /**
         * do something
         */
        super.notifyObserver();
    }

}
