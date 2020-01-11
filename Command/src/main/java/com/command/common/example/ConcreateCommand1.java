package com.command.common.example;

/**
 * 具体的Command类
 */
public class ConcreateCommand1 extends Command {

    //对哪个Receiver类进行命令处理
    private Receiver receiver;

    //构造函数传递接收者
    public ConcreateCommand1(Receiver receiver) {
        this.receiver = receiver;
    }

    //必须实现一个命令
    public void execute() {
        //业务处理
        this.receiver.doSomething();
    }


}
