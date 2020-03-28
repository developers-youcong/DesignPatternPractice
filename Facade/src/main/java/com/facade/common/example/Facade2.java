package com.facade.common.example;

/**
 * 新增门面
 */
public class Facade2 {

    //引用原有的门面
    private Facade facade = new Facade();

    //对外提供唯一的访问子系统的方法
    public void methodB() {
        this.facade.methodB();
        ;
    }
}
