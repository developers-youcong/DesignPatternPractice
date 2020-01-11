package com.command.exmaple;

public class Client {

    public static void main(String[] args) {

//        //首先客户找到需求组说，过来谈需求，并修改
//        System.out.println("-------客户要求增加一项需求-------");
//
//        Group rg = new RequirementGroup();
//
//        //找到需求组
//        rg.find();
//
//        //增加一个需求
//        rg.add();
//
//        //要求变更计划
//        rg.plan();

        //定义我们的接头人
        Invoker xiaosan = new Invoker();//接头人小三

        //客户要求增加一项需求
        System.out.println("客户要求增加一项需求");

        //客户给我们下命令来
        Command command = new AddRequirementCommand();

        //接头人接到命令
        xiaosan.setCommand(command);

        //接头人执行命令
        xiaosan.action();

    }
}
