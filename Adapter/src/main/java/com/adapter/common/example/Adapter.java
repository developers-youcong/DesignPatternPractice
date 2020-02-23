package com.adapter.common.example;

/**
 * 适配器角色
 */
public class Adapter extends Adaptee implements Target {

    public void request() {

        super.doSomething();
    }
}
