package com.mediator.example;

public class Mediator extends AbstractMediator {
    //中介者最重要的方法
    public void execute(String str, Object... objects) {
        if (str.equals("purchase.buy")) {
            //采购电器


        }

    }

    //采购电脑
    private void buyComputer(int number) {
        int saleStatus = super.sale.getSaleStatus();

        if (saleStatus > 80) { //销售情况
            System.out.println("采购IBM电脑:" + number + "台");

            super.stock.increase(number);
        } else { //销售情况不好

            int buyNumber = number / 2;//折半采购

            System.out.println("采购IBM电脑:" + buyNumber + "台");
        }
    }

    //折价销售电脑
    private void offSell() {
        System.out.println("折价销售IBM电脑:" + stock.getStockNumber() + "台");
    }


    //清仓处理
    private void clearStock() {
        //要求清仓销售
        super.sale.offSale();

        //要求采购人员不要采购
        super.purchase.refuseBuyIBM();
    }


}
