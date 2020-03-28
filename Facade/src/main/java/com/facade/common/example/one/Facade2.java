package com.facade.common.example.one;

public class Facade2 {


    //被委托的对象
    private ClassA a = new ClassA();

    private ClassB b = new ClassB();

    private Context context = new Context();

    //提供外部访问的方法
    public void methodA() {
        this.a.doSomethingA();
    }


    public void methodB() {
        this.b.doSomethingB();
    }

    public void methodC() {
        this.context.complexMethod();
    }

}
