package com.command.exmaple;

public class DeletePageCommand extends Command {

    public void execute() {

        //找到页面组
        super.pg.find();

        //删除一个页面
        super.pg.delete();

        //给出计划
        super.pg.plan();
    }
}
