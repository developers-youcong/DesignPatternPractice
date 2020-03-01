package com.iterator.example;

import java.util.Vector;

/**
 * 具体容器
 */
public class ConcreteAggregate implements Aggregate {


    //容纳对象的容器
    private Vector vector = new Vector();


    //增加一个元素
    public void add(Object object) {

        this.vector.add(object);
    }

    public void remove(Object object) {

        this.remove(object);
    }

    public Iterator iterator() {
        return new ConcreteIterator(this.vector);
    }
}
