package com.mediator.example;

public class Purchase extends AbstractColleague {

    public Purchase(AbstractMediator _mediator) {
        super(_mediator);
    }

    public void buyIBMcomputer(int number) {
        super.mediator.execute("purchase buy", number);
    }

    public void refuseBuyIBM() {
        System.out.println("不再采购IBM电脑");
    }


}
