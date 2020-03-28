package com.facade.common.example.two;

/**
 * 现代化邮局
 */
public class ModenPostOffice {


    private ILetterProcess letterProcess = new LetterProcessImpl();

    private Police letterPolice = new Police();

    //写信，封装，投递，一体化
    public void sendLetter(String context, String address) {
        //帮你写信
        letterProcess.writeContext(context);

        //写好信封
        letterProcess.fillEnvelope(address);

        //警察要检查信件了
        letterPolice.checkLetter(letterProcess);

        //把信放到信封中
        letterProcess.letterInoteEnvelope();

        //邮递信件
        letterProcess.sendLetter();
    }

}


