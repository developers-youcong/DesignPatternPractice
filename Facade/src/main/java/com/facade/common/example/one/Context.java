package com.facade.common.example.one;

public class Context {

    //委托处理
    private ClassA a = new ClassA();

    private ClassC c = new ClassC();

    //复杂的计算
    public void complexMethod() {
        this.a.doSomethingA();
        this.c.doSomethingC();
    }

}
