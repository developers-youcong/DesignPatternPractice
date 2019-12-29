package com.prototype.common.example;

/**
 * 原型模式通用源码
 */
public class PrototypeClass implements Cloneable {


    public PrototypeClass clone() throws CloneNotSupportedException {

        PrototypeClass prototypeClass = null;


        try {
            prototypeClass = (PrototypeClass) super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return prototypeClass;

    }

}
