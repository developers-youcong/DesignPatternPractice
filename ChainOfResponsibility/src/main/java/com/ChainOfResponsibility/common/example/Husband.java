package com.ChainOfResponsibility.common.example;

public class Husband extends Handler {

    public Husband() {
        super(Handler.HUSBAND_LEVEL_REQUEST);
    }

    protected void response(IWomen women) {

        System.out.println("----妻子向丈夫请示----");

        System.out.println(women.getRequest());


        System.out.println("丈夫的答复是:同意\n");
    }
}
