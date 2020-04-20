package com.birdge.common.example;

public class RefindAbstraction extends Abstraction {

    public RefindAbstraction(Implementor _imp) {
        super(_imp);
    }

    //修正父类的行为
    public void request() {
        /**
         * 业务处理
         */
        super.request();

        super.getImp().doAnything();
    }
}
