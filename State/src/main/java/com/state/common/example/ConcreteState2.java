package com.state.common.example;

/**
 * 环境角色
 */
public class ConcreteState2 extends State {
    public void handle1() {
        //设置当前状态为state1
        super.context.setCurrentState(Context.STATE1);

        //过渡到state1状态，由Context实现
        super.context.handle1();

    }

    public void handle2() {

        //本状态下必须处理的逻辑
    }
}
