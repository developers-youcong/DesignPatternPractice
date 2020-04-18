package com.flyweight.common.example;

public class Client {

    public static void main(String[] args) {
        //在对象池中初始化4个对象
        SignInfoFactory.getSignInfo("科目1");

        SignInfoFactory.getSignInfo("科目2");

        SignInfoFactory.getSignInfo("科目3");

        SignInfoFactory.getSignInfo("科目4");

        //取得对象
        SignInfo signInfo = SignInfoFactory.getSignInfo("科目2");

        while (true) {
            signInfo.setId("zhangsan");

            signInfo.setLocation("zhangsan");

            new MultiThread(signInfo).start();

            signInfo.setId("lisi");

            signInfo.setLocation("lisi");

            new MultiThread(signInfo).start();
        }
    }

}
