package com.facade.common.example.two;

/**
 * 场景类一
 */
public class Client {


    public static void main(String[] args) {
        //创建一个处理信件的过程
        ILetterProcess letterProcess = new LetterProcessImpl();

        //开始写信
        letterProcess.writeContext("Hello Facade Pattern");

        //开始写信封
        letterProcess.fillEnvelope("China");

        //把信放到信封里，并封装好
        letterProcess.letterInoteEnvelope();

        //跑到邮局把信塞到邮箱，投递
        letterProcess.sendLetter();
    }
}
