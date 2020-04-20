package com.birdge.common.example;

/**
 * 场景类
 */
public class Client {


    public static void main(String[] args) {
        //定义一个实现化角色
        Implementor imp = new ConcreteImplementor1();

        //定义一个抽象化角色
        Abstraction abs = new RefindAbstraction(imp);

        //执行行文
        abs.request();
    }
}
