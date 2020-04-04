package com.visitor.common.example;

/**
 * 具体元素
 */
public class ConcreteElement1 extends Element {

    //完善业务逻辑
    public void doSomething() {
        System.out.println("业务处理1");
    }

    public void accept(IVisitor visitor) {

        visitor.visit(this);
    }
}
