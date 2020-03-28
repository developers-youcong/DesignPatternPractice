package com.facade.common.example.two;

/**
 * 场景类二
 */
public class Client2 {


    public static void main(String[] args) {

        //现代化邮局，有这项服务，邮局名称叫YC
        ModenPostOffice postOffice = new ModenPostOffice();

        //你只要把信的内容和收信人地址给他，他就会帮你完成一系列的工作

        //定义一个地址
        String address = "China";

        //信的内容
        String context = "Hello YC";

        //你给我发送把
        postOffice.sendLetter(address, context);

    }
}
