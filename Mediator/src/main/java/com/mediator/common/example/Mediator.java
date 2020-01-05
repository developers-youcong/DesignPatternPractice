package com.mediator.common.example;

public abstract class Mediator {

    //定义同事类
    protected ConcreateColleague1 c1;

    protected ConcreateColleague2 c2;

    public ConcreateColleague1 getC1() {
        return c1;
    }

    public void setC1(ConcreateColleague1 c1) {
        this.c1 = c1;
    }

    public ConcreateColleague2 getC2() {
        return c2;
    }

    public void setC2(ConcreateColleague2 c2) {
        this.c2 = c2;
    }

    //中介者模式的业务逻辑
    public abstract void doSomething1();

    public abstract void doSomething2();
}
