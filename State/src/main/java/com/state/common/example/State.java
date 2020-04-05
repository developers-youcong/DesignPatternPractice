package com.state.common.example;

/**
 * 抽象环境角色
 */
public abstract class State {

    //定义一个环境角色，提供子类访问
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    //行为1
    public abstract void handle1();

    //行为2
    public abstract void handle2();
}
