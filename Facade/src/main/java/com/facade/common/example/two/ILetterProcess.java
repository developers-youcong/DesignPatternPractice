package com.facade.common.example.two;

/**
 * 写信过程接口
 */
public interface ILetterProcess {

    //首先要写信的内容
    public void writeContext(String context);


    //其次写信封
    public void fillEnvelope(String address);

    //把信放到信封里
    public void letterInoteEnvelope();

    //然后投递
    public void sendLetter();

}
