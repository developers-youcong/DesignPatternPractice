package com.facade.common.example.two;

public class Police {

    //检查信件，检查完毕后警察在信封上盖个戳:此信无毒
    public void checkLetter(ILetterProcess letterProcess) {
        System.out.println(letterProcess + "信件已经检查过了.....");
    }
}
