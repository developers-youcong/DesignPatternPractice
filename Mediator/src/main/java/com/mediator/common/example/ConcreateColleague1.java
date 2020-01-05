package com.mediator.common.example;

public class ConcreateColleague1 extends Colleague {

    public ConcreateColleague1(Mediator mediator) {
        super(mediator);
    }

    //自有方法self-method
    public void selfMethod1() {
        //处理自己的业务逻辑
    }

    //自有方法dep-method
    public void depMethod1() {
        //处理自己的业务逻辑

        //自己不能处理的业务逻辑，委托给中介者处理
        super.mediator.doSomething1();
    }
}
